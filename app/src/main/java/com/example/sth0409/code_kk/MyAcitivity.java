package com.example.sth0409.code_kk;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.sth0409.code_kk.Util.NetStareUtils;

/**
 * Created by Administrator on 2016/11/29.
 */
public class MyAcitivity extends AppCompatActivity {
    public String TAG = "---";

    protected boolean getNetStateIsNo() {
        return !(NetStareUtils.isNetworkConnected(this));
    }


    protected void showToast(String s) {
        Toast.makeText(MyAcitivity.this, s, Toast.LENGTH_SHORT).show();
    }

    protected void logi(String s) {
        Log.i(TAG, "logi: " + s);
    }

}
