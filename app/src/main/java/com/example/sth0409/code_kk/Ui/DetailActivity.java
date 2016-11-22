package com.example.sth0409.code_kk.Ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sth0409.code_kk.Entity.Entity_Project;
import com.example.sth0409.code_kk.R;
import com.example.sth0409.code_kk.TagCloud.TagCloudView;
import com.example.sth0409.code_kk.Util.MyUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DetailActivity extends AppCompatActivity implements TagCloudView.OnTagClickListener {


    String result;
    String Url = "";
    String title;
    String p_url;
    String p_doc;
    List<String> tags = new ArrayList<>();
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activuty_d);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Entity_Project entity_project = intent.getParcelableExtra("project");
        Url = entity_project.getCodeKKUrl();
        title = entity_project.getProjectName();
        p_url = entity_project.getDemoUrl();
        p_doc = entity_project.getDesc();
        new Thread(new Runnable() {
            @Override
            public void run() {
//ok
                result = MyUtils.parseAndformatHtml(Url);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        initBottomSheet();
                        initWeiget();
                        initTagView();
                        initWebView();
                        setActionBar(title);
                        webContent.loadDataWithBaseURL(null, result, "text/html", "utf-8", null);
                    }
                });
            }
        }).start();

    }
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
                Log.i("------", "onSlide: " + slideOffset + "---" + behavior.getPeekHeight());


                if (slideOffset > 0.8) {


                    tvContentHand.setVisibility(View.GONE);
                }
                if (slideOffset < 0.2) {

                    tvContentHand.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void initWeiget() {
        tvDTitle.setText(title);
        tvDProjectUrl.setText(p_url);
        tvDProjectDoc.setText(p_doc);
    }

    private void initTagView() {

        for (int i = 0; i < 20; i++) {
            tags.add("标签" + i);
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
            Toast.makeText(getApplicationContext(), "点击末尾文字",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "点击 position : " + position,
                    Toast.LENGTH_SHORT).show();
        }
    }
}
