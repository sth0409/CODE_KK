package com.example.sth0409.code_kk;

import android.app.ProgressDialog;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.sth0409.code_kk.Config.Configer;
import com.example.sth0409.code_kk.Entity.EntityDataMap;
import com.example.sth0409.code_kk.Entity.Entity_Project;
import com.example.sth0409.code_kk.Util.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.request.BaseRequest;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    List<EntityDataMap> entityDataMaps;
    List<Entity_Project> entityProjects;
ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entityDataMaps = new ArrayList<>();
        entityProjects = new ArrayList<>();
        progressDialog=new ProgressDialog(MainActivity.this);
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
                    }

                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        // s 即为所需要的结果

                        entityDataMaps = Utils.getEntitys(s, entityDataMaps);
                        EntityDataMap entityDataMap = entityDataMaps.get(0);
                        JSONArray jsonArrayProject = entityDataMap.getmArray();
                        entityProjects = Utils.getProjectList(jsonArrayProject, entityProjects);
                        Log.i("--------", "onSuccess: " + entityDataMap.getmDate() + ":" + entityProjects.get(0).getDesc());
                        Toast.makeText(MainActivity.this, "onSuccess: " + entityDataMap.getmDate() + ":" + entityProjects.get(0).getDesc(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
