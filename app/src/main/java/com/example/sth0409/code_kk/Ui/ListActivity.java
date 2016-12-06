package com.example.sth0409.code_kk.Ui;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;
import com.bumptech.glide.Glide;
import com.example.sqliteutil.DaoFactory;
import com.example.sqliteutil.DbSqlite;
import com.example.sqliteutil.IBaseDao;
import com.example.sth0409.code_kk.Adapter.Adapter_List;
import com.example.sth0409.code_kk.Adapter.Adapter_Project;
import com.example.sth0409.code_kk.Config.Configer;
import com.example.sth0409.code_kk.Entity.EntityDataMap;
import com.example.sth0409.code_kk.Entity.Entity_Project;
import com.example.sth0409.code_kk.Entity.SearchBean;
import com.example.sth0409.code_kk.MyAcitivity;
import com.example.sth0409.code_kk.R;
import com.example.sth0409.code_kk.Util.MyUtils;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.request.BaseRequest;

import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;
import com.superrecycleview.superlibrary.recycleview.ProgressStyle;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.wangyuwei.flipshare.FlipShareView;
import me.wangyuwei.flipshare.ShareItem;
import okhttp3.Call;
import okhttp3.Response;

/**
 * 改完bug，在公司电脑上更新下，加入了列表嵌套，基本能显示了，接下来就是buttomSheet了
 */
public class ListActivity extends MyAcitivity implements SuperRecyclerView.LoadingListener, FloatingSearchView.OnSearchListener {
    private List<EntityDataMap> entityDataMaps;
    private List<Entity_Project> entityProjects;

    private ProgressDialog progressDialog;
    @BindView(R.id.re_list_activity)
    SuperRecyclerView re_list_activity;
    @BindView(R.id.menu)
    ImageView imageView_menu;
    private int page = 2;
    private Adapter_List adapter_list;
    private int menu_type = 0;
    private IBaseDao<Entity_Project> userDAO;

    private FloatingSearchView searchView;
    private String currentQuery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ButterKnife.bind(this);

