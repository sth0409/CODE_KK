package com.example.sth0409.code_kk.Entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.sqliteutil.Table;

/**
 * Created by Administrator on 2016/12/10.
 */
@Table(name="OneHpBeanTable")
public class OneHpBean implements Parcelable {
    /**
     * hpcontent_id : 1391
     * hp_title : VOL.1363
     * author_id : -1
     * hp_img_url : http://image.wufazhuce.com/FvEmpGsdb8f11DLSBadSojVDHlCW
     * hp_img_original_url : http://image.wufazhuce.com/FvEmpGsdb8f11DLSBadSojVDHlCW
     * hp_author : waiting&卜粒 作品
     * ipad_url : http://image.wufazhuce.com/FouBSWDMF5WxrnIlnsNZm5MRTeno
     * hp_content : 我的恋爱观只有四个字，比肩作战。如果下雨了，我们就打一把伞。如果没有伞，我们就撑一件大衣。如果没有大衣，有什么了不起的，大不了就一起淋啊。by 肖诗瑶
     * hp_makettime : 2016-06-30 23:00:00
     * hide_flag : 0
     * last_update_date : 2016-06-24 14:55:27
     * web_url : http://m.wufazhuce.com/one/1391
     * wb_img_url :
     * image_authors :
     * text_authors :
     * image_from :
     * text_from :
     * content_bgcolor : #FFFFFF
     * praisenum : 57134
     * sharenum : 6564
     * commentnum : 455
     */
    @Table.Column(name="hpcontent_id",type= Table.Column.TYPE_STRING)
    private String hpcontent_id;

    @Table.Column(name="hp_title",type= Table.Column.TYPE_STRING,isPrimaryKey=true)
    private String hp_title;

    @Table.Column(name="author_id",type= Table.Column.TYPE_STRING)
    private String author_id;

    @Table.Column(name="hp_img_url",type= Table.Column.TYPE_STRING)
    private String hp_img_url;

    @Table.Column(name="hp_img_original_url",type= Table.Column.TYPE_STRING)
    private String hp_img_original_url;

    @Table.Column(name="hp_author",type= Table.Column.TYPE_STRING)
    private String hp_author;

    @Table.Column(name="ipad_url",type= Table.Column.TYPE_STRING)
    private String ipad_url;

    @Table.Column(name="hp_content",type= Table.Column.TYPE_STRING)
    private String hp_content;

    @Table.Column(name="hp_makettime",type= Table.Column.TYPE_STRING)
    private String hp_makettime;

    @Table.Column(name="hide_flag",type= Table.Column.TYPE_STRING)
    private String hide_flag;

    @Table.Column(name="last_update_date",type= Table.Column.TYPE_STRING)
    private String last_update_date;

    @Table.Column(name="web_url",type= Table.Column.TYPE_STRING)
    private String web_url;

    @Table.Column(name="wb_img_url",type= Table.Column.TYPE_STRING)
    private String wb_img_url;

    @Table.Column(name="image_authors",type= Table.Column.TYPE_STRING)
    private String image_authors;

    @Table.Column(name="text_authors",type= Table.Column.TYPE_STRING)
    private String text_authors;

    @Table.Column(name="image_from",type= Table.Column.TYPE_STRING)
    private String image_from;

    @Table.Column(name="text_from",type= Table.Column.TYPE_STRING)
    private String text_from;

    @Table.Column(name="content_bgcolor",type= Table.Column.TYPE_STRING)
    private String content_bgcolor;

    @Table.Column(name="praisenum",type= Table.Column.TYPE_INTEGER)
    private int praisenum;

    @Table.Column(name="sharenum",type= Table.Column.TYPE_INTEGER)
    private int sharenum;

    @Table.Column(name="commentnum",type= Table.Column.TYPE_INTEGER)
    private int commentnum;


    public String getHpcontent_id() {
        return hpcontent_id;
    }

    public void setHpcontent_id(String hpcontent_id) {
        this.hpcontent_id = hpcontent_id;
    }

    public String getHp_title() {
        return hp_title;
    }

