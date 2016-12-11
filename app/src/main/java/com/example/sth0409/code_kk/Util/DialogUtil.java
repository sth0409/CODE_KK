package com.example.sth0409.code_kk.Util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

import com.dou361.dialogui.DialogUIUtils;
import com.example.sth0409.code_kk.R;

/**
 * Created by Administrator on 2016/12/10.
 * 需要依赖    compile 'com.dou361.dialogui:jjdxm-dialogui:1.0.1'//自定义Dialog
 * 需要使用 DensityUtil 进行dp到px的值的转换
 */
public class DialogUtil {
    /**
     * 在屏幕中心显示一个自定义view的Dialog
     *
     * @param activity    坐在的Activity
     * @param contentView 自定义布局文件  最外层布局为R
     * @param width       布局宽度 dp值
     * @param height      布局高度 dp值
     */
    public static void showCenterCustomDialog(Activity activity, int contentView, int width, int height) {
        View view = activity.getLayoutInflater().inflate(contentView, null);
        Dialog dialog = DialogUIUtils.showCustomAlert(activity, view, Gravity.CENTER).show();
        DialogUIUtils.dismiss();
        dialog.show();
        WindowManager.LayoutParams params =
                dialog.getWindow().getAttributes();
        params.width = DensityUtil.dip2px(activity, width);
        params.height = DensityUtil.dip2px(activity, height);
        dialog.getWindow().setAttributes(params);
    }

    public static void showCenterCustomDialog(Activity activity, View contentView, int width_px, int height_px) {

        Dialog dialog = DialogUIUtils.showCustomAlert(activity, contentView, Gravity.CENTER).show();
        DialogUIUtils.dismiss();
        dialog.show();
        WindowManager.LayoutParams params =
                dialog.getWindow().getAttributes();
        params.width = width_px;
        params.height = height_px;
        dialog.getWindow().setAttributes(params);
    }

}
