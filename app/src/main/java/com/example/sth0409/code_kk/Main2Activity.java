package com.example.sth0409.code_kk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.example.sth0409.code_kk.Util.MyUtils;
import butterknife.BindView;
import butterknife.ButterKnife;



public class Main2Activity extends AppCompatActivity {


    @BindView(R.id.webView)
    WebView webView;
    String result;
    String Url = "http://p.codekk.com/detail/Android/CarGuo/GSYVideoPlayer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                result = MyUtils.parseAndformatHtml(Url);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        initWebView();
                        webView.loadDataWithBaseURL(null, result, "text/html", "utf-8", null);
                    }
                });
            }
        }).start();

    }
    private void initWebView() {
        WebSettings ws = webView.getSettings();
        webView.setVerticalScrollBarEnabled(false);
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


}
