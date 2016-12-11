package com.example.sth0409.code_kk.Ui;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dou361.dialogui.DialogUIUtils;
import com.dou361.dialogui.listener.DialogUIListener;
import com.example.sth0409.code_kk.Config.Configer;
import com.example.sth0409.code_kk.Entity.OneHpBean;
import com.example.sth0409.code_kk.R;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.BitmapCallback;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Response;

public class OneDetailActivity extends AppCompatActivity {

    @BindView(R.id.iv_one_detail)
    ImageView ivOneDetail;
    @BindView(R.id.tv_one_content)
    TextView tvOneContent;
    @BindView(R.id.tv_one_author)
    TextView tvOneAuthor;
    private OneHpBean oneHpBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_detail);
        ButterKnife.bind(this);
        oneHpBean = getIntent().getParcelableExtra("one");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new Fade().setDuration(1000));
            getWindow().setExitTransition(new Fade().setDuration(1000));
        }
        initView();
        initTintBar();
    }

    private void initView() {
        Glide.with(this).load(oneHpBean.getHp_img_url()).centerCrop().into(ivOneDetail);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/jinglei_ziti.ttf");
        tvOneContent.setTypeface(typeFace);
        tvOneAuthor.setTypeface(typeFace);
        String[] strings = null;
        strings = oneHpBean.getHp_content().split("by");
        if (strings.length == 1) {
            strings = oneHpBean.getHp_content().split("from");
        }
        tvOneContent.setText(strings[0]);
        tvOneAuthor.setText("------" + strings[1]);


        ivOneDetail.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                DialogUIUtils.showMdAlert(OneDetailActivity.this, "保存图片", "确定要保存图片？", new DialogUIListener() {
                    @Override
                    public void onPositive() {
                        savePic();
                    }

                    @Override
                    public void onNegative() {

                    }

                }).show();


                return false;
            }
        });
    }

    private void savePic() {
        OkGo.get(oneHpBean.getHp_img_original_url())
                .tag(this)
                .execute(new BitmapCallback() {
                    @Override
                    public void onSuccess(Bitmap bitmap, Call call, Response response) {
                        savePicToSD(bitmap);
                    }
                });

    }

    private void savePicToSD(Bitmap bitmap) {
        File dirFile = new File(Configer.ALBUM_PATH);
        if(!dirFile.exists()){
            dirFile.mkdir();
        }
        try {
            File myCaptureFile = new File(Configer.ALBUM_PATH + oneHpBean.getHp_makettime()+".jpg");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(myCaptureFile));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bos);
            bos.flush();
            bos.close();
            Toast.makeText(OneDetailActivity.this, "保存成功！", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initTintBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
        }
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setTintColor(0x00000300);//通知栏所需颜色
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
}
