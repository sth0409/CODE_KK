package com.example.sth0409.code_kk.Util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Administrator on 2016/11/29.
 * public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
 * public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
 * public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;
 * public static final int TYPE_BLUETOOTH = 7;
 * public static final int TYPE_DUMMY = 8;
 * public static final int TYPE_ETHERNET = 9;
 * public static final int TYPE_MOBILE = 0;
 * public static final int TYPE_MOBILE_DUN = 4;
 * public static final int TYPE_MOBILE_HIPRI = 5;
 * public static final int TYPE_MOBILE_MMS = 2;
 * public static final int TYPE_MOBILE_SUPL = 3;
 * public static final int TYPE_VPN = 17;
 * public static final int TYPE_WIFI = 1;
 * public static final int TYPE_WIMAX = 6;
 */
public class NetStareUtils {
    /**
     * 判断是否有网络连接
     *
     * @param context
     * @return
     */
    public static boolean isNetworkConnected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }
        return false;
    }


    /**
     * 判断当前网络连接类型
     *
     * @param context
     * @return
     */
    public static int getConnectedType(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null && mNetworkInfo.isAvailable()) {
                return mNetworkInfo.getType();
            }
        }
        return -1;
    }


    /**
     * 判断是否为WIFI网络
     *
     * @param context
     * @return
     */
    public static final boolean isWifi(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkINfo = cm.getActiveNetworkInfo();

        if (networkINfo != null
                && networkINfo.getType() == ConnectivityManager.TYPE_WIFI) {
            return true;
        }
        return false;
    }
}