        searchView = (FloatingSearchView) findViewById(R.id.floating_search_view);
        searchView.setOnSearchListener(this);
        initSuperView();
        initTintBar();
        initSQL();
    }


    SearchBean.SearchDataBean searchDataBean;

    private void onSearch(String currentQuery) {
        OkGo.get("http://p.codekk.com/api/op/search?text=" + currentQuery + "&page=1")
                .tag(this)
                .cacheKey("cacheKey")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {

                        List<Entity_Project> entity_projects = new ArrayList<Entity_Project>();
                        try {
                            JSONObject object = new JSONObject(s).getJSONObject("data");
                            JSONArray array = object.getJSONArray("projectArray");

                            for (int i = 0; i < array.length(); i++) {
                                Entity_Project entity_project = new Gson().fromJson(array.getJSONObject(i).toString(), Entity_Project.class);
                                entity_projects.add(entity_project);
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                        adapter_project = new Adapter_Project(ListActivity.this, entity_projects);
                        re_list_activity.setAdapter(adapter_project);
                        adapter_project.setOnItemClickListener(new SuperBaseAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, Object item, int position) {
                                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                                intent.putExtra("project", (Parcelable) item);
                                startActivity(intent);
                            }
                        });
                    }

                    @Override
                    public void onAfter(String s, Exception e) {
                        re_list_activity.setRefreshing(false);
                        super.onAfter(s, e);
                    }
                });



    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @OnClick(R.id.menu)
    public void click() {
        initMenu();
    }

    private void initMenu() {
        FlipShareView share = new FlipShareView.Builder(this, imageView_menu)
                .addItem(new ShareItem("主页", Color.WHITE, 0xff43549C, BitmapFactory.decodeResource(getResources(), R.mipmap.icon_home)))
                .addItem(new ShareItem("收藏", Color.WHITE, 0xff4999F0, BitmapFactory.decodeResource(getResources(), R.mipmap.icon_like)))
                .addItem(new ShareItem("搜索", Color.WHITE, 0xffD9392D, BitmapFactory.decodeResource(getResources(), R.mipmap.icon_search)))
                .addItem(new ShareItem("日推", Color.WHITE, 0xffD9392D, BitmapFactory.decodeResource(getResources(), R.mipmap.icon_tui)))
                //    .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                .setBackgroundColor(0x60000000)
                //    .setItemDuration(500)
                .setSeparateLineColor(0x30000000)
                // .setAnimType(FlipShareView.TYPE_SLIDE)
                .create();
        share.setOnFlipClickListener(new FlipShareView.OnFlipClickListener() {
            @Override
            public void onItemClick(int position) {
                //  Toast.makeText(ListActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        menu_type = 0;
                        re_list_activity.setRefreshing(true);
                        break;
                    case 1:
                        menu_type = 1;
                        //queryAll();
                        re_list_activity.setRefreshing(true);
                        break;
                    case 2:
                        menu_type = 2;
                        searchView.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        menu_type = 3;
                        break;
                }
                if (searchView.getVisibility() == View.VISIBLE && menu_type != 2) {
                    searchView.setVisibility(View.GONE);
                }
            }

            @Override
            public void dismiss() {
            }
        });
    }


    /**
     * 创建db文件，创建表
     */
    private void initSQL() {
        SQLiteDatabase db = this.openOrCreateDatabase("mylikeproject.db", Context.MODE_PRIVATE, null);
        DbSqlite dbSqlite = new DbSqlite(this, db);
        userDAO = DaoFactory.createGenericDao(dbSqlite, Entity_Project.class);
        userDAO.createTable();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (data.getIntExtra("haveDel", -1) == 0) {
                re_list_activity.setRefreshing(true);
            }
        }
    }

    /**
     * 查询数据库所有数据
     */
    Adapter_Project adapter_project;

    private void queryAll() {

        List<Entity_Project> entity_projects = userDAO.queryAll();
        adapter_project = new Adapter_Project(ListActivity.this, entity_projects);
        adapter_project.setIs_like_type(1);
        adapter_project.setOnItemClickListener(new SuperBaseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, Object item, int position) {
                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                intent.putExtra("project", (Parcelable) item);
                startActivityForResult(intent, 111);
            }
        });
        re_list_activity.setAdapter(adapter_project);
        progressDialog.dismiss();
        re_list_activity.completeRefresh();
        for (int i = 0; i < entity_projects.size(); i++) {
            Log.i("-----", "queryAll: " + i + "--" + entity_projects.get(i).getProjectName());
        }
    }


    private void initTintBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
        }
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setTintColor(Color.parseColor("#702f64"));//通知栏所需颜色

    }

    @TargetApi(19)
    private void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    private void initSuperView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        re_list_activity.setLayoutManager(layoutManager);
        re_list_activity.setRefreshEnabled(true);//可以定制是否开启下拉刷新
        re_list_activity.setLoadMoreEnabled(true);//可以定制是否开启加载更多
        re_list_activity.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);//可以自定义下拉刷新的样式
        re_list_activity.setLoadingMoreProgressStyle(ProgressStyle.BallClipRotate);//可以自定义上拉加载的样式
        re_list_activity.setLoadingListener(this);
        re_list_activity.setRefreshing(true);
        //   superRecyclerView.setArrowImageView(R.mipmap.iconfont_downgrey);//设置下拉箭头


    }

    @Override
    public void onRefresh() {

        progressDialog = new ProgressDialog(ListActivity.this);
        progressDialog.setTitle("加载中，请稍等");
        progressDialog.show();
        switch (menu_type) {
            case 0:
                if (entityDataMaps != null) {
                    entityDataMaps.clear();
                    entityDataMaps = null;
                }
                if (entityProjects != null) {
                    entityProjects.clear();
                    entityProjects = null;
                }
                entityDataMaps = new ArrayList<>();
                entityProjects = new ArrayList<>();

                if (adapter_project != null && adapter_project.mData != null && adapter_project.mData.size() != 0) {
                    Log.i(TAG, "onRefresh: " + adapter_project.mData.size());
                    adapter_project.mData.clear();
                    adapter_project.notifyDataSetChanged();
                }
                loadFirstNETData();

                break;
            case 1:
                queryAll();
                break;
            case 2:
                onSearch(currentQuery);
                break;
            case 3:
                break;
        }


    }

    /**
     * 加载更多网络数据
     */
    private void loadNEXTNETData() {
        String loadmore;
        loadmore = Configer.URL_GETMOREDATA(page);
        OkGo.get(loadmore).tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                //  .cacheMode(CacheMode.DEFAULT)    // 缓存模式，详细请看缓存介绍
                .execute(new StringCallback() {
                    @Override
                    public void onBefore(BaseRequest request) {
                        progressDialog.show();
                        // UI线程 请求网络之前调用
                        // 可以显示对话框，添加/修改/移除 请求参数
                        if (getNetStateIsNo()) {
                            showToast("没有网络！");
                            //  return;
                        }


                    }

                    @Override
                    public void onAfter(@Nullable String s, @Nullable Exception e) {
                        progressDialog.dismiss();
                        re_list_activity.completeLoadMore();
                    }

                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        // s 即为所需要的结果
                        page++;
                        List<EntityDataMap> entityDataMaps_new = new ArrayList<EntityDataMap>();
                        entityDataMaps_new = MyUtils.getEntitys(s, entityDataMaps);
                        entityDataMaps.addAll(entityDataMaps.size(), entityDataMaps_new);
                        adapter_list.notifyDataSetChanged();
//                        EntityDataMap entityDataMap = entityDataMaps.get(0);
//                        JSONArray jsonArrayProject = entityDataMap.getmArray();
//                        entityProjects = MyUtils.getProjectList(jsonArrayProject, entityProjects);
//                        Log.i("--------", "onSuccess: " + entityDataMap.getmDate() + ":" + entityProjects.get(0).getDesc());
//                        Toast.makeText(ListActivity.this, "onSuccess: " + entityDataMap.getmDate() + ":" + entityProjects.get(0).getDesc(), Toast.LENGTH_SHORT).show();
                    }
                });

    }

    /**
     * 加载最新网络数据
     */
    private void loadFirstNETData() {
        OkGo.get(Configer.URL_GETLATESTDATA).tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                //  .cacheMode(CacheMode.DEFAULT)    // 缓存模式，详细请看缓存介绍
                .execute(new StringCallback() {
                    @Override
                    public void onBefore(BaseRequest request) {
                        //  progressDialog.show();
                        // UI线程 请求网络之前调用
                        // 可以显示对话框，添加/修改/移除 请求参数
                        if (getNetStateIsNo()) {
                            showToast("没有网络！");
                            //    return;
                        }
                    }

                    @Override
                    public void onAfter(@Nullable String s, @Nullable Exception e) {
                        progressDialog.dismiss();

                        re_list_activity.completeRefresh();
                    }

                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        // s 即为所需要的结果
                        //    List<EntityDataMap> dataList=new ArrayList<>();

                        entityDataMaps = MyUtils.getEntitys(s, entityDataMaps);
                        adapter_list = new Adapter_List(ListActivity.this, entityDataMaps);
                        re_list_activity.setAdapter(adapter_list);
//                        EntityDataMap entityDataMap = entityDataMaps.get(0);
//                        JSONArray jsonArrayProject = entityDataMap.getmArray();
//                        entityProjects = MyUtils.getProjectList(jsonArrayProject, entityProjects);
//                        Log.i("--------", "onSuccess: " + entityDataMap.getmDate() + ":" + entityProjects.get(0).getDesc());
//                        Toast.makeText(ListActivity.this, "onSuccess: " + entityDataMap.getmDate() + ":" + entityProjects.get(0).getDesc(), Toast.LENGTH_SHORT).show();

                    }
                });
    }

    @Override
    public void onLoadMore() {
        if (menu_type != 0) {
            re_list_activity.completeLoadMore();
            return;
        }
        loadNEXTNETData();
    }


    @Override
    public void onSuggestionClicked(SearchSuggestion searchSuggestion) {

    }

    @Override
    public void onSearchAction(String currentQuery) {
        if (getNetStateIsNo()) {
            showToast("没有网络！");
            return;
        }
        this.currentQuery = currentQuery;
        onSearch(currentQuery);
        searchView.setVisibility(View.GONE);

        Log.i(TAG, "onSearchAction: " + currentQuery);
    }
}
