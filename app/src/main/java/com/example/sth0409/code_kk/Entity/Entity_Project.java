package com.example.sth0409.code_kk.Entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by STH0409 on 2016/11/15.
 */

public class Entity_Project implements Parcelable {
    /**
     * projectName : DoubleScroll
     * createTime : 2016-11-14T13:20:54.767Z
     * updateTime : 2016-11-14T13:20:54.767Z
     * expiredTimes : 0
     * usedTimes : 0
     * voteUp : 0
     * recommend : false
     * hide : false
     * projectUrl : https://github.com/georgeyang1024/DoubleScroll
     * desc : 一个 ScrollView 里面包含 viewpager 嵌套 listview 或 RecyclerView 极少代码实现的流畅滑动效果
     * demoUrl :
     * tags : [{"createTime":"2016-11-14T13:20:54.767Z","name":"RecyclerView","userName":"georgeyang1024","type":"open-source-project"},{"createTime":"2016-11-14T13:20:54.767Z","name":"ViewPager","userName":"georgeyang1024","type":"open-source-project"},{"createTime":"2016-11-14T13:20:54.767Z","name":"ScrollView","userName":"georgeyang1024","type":"open-source-project"},{"createTime":"2016-11-14T13:20:54.767Z","name":"listview","userName":"georgeyang1024","type":"open-source-project"}]
     * committer : georgeyang1024
     * source : User
     * lang : Android
     * authorName : georgeyang1024
     * authorUrl : https:/github.com/georgeyang1024
     * _id : 5829ba36fa7a4c321862cd33
     * codeKKUrl : http://p.codekk.com/detail/Android/georgeyang1024/DoubleScroll
     * officialUrl : https://play.google.com/store/apps/details?id=org.anothermonitor
     */

    private String projectName;
    private String createTime;
    private String updateTime;
    private int expiredTimes;
    private int usedTimes;
    private int voteUp;
    private boolean recommend;
    private boolean hide;
    private String projectUrl;
    private String desc;
    private String demoUrl;
    private String committer;
    private String source;
    private String lang;
    private String authorName;
    private String authorUrl;
    private String _id;
    private String codeKKUrl;
    private String officialUrl;
    private List<TagsBean> tags ;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getExpiredTimes() {
        return expiredTimes;
    }

    public void setExpiredTimes(int expiredTimes) {
        this.expiredTimes = expiredTimes;
    }

    public int getUsedTimes() {
        return usedTimes;
    }

    public void setUsedTimes(int usedTimes) {
        this.usedTimes = usedTimes;
    }

    public int getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(int voteUp) {
        this.voteUp = voteUp;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDemoUrl() {
        return demoUrl;
    }

    public void setDemoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
    }

    public String getCommitter() {
        return committer;
    }

    public void setCommitter(String committer) {
        this.committer = committer;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCodeKKUrl() {
        return codeKKUrl;
    }

    public void setCodeKKUrl(String codeKKUrl) {
        this.codeKKUrl = codeKKUrl;
    }

    public String getOfficialUrl() {
        return officialUrl;
    }

    public void setOfficialUrl(String officialUrl) {
        this.officialUrl = officialUrl;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public static class TagsBean implements Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.projectName);
        dest.writeString(this.createTime);
        dest.writeString(this.updateTime);
        dest.writeInt(this.expiredTimes);
        dest.writeInt(this.usedTimes);
        dest.writeInt(this.voteUp);
        dest.writeByte(this.recommend ? (byte) 1 : (byte) 0);
        dest.writeByte(this.hide ? (byte) 1 : (byte) 0);
        dest.writeString(this.projectUrl);
        dest.writeString(this.desc);
        dest.writeString(this.demoUrl);
        dest.writeString(this.committer);
        dest.writeString(this.source);
        dest.writeString(this.lang);
        dest.writeString(this.authorName);
        dest.writeString(this.authorUrl);
        dest.writeString(this._id);
        dest.writeString(this.codeKKUrl);
        dest.writeString(this.officialUrl);
        dest.writeList(this.tags);
    }

    public Entity_Project() {
    }

    protected Entity_Project(Parcel in) {
        this.projectName = in.readString();
        this.createTime = in.readString();
        this.updateTime = in.readString();
        this.expiredTimes = in.readInt();
        this.usedTimes = in.readInt();
        this.voteUp = in.readInt();
        this.recommend = in.readByte() != 0;
        this.hide = in.readByte() != 0;
        this.projectUrl = in.readString();
        this.desc = in.readString();
        this.demoUrl = in.readString();
        this.committer = in.readString();
        this.source = in.readString();
        this.lang = in.readString();
        this.authorName = in.readString();
        this.authorUrl = in.readString();
        this._id = in.readString();
        this.codeKKUrl = in.readString();
        this.officialUrl = in.readString();
        this.tags = new ArrayList<TagsBean>();
        in.readList(this.tags, TagsBean.class.getClassLoader());
    }

    public static final Creator<Entity_Project> CREATOR = new Creator<Entity_Project>() {
        @Override
        public Entity_Project createFromParcel(Parcel source) {
            return new Entity_Project(source);
        }

        @Override
        public Entity_Project[] newArray(int size) {
            return new Entity_Project[size];
        }
    };
}
