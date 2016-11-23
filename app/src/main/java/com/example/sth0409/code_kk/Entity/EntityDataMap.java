package com.example.sth0409.code_kk.Entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.sqliteutil.Table;

import org.json.JSONArray;

/**
 * Created by STH0409 on 2016/11/15.
 */

public class EntityDataMap implements Parcelable {
    public String mDate;
    public  String jsonArray;

    public EntityDataMap(String mDate, JSONArray mArray, String jsonArray) {
        this.mDate = mDate;
        this.mArray = mArray;
        this.jsonArray = jsonArray;
    }

    public JSONArray mArray;

    public EntityDataMap() {

    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public JSONArray getmArray() {
        return mArray;
    }

    public void setmArray(JSONArray mArray) {
        this.mArray = mArray;
    }

    public String getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(String jsonArray) {
        this.jsonArray = jsonArray;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mDate);
        dest.writeString(this.jsonArray);
    }

    protected EntityDataMap(Parcel in) {
        this.mDate = in.readString();
        this.jsonArray = in.readString();
    }

    public static final Creator<EntityDataMap> CREATOR = new Creator<EntityDataMap>() {
        @Override
        public EntityDataMap createFromParcel(Parcel source) {
            return new EntityDataMap(source);
        }

        @Override
        public EntityDataMap[] newArray(int size) {
            return new EntityDataMap[size];
        }
    };
}
