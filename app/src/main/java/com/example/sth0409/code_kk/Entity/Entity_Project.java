package com.example.sth0409.code_kk.Entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.sqliteutil.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by STH0409 on 2016/11/15.
 */
@Table(name="t_user")
public class Entity_Project implements Parcelable {
    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }

    private   boolean isLike;
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

    @Table.Column(name="user_projectName",type= Table.Column.TYPE_STRING,isPrimaryKey=true)
    private String projectName;

    @Table.Column(name="user_createTime",type= Table.Column.TYPE_STRING)
    private String createTime;

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

    public Integer getExpiredTimes() {
        return expiredTimes;
    }

    public void setExpiredTimes(Integer expiredTimes) {
        this.expiredTimes = expiredTimes;
    }

    public Integer getUsedTimes() {
        return usedTimes;
    }

    public void setUsedTimes(Integer usedTimes) {
        this.usedTimes = usedTimes;
    }

    public Integer getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(Integer voteUp) {
        this.voteUp = voteUp;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
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

    @Table.Column(name="user_updateTime",type= Table.Column.TYPE_STRING)
    private String updateTime;

    @Table.Column(name="user_expiredTimes",type= Table.Column.TYPE_INTEGER)
    private Integer  expiredTimes;

    @Table.Column(name="user_usedTimes",type= Table.Column.TYPE_INTEGER)
    private Integer  usedTimes;

    @Table.Column(name="user_voteUp",type= Table.Column.TYPE_INTEGER)
    private Integer  voteUp;

    @Table.Column(name="user_recommend",type= Table.Column.TYPE_BOOLEAN)
    private Boolean  recommend;

    @Table.Column(name="user_hide",type= Table.Column.TYPE_BOOLEAN)
    private Boolean  hide;

    @Table.Column(name="user_projectUrl",type= Table.Column.TYPE_STRING)
    private String projectUrl;

    @Table.Column(name="user_desc",type= Table.Column.TYPE_STRING)
    private String desc;

    @Table.Column(name="user_demoUrl",type= Table.Column.TYPE_STRING)
    private String demoUrl;

    @Table.Column(name="user_committer",type= Table.Column.TYPE_STRING)
    private String committer;

    @Table.Column(name="user_source",type= Table.Column.TYPE_STRING)
    private String source;

    @Table.Column(name="user_lang",type= Table.Column.TYPE_STRING)
    private String lang;

    @Table.Column(name="user_authorName",type= Table.Column.TYPE_STRING)
    private String authorName;

    @Table.Column(name="user_authorUrl",type= Table.Column.TYPE_STRING)
    private String authorUrl;

    @Table.Column(name="user__id",type= Table.Column.TYPE_STRING)
    private String _id;

    @Table.Column(name="user_codeKKUrl",type= Table.Column.TYPE_STRING)
    private String codeKKUrl;

    @Table.Column(name="user_officialUrl",type= Table.Column.TYPE_STRING)
    private String officialUrl;

    @Table.Column(name="user_tags",type= Table.Column.TYPE_BLOB)
    private List<TagsBean> tags ;

    public Entity_Project() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.isLike ? (byte) 1 : (byte) 0);
        dest.writeString(this.projectName);
        dest.writeString(this.createTime);
        dest.writeString(this.updateTime);
        dest.writeValue(this.expiredTimes);
        dest.writeValue(this.usedTimes);
        dest.writeValue(this.voteUp);
        dest.writeValue(this.recommend);
        dest.writeValue(this.hide);
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
        dest.writeTypedList(this.tags);
    }

    protected Entity_Project(Parcel in) {
        this.isLike = in.readByte() != 0;
        this.projectName = in.readString();
        this.createTime = in.readString();
        this.updateTime = in.readString();
        this.expiredTimes = (Integer) in.readValue(Integer.class.getClassLoader());
        this.usedTimes = (Integer) in.readValue(Integer.class.getClassLoader());
        this.voteUp = (Integer) in.readValue(Integer.class.getClassLoader());
        this.recommend = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hide = (Boolean) in.readValue(Boolean.class.getClassLoader());
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
        this.tags = in.createTypedArrayList(TagsBean.CREATOR);
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
