package com.example.sth0409.code_kk.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;


import com.example.sth0409.code_kk.Entity.EntityDataMap;
import com.example.sth0409.code_kk.Entity.Entity_Project;

import com.example.sth0409.code_kk.R;
import com.example.sth0409.code_kk.Ui.DetailActivity;
import com.example.sth0409.code_kk.Util.MyUtils;
import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/21.
 */
public class Adapter_List extends SuperBaseAdapter<EntityDataMap> {
    private  Context context;


    public Adapter_List(Context context) {
        super(context);
        this.context=context;
    }

    public Adapter_List(Context context, List<EntityDataMap> data) {
        super(context, data);
        this.context=context;
    }

    @Override
    protected void convert(BaseViewHolder holder, final EntityDataMap item1, int position) {
        holder.setText(R.id.item_day,item1.getmDate());
        SuperRecyclerView recyclerView_item=holder.getView(R.id.item_re);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView_item.setLayoutManager(layoutManager);
        recyclerView_item.setRefreshEnabled(false);//可以定制是否开启下拉刷新
        recyclerView_item.setLoadMoreEnabled(false);//可以定制是否开启加载更多
        JSONArray jsonArrayProject = null;
        try {
            jsonArrayProject = new JSONArray(item1.getJsonArray());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        List<Entity_Project> entityProjects=new ArrayList<>();
        entityProjects = MyUtils.getProjectList(jsonArrayProject, entityProjects);
        Adapter_Project adapter_project=new Adapter_Project(context,entityProjects);
        adapter_project.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, Object item, int position) {
                Intent intent=new Intent(context, DetailActivity.class);
                intent.putExtra("project", (Parcelable) item);
                context.startActivity(intent);
            }
        });
        recyclerView_item.setAdapter(adapter_project);
    }

    @Override
    protected int getItemViewLayoutId(int position, EntityDataMap item) {
        return R.layout.item_list_activity;
    }
}
