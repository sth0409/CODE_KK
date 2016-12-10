package com.example.sth0409.code_kk.Ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.sqliteutil.DaoFactory;
import com.example.sqliteutil.DbSqlite;
import com.example.sqliteutil.IBaseDao;
import com.example.sth0409.code_kk.Entity.Entity_Project;

import com.example.sth0409.code_kk.Entity.TagsBean;
import com.example.sth0409.code_kk.MyAcitivity;
import com.example.sth0409.code_kk.R;
import com.example.sth0409.code_kk.TagCloud.TagCloudView;
import com.example.sth0409.code_kk.Util.MyUtils;
import com.example.sth0409.code_kk.Util.NetStareUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


public class DetailActivity extends MyAcitivity implements TagCloudView.OnTagClickListener {


    private String result;
    private String Url = "";
    private String title;
    private String p_url;
    private String p_doc;
    private List<String> tags = new ArrayList<>();
    @BindView(R.id.tv_d_title)
    TextView tvDTitle;
    @BindView(R.id.tv_d_project_url)
    TextView tvDProjectUrl;
    @BindView(R.id.tv_d_project_doc)
    TextView tvDProjectDoc;
    @BindView(R.id.tag_cloud_view)
    TagCloudView tagCloudView;
    @BindView(R.id.web_content)
    WebView webContent;
    @BindView(R.id.tv_content_hand)
    TextView tvContentHand;
    @BindView(R.id.bottom_sheet)
    NestedScrollView bottomSheet;
    @BindView(R.id.coord1)
    CoordinatorLayout coord1;
    @BindView(R.id.iv_islike)
    ImageView ivIslike;
    String TAG = "DetailActivity";
    private List<TagsBean> tagsBeens;
    private Entity_Project entity_project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activuty_d);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        entity_project = intent.getParcelableExtra("project");
        initSQL();
        initUrlData();
        RxJavaLoadData();
    }

    private void initUrlData() {
        tagsBeens = new ArrayList<>();
        Url = entity_project.getCodeKKUrl();
        title = entity_project.getProjectName();
        p_url = entity_project.getProjectUrl();
        p_doc = entity_project.getDesc();
        tagsBeens = entity_project.getTags();
        Log.i(TAG, "onCreate: " + p_doc);
    }

    /**
     * 异步加载数据
     */
    private void RxJavaLoadData() {
        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                result = MyUtils.parseAndformatHtml(Url);
                subscriber.onNext(result);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {

            @Override
            public void call(String s) {
                Log.i(TAG, "onCreate: " + p_doc);
                initBottomSheet();
                initWeiget();
                initTagView();
                initWebView();
                setActionBar(title);
                webContent.loadDataWithBaseURL(null, s, "text/html", "utf-8", null);
            }
        });
    }

    /**
     * 查询项目是否存在
     *
     * @param query_entity_project 待查项目实体
     * @return 是否存在于数据库
     */
    private boolean querySQL(Entity_Project query_entity_project) {
        Entity_Project entity_project = userDAO.queryFirstRecord("user_projectName=?", query_entity_project.getProjectName());
        if (entity_project != null) {
            return true;
        }
        return false;
    }

    /**
     * 插入一条信息
     */
    private void insertSQL(Entity_Project entity_project) {
        userDAO.insert(entity_project);
    }

    private void delSQL(Entity_Project del_entity_project) {
        setResult(999, new Intent().putExtra("haveDel", 0));
        userDAO.delete("user_projectName=?", del_entity_project.getProjectName());
    }

    private IBaseDao<Entity_Project> userDAO;

    /**
     * 创建db文件，创建表
     */
    private void initSQL() {
        SQLiteDatabase db = this.openOrCreateDatabase("mylikeproject.db", Context.MODE_PRIVATE, null);
        DbSqlite dbSqlite = new DbSqlite(this, db);
        userDAO = DaoFactory.createGenericDao(dbSqlite, Entity_Project.class);
        userDAO.createTable();
    }

    /**
     * }UNIQUE constraint failed
     *
     * @param actionBar
     */
    private void setActionBar(String actionBar) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle(actionBar);
        getSupportActionBar().setElevation(0);
    }

    private void initBottomSheet() {
        final BottomSheetBehavior behavior = BottomSheetBehavior.from(bottomSheet);


        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                //这里是bottomSheet 状态的改变回调

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                //这里是拖拽中的回调，根据slideOffset可以做一些动画
                if (!getNetStateIsNo()) {
                    Log.i("------", "onSlide: " + slideOffset + "---" + behavior.getPeekHeight());
                    if (slideOffset > 0.8) {
                        tvContentHand.setVisibility(View.GONE);
                    }
                    if (slideOffset < 0.2) {

                        tvContentHand.setVisibility(View.VISIBLE);
                    }
                } else {
                    showToast("没有网络！");
                }


            }
        });
    }

    private boolean islike;

    private void initWeiget() {
        tvDTitle.setText(title);
        tvDProjectUrl.setText(p_url);
        tvDProjectDoc.setText(p_doc);
        checkIsLikebyRxJava();
    }

    private void checkIsLikebyRxJava() {
        Observable.create(new Observable.OnSubscribe<Boolean>() {
            @Override
            public void call(Subscriber<? super Boolean> subscriber) {
                //异步操作相关代码
                subscriber.onNext(islike = querySQL(entity_project));
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean data) {
                        if (data) {
                            Glide.with(DetailActivity.this).load(R.drawable.dolike).into(ivIslike);
                        }
                        // 主线程操作
                    }
                });


    }


    private void initTagView() {
        if (tagsBeens == null) {
            return;
        }
        for (int i = 0; i < tagsBeens.size(); i++) {
            tags.add(tagsBeens.get(i).getName());
            Log.i("----", "initTagView: " + tagsBeens.get(i).getName());
        }
        tagCloudView.setTags(tags);
        tagCloudView.setOnTagClickListener(this);
    }

    private void initWebView() {
        WebSettings ws = webContent.getSettings();
        webContent.setVerticalScrollBarEnabled(false);
        ws.setJavaScriptEnabled(true);
        ws.setBuiltInZoomControls(true);
        ws.setSupportZoom(true);
        ws.setUseWideViewPort(true);
        ws.setLoadWithOverviewMode(true);
     /*
        *  设置网页布局类型：
        *  1、LayoutAlgorithm.NARROW_COLUMNS ： 适应内容大小
        *  2、LayoutAlgorithm.SINGLE_COLUMN: 适应屏幕，内容将自动缩放
        *
        */
        ws.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

    }


    @Override
    public void onTagClick(int position) {
        if (position == -1) {
//            Toast.makeText(getApplicationContext(), "点击末尾文字",
//                    Toast.LENGTH_SHORT).show();
        } else {
//            Toast.makeText(getApplicationContext(), "点击 position : " + position,
//                    Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick({R.id.tv_d_project_url, R.id.iv_islike})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_d_project_url:
                AlertDialog alertDialog = new AlertDialog.Builder(DetailActivity.this)
                        .setMessage("是否打开" + p_url + "  ?")
                        .setNegativeButton("否", null)
                        .setPositiveButton("是", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if (getNetStateIsNo()) {
                                    Toast.makeText(DetailActivity.this, "没有网络！", Toast.LENGTH_SHORT).show();
                                    return;
                                }


                                Uri uri = Uri.parse(p_url);
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                            }
                        }).show();

                break;
            case R.id.iv_islike:
                Log.i(TAG, "onClick:-------- " + islike);
                if (!islike) {
                    insertSQL(entity_project);
                    Glide.with(DetailActivity.this).load(R.drawable.dolike).into(ivIslike);
                    islike = true;
                } else {
                    Glide.with(DetailActivity.this).load(R.drawable.dislike).into(ivIslike);
                    delSQL(entity_project);
                    islike = false;
                }
                break;
        }
    }


}
