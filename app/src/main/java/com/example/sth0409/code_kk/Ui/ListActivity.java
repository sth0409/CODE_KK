package com.example.sth0409.code_kk.Ui;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Window;
import android.view.WindowManager;

import com.example.sth0409.code_kk.Adapter.Adapter_List;
import com.example.sth0409.code_kk.Config.Configer;
import com.example.sth0409.code_kk.Entity.EntityDataMap;
import com.example.sth0409.code_kk.Entity.Entity_Project;
import com.example.sth0409.code_kk.R;
import com.example.sth0409.code_kk.Util.MyUtils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.request.BaseRequest;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.superrecycleview.superlibrary.recycleview.ProgressStyle;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Response;

/**
 * 改完bug，在公司电脑上更新下，加入了列表嵌套，基本能显示了，接下来就是buttomSheet了
 */
public class ListActivity extends AppCompatActivity implements SuperRecyclerView.LoadingListener {
    List<EntityDataMap> entityDataMaps;
    List<Entity_Project> entityProjects;

    ProgressDialog progressDialog;
    @BindView(R.id.re_list_activity)
    SuperRecyclerView re_list_activity;
    private int i = 2;
    Adapter_List adapter_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        initSuperView();
        initTintBar();
    }

    private void initTintBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
        }

        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setTintColor(Color.parseColor("#9000FF"));//通知栏所需颜色

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
        if (entityDataMaps != null) {
            entityDataMaps = null;
        }
        if (entityProjects != null) {
            entityProjects = null;
        }
        entityDataMaps = new ArrayList<>();
        entityProjects = new ArrayList<>();
        progressDialog = new ProgressDialog(ListActivity.this);
        progressDialog.setTitle("加载中，请稍等");
        OkGo.get(Configer.URL_GETLATESTDATA).tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                //  .cacheMode(CacheMode.DEFAULT)    // 缓存模式，详细请看缓存介绍
                .execute(new StringCallback() {
                    @Override
                    public void onBefore(BaseRequest request) {
                        progressDialog.show();
                        // UI线程 请求网络之前调用
                        // 可以显示对话框，添加/修改/移除 请求参数
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
        String loadmore;
        loadmore = Configer.URL_GETMOREDATA(i);
        OkGo.get(loadmore).tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                //  .cacheMode(CacheMode.DEFAULT)    // 缓存模式，详细请看缓存介绍
                .execute(new StringCallback() {
                    @Override
                    public void onBefore(BaseRequest request) {
                        progressDialog.show();
                        // UI线程 请求网络之前调用
                        // 可以显示对话框，添加/修改/移除 请求参数
                    }

                    @Override
                    public void onAfter(@Nullable String s, @Nullable Exception e) {
                        progressDialog.dismiss();
                        re_list_activity.completeLoadMore();
                    }

                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        // s 即为所需要的结果
                        i++;
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
}
