package com.example.sth0409.code_kk.Config;

/**
 * Created by STH0409 on 2016/11/15.
 */

public class Configer {
    /***
     * 获取最新数据
     */
    public static final String URL_GETLATESTDATA = "http://p.codekk.com/api/op/page/0?type=mix";

    /***
     * 获取更多数据，用于上拉加载
     *
     * @param i i>=2;
     * @return
     */
    public static String URL_GETMOREDATA(int i) {
        return "http://p.codekk.com/api/op/page/" + i + "?type=mix";
    }

    /***
     * 搜索功能
     *
     * @param searchMessage 搜索的信息
     * @return
     */
    public static String URL_GETSEARCHDATA(String searchMessage) {
        return "http://p.codekk.com/api/op/search?text=" + searchMessage + "&page=1";
    }

    /***
     * ONE一个 接口 追加月份
     */
    public static final String URL_ONE_HOT_DATA = "http://v3.wufazhuce.com:8000/api/hp/bymonth/";
}
