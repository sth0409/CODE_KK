package com.example.sth0409.code_kk.Adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.sth0409.code_kk.Entity.Entity_Project;
import com.example.sth0409.code_kk.R;
import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/11/21.
 */
public class Adapter_Project extends SuperBaseAdapter<Entity_Project> {
Context context;
    public Adapter_Project(Context context) {

        super(context);
        this.context=context;
    }

    public Adapter_Project(Context context, List<Entity_Project> data) {
        super(context, data);
        this.context=context;
    }

    @Override
    protected void convert(BaseViewHolder holder, Entity_Project item, int position) {
        holder.setText(R.id.tv_item_card_title,item.getProjectName())
                .setText(R.id.tv_item_card_content,item.getDesc());
    }

    @Override
    protected int getItemViewLayoutId(int position, Entity_Project item) {
        return R.layout.item_project;
    }
}
