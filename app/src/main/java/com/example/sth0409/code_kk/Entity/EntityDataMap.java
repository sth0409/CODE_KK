package com.example.sth0409.code_kk.Entity;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONArray;

/**
 * Created by STH0409 on 2016/11/15.
 */

public class EntityDataMap implements Parcelable {
    public String mDate;
    public JSONArray mArray;

    public EntityDataMap() {
    }

    public EntityDataMap(String mDate, JSONArray mArray) {
        this.mDate = mDate;
        this.mArray = mArray;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mDate);
        dest.writeParcelable((Parcelable) this.mArray, flags);
    }

    protected EntityDataMap(Parcel in) {
        this.mDate = in.readString();
        this.mArray = in.readParcelable(JSONArray.class.getClassLoader());
    }

    public static final Parcelable.Creator<EntityDataMap> CREATOR = new Parcelable.Creator<EntityDataMap>() {
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
