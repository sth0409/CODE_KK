package com.example.sth0409.code_kk.Util;

import com.example.sth0409.code_kk.Entity.EntityDataMap;
import com.example.sth0409.code_kk.Entity.Entity_Project;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by STH0409 on 2016/11/15.
 */

public class Utils {
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
        Gson gson=new Gson();
        for (int i=0;i<jsonArrayProject.length();i++){
            try {
                Entity_Project entity_project=gson.fromJson(String.valueOf(jsonArrayProject.get(i)), Entity_Project.class);
                entity_projects.add(entity_project);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return entity_projects;
    }
}
