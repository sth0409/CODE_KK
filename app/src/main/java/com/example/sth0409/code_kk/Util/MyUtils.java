package com.example.sth0409.code_kk.Util;

import com.example.sth0409.code_kk.Entity.EntityDataMap;
import com.example.sth0409.code_kk.Entity.Entity_Project;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by STH0409 on 2016/11/15.
 */

public class MyUtils {
    public static List<EntityDataMap> getEntitys(String jsonMessage, List<EntityDataMap> entityDataMaps) {
        String str2 = jsonMessage.replaceAll(" ", "");
        try {
            JSONObject jsonObject = new JSONObject(str2);
            JSONObject jsonObject_data = jsonObject.getJSONObject("data");
            JSONObject projectDateMap = jsonObject_data.getJSONObject("projectDateMap");
            for (Iterator<String> keys = projectDateMap.keys(); keys.hasNext(); ) {
                String key1 = keys.next();
                EntityDataMap entityDataMap = new EntityDataMap();
                entityDataMap.setmDate(key1);
                if (projectDateMap.get(key1) instanceof JSONArray) {
                    entityDataMap.setmArray((JSONArray) projectDateMap.get(key1));
                }
                entityDataMaps.add(entityDataMap);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return entityDataMaps;
    }

    public static List<Entity_Project> getProjectList(JSONArray jsonArrayProject, List<Entity_Project> entity_projects) {
        Gson gson = new Gson();
        for (int i = 0; i < jsonArrayProject.length(); i++) {
            try {
                Entity_Project entity_project = gson.fromJson(String.valueOf(jsonArrayProject.get(i)), Entity_Project.class);
                entity_projects.add(entity_project);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return entity_projects;
    }

    /**
     * 解析并格式化html 注意需要在子线程中
     * @param Url html网址
     * @return 所需要的元素节点内容
     */
    public static String parseAndformatHtml(String Url) {
        Document doc = null;
        Document content = null;
        String result= null;
        try {
            doc = Jsoup.connect(Url).get();
            content = Jsoup.parse(doc.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Android 上图片加载库 Fresco 的使用帮助类
        Element body = content.body();
        result=body.getElementsByClass("container theme-showcase")
                .first()
                .getElementsByClass("hero-unit border div-detail")
                .first()
                .getElementsByClass("border-top div-row").toString();
        return result;
    }
}
