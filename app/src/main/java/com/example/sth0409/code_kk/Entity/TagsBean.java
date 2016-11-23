package com.example.sth0409.code_kk.Entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2016/11/23.
 */
public  class TagsBean implements Parcelable {
    /**
     * createTime : 2016-11-14T13:20:54.767Z
     * name : RecyclerView
     * userName : georgeyang1024
     * type : open-source-project
     */

    private String createTime;
    private String name;
    private String userName;
    private String type;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.createTime);
        dest.writeString(this.name);
        dest.writeString(this.userName);
        dest.writeString(this.type);
    }

    public TagsBean() {
    }

    protected TagsBean(Parcel in) {
        this.createTime = in.readString();
        this.name = in.readString();
        this.userName = in.readString();
        this.type = in.readString();
    }

    public static final Creator<TagsBean> CREATOR = new Creator<TagsBean>() {
        @Override
        public TagsBean createFromParcel(Parcel source) {
            return new TagsBean(source);
        }

        @Override
        public TagsBean[] newArray(int size) {
            return new TagsBean[size];
        }
    };
}