    public void setHp_title(String hp_title) {
        this.hp_title = hp_title;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getHp_img_url() {
        return hp_img_url;
    }

    public void setHp_img_url(String hp_img_url) {
        this.hp_img_url = hp_img_url;
    }

    public String getHp_img_original_url() {
        return hp_img_original_url;
    }

    public void setHp_img_original_url(String hp_img_original_url) {
        this.hp_img_original_url = hp_img_original_url;
    }

    public String getHp_author() {
        return hp_author;
    }

    public void setHp_author(String hp_author) {
        this.hp_author = hp_author;
    }

    public String getIpad_url() {
        return ipad_url;
    }

    public void setIpad_url(String ipad_url) {
        this.ipad_url = ipad_url;
    }

    public String getHp_content() {
        return hp_content;
    }

    public void setHp_content(String hp_content) {
        this.hp_content = hp_content;
    }

    public String getHp_makettime() {
        return hp_makettime;
    }

    public void setHp_makettime(String hp_makettime) {
        this.hp_makettime = hp_makettime;
    }

    public String getHide_flag() {
        return hide_flag;
    }

    public void setHide_flag(String hide_flag) {
        this.hide_flag = hide_flag;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public String getWb_img_url() {
        return wb_img_url;
    }

    public void setWb_img_url(String wb_img_url) {
        this.wb_img_url = wb_img_url;
    }

    public String getImage_authors() {
        return image_authors;
    }

    public void setImage_authors(String image_authors) {
        this.image_authors = image_authors;
    }

    public String getText_authors() {
        return text_authors;
    }

    public void setText_authors(String text_authors) {
        this.text_authors = text_authors;
    }

    public String getImage_from() {
        return image_from;
    }

    public void setImage_from(String image_from) {
        this.image_from = image_from;
    }

    public String getText_from() {
        return text_from;
    }

    public void setText_from(String text_from) {
        this.text_from = text_from;
    }

    public String getContent_bgcolor() {
        return content_bgcolor;
    }

    public void setContent_bgcolor(String content_bgcolor) {
        this.content_bgcolor = content_bgcolor;
    }

    public int getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(int praisenum) {
        this.praisenum = praisenum;
    }

    public int getSharenum() {
        return sharenum;
    }

    public void setSharenum(int sharenum) {
        this.sharenum = sharenum;
    }

    public int getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(int commentnum) {
        this.commentnum = commentnum;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hpcontent_id);
        dest.writeString(this.hp_title);
        dest.writeString(this.author_id);
        dest.writeString(this.hp_img_url);
        dest.writeString(this.hp_img_original_url);
        dest.writeString(this.hp_author);
        dest.writeString(this.ipad_url);
        dest.writeString(this.hp_content);
        dest.writeString(this.hp_makettime);
        dest.writeString(this.hide_flag);
        dest.writeString(this.last_update_date);
        dest.writeString(this.web_url);
        dest.writeString(this.wb_img_url);
        dest.writeString(this.image_authors);
        dest.writeString(this.text_authors);
        dest.writeString(this.image_from);
        dest.writeString(this.text_from);
        dest.writeString(this.content_bgcolor);
        dest.writeInt(this.praisenum);
        dest.writeInt(this.sharenum);
        dest.writeInt(this.commentnum);
    }

    public OneHpBean() {
    }

    protected OneHpBean(Parcel in) {
        this.hpcontent_id = in.readString();
        this.hp_title = in.readString();
        this.author_id = in.readString();
        this.hp_img_url = in.readString();
        this.hp_img_original_url = in.readString();
        this.hp_author = in.readString();
        this.ipad_url = in.readString();
        this.hp_content = in.readString();
        this.hp_makettime = in.readString();
        this.hide_flag = in.readString();
        this.last_update_date = in.readString();
        this.web_url = in.readString();
        this.wb_img_url = in.readString();
        this.image_authors = in.readString();
        this.text_authors = in.readString();
        this.image_from = in.readString();
        this.text_from = in.readString();
        this.content_bgcolor = in.readString();
        this.praisenum = in.readInt();
        this.sharenum = in.readInt();
        this.commentnum = in.readInt();
    }

    public static final Parcelable.Creator<OneHpBean> CREATOR = new Parcelable.Creator<OneHpBean>() {
        @Override
        public OneHpBean createFromParcel(Parcel source) {
            return new OneHpBean(source);
        }

        @Override
        public OneHpBean[] newArray(int size) {
            return new OneHpBean[size];
        }
    };
}
