package com.example.sth0409.code_kk.Adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.sth0409.code_kk.Entity.OneHpBean;
import com.example.sth0409.code_kk.R;
import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/12/10.
 */
public class Adapter_One extends SuperBaseAdapter<OneHpBean> {
    Context mContext;

    public Adapter_One(Context context) {
        super(context);
        mContext = context;
    }

    public Adapter_One(Context context, List<OneHpBean> data) {
        super(context, data);
        mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder holder, OneHpBean item, int position) {
        holder.setText(R.id.item_one_tv_title, item.getHp_content())
                .setText(R.id.item_one_tv_time, item.getHp_makettime().substring(0, 10));
        Glide.with(mContext).load(item.getHp_img_url()).centerCrop().into((ImageView) holder.getView(R.id.item_one_iv));
    }

    @Override
    protected int getItemViewLayoutId(int position, OneHpBean item) {
        return R.layout.item_one;
    }
}
