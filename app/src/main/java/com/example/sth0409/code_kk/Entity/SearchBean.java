package com.example.sth0409.code_kk.Entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/05.
 */
public class SearchBean implements Parcelable {

    /**
     * code : 0
     * message :
     * data : {"isFullSearch":false,"projectArray":[{"projectUrl":"https://github.com/handsomezhou/QwertySearchLibrary","committer":"handsomezhou","updateTime":"2016-02-02T03:19:06.453000","hide":false,"lang":"Android","demoUrl":"https://github.com/handsomezhou/QwertySearchLibrary/blob/master/external_res/bin/QwertySearchDemo.ap","projectName":"QwertySearchLibrary","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"handsomezhou","authorUrl":"https:/github.com/handsomezhou","recommend":false,"desc":"The library of QwertySearch,a Java Library Which provide data analysis methods, \ndata matching method and so on for Qwerty pinyin search.","createTime":"2016-02-02T03:19:06.453000","tags":[{"userName":"handsomezhou","type":"open-source-project","createTime":"2016-02-02T03:19:06.453000","name":"Qwerty search"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:34.500000","name":"Pinyin search"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:40.738000","name":"拼音搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:56.603000","name":"模糊搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:20:34.876000","name":"全键盘搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:20:51.547000","name":"搜索"}],"voteUp":0,"_id":"56b0202a4a38205862ef3bf9","codeKKUrl":"http://p.codekk.com/detail/Android/handsomezhou/QwertySearchLibrary"},{"projectUrl":"https://github.com/handsomezhou/T9SearchLibrary","committer":"handsomezhou","updateTime":"2016-02-02T03:16:33.163000","hide":false,"lang":"Android","demoUrl":"https://github.com/handsomezhou/T9SearchLibrary/blob/master/external_res/bin/T9SearchDemo.apk?raw=tr","projectName":"T9SearchLibrary","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"handsomezhou","authorUrl":"https:/github.com/handsomezhou","recommend":false,"desc":"The library of T9Search,a Java Library Which provide data analysis methods, \ndata matching method and so on for T9 pinyin search.","createTime":"2016-02-02T03:16:33.163000","tags":[{"userName":"handsomezhou","type":"open-source-project","createTime":"2016-02-02T03:16:33.163000","name":"T9 search"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:17:43.333000","name":"Pinyin search"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:17:49.592000","name":"拼音搜索"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:18:02.937000","name":"模糊搜索"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:21:04.272000","name":"搜索"}],"voteUp":0,"_id":"56b01f914a38205862ef3bf7","codeKKUrl":"http://p.codekk.com/detail/Android/handsomezhou/T9SearchLibrary"},{"lang":"Android","committer":"codeKKAuto","updateTime":"2015-11-28T16:00:00","hide":false,"authorUrl":"https://github.com/arimorty","tags":[{"userName":"Trinea","contentId":"565a4723fbbec781c2f75949","type":"open-source-project","createTime":"2015-11-30T08:03:11.445000","name":"搜索框"},{"userName":"Trinea","contentId":"565a4723fbbec781c2f75949","type":"open-source-project","createTime":"2015-11-30T08:03:13.419000","name":"搜索联想"},{"userName":"Trinea","contentId":"565a4723fbbec781c2f75949","type":"open-source-project","createTime":"2015-11-30T08:03:29.456000","name":"SearchView"}],"projectName":"floatingsearchview","expiredTimes":0,"authorName":"arimorty","usedTimes":0,"source":"GitHub","projectUrl":"https://github.com/arimorty/floatingsearchview","officialUrl":"https://github.com/arimorty/floatingsearchview/blob/master/README.md","recommend":false,"desc":"A search view that implements a floating search bar also known as persistent search","createTime":"2015-11-28T16:00:00","voteUp":0,"_id":"565a4723fbbec781c2f75949","codeKKUrl":"http://p.codekk.com/detail/Android/arimorty/floatingsearchview"},{"projectUrl":"https://github.com/liangpengfei/SearchView","committer":"liangpengfei","updateTime":"2015-11-25T04:12:40.136000","hide":false,"lang":"Android","demoUrl":"https://github.com/liangpengfei/SearchView","projectName":"SearchView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"liangpengfei","authorUrl":"https:/github.com/liangpengfei","recommend":false,"desc":"一个实现了搜索动画效果的searchview,实现了点击后开始动画，数据加载完毕后停止动画，灵感来源dribbble","createTime":"2015-11-25T04:12:40.136000","tags":[{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"searchview"},{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"搜索"},{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"动画"},{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"dribbble"}],"voteUp":0,"_id":"56553538fbbec781c2f75812","codeKKUrl":"http://p.codekk.com/detail/Android/liangpengfei/SearchView"},{"projectUrl":"https://github.com/jeanboydev/Android-SearchView","committer":"jeanboydev","updateTime":"2016-11-14T02:35:45.523000","hide":false,"lang":"Android","demoUrl":"","projectName":"Android-SearchView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"jeanboydev","authorUrl":"https:/github.com/jeanboydev","recommend":false,"desc":"动感十足的搜索加载 View。","createTime":"2016-11-14T02:35:45.523000","tags":[{"userName":"jeanboydev","type":"open-source-project","createTime":"2016-11-14T02:35:45.523000","name":"搜索"},{"userName":"jeanboydev","contentId":"58292301fa7a4c321862cd10","type":"open-source-project","createTime":"2016-11-14T02:35:59.053000","name":"Search"},{"userName":"jeanboydev","contentId":"58292301fa7a4c321862cd10","type":"open-source-project","createTime":"2016-11-14T02:36:11.710000","name":"自定义View"},{"userName":"jeanboydev","contentId":"58292301fa7a4c321862cd10","type":"open-source-project","createTime":"2016-11-14T02:36:19.470000","name":"动感"}],"voteUp":0,"_id":"58292301fa7a4c321862cd10","codeKKUrl":"http://p.codekk.com/detail/Android/jeanboydev/Android-SearchView"},{"lang":"Android","committer":"handsomezhou","updateTime":"2015-11-16T15:14:34.387000","hide":false,"demoUrl":"https://github.com/handsomezhou/PinyinSearchLibrary/blob/master/external_res/bin/ContactsSearch.apk?","projectName":"PinyinSearchLibrary","expiredTimes":0,"authorName":"handsomezhou","usedTimes":0,"source":"User","projectUrl":"https://github.com/handsomezhou/PinyinSearchLibrary","voteUp":0,"recommend":false,"desc":"The library of PinyinSearch,a Java Library which provide data parsing methods, \ndata matching method and so on for T9 search and Qwerty search.\n\nPinyinSearch = T9Search + QwertySearch","createTime":"2015-11-16T15:14:34.387000","tags":[{"userName":"handsomezhou","isDelete":false,"type":"open-source-project","createTime":"2015-11-16T15:14:34.388000","name":"T9 search"},{"userName":"handsomezhou","isDelete":false,"type":"open-source-project","createTime":"2015-11-16T15:14:34.388000","name":"Pinyin search"},{"userName":"handsomezhou","isDelete":false,"type":"open-source-project","createTime":"2015-11-16T15:14:34.388000","name":"拼音搜索"},{"userName":"handsomezhou","name":"模糊搜索","contentId":"5649f2dafbbec781c2f755b5","isDelete":false,"type":"open-source-project","createTime":"2015-11-18T06:32:03.281000"},{"userName":"handsomezhou","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-02-02T03:23:17.907000","name":"全键盘搜索"},{"userName":"handsomezhou","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-02-02T03:23:21.136000","name":"联系人"},{"userName":"handsomezhou","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-02-02T03:23:48.992000","name":"contacts"},{"userName":"Trinea","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-03-20T14:18:21.942000","name":"Qwerty search"}],"authorUrl":"https:/github.com/handsomezhou","_id":"5649f2dafbbec781c2f755b5","codeKKUrl":"http://p.codekk.com/detail/Android/handsomezhou/PinyinSearchLibrary"},{"lang":"Android","committer":"Trinea","updateTime":"2015-09-01T01:33:47","hide":false,"projectName":"ScanBook","expiredTimes":0,"smallType":"二、项目","bigType":"第三部分 优秀项目","usedTimes":0,"source":"GitHub","authorName":"JayFang1993","other":"APK 地址：http://www.wandoujia.com/apps/com.scanbook","authorUrl":"https:/github.com/JayFang1993","projectUrl":"https://github.com/JayFang1993/ScanBook","recommend":false,"desc":"扫描搜索查询图书信息","createTime":"2015-09-01T01:33:47","voteUp":0,"_id":"55edafd8d6459ae793499cf1","codeKKUrl":"http://p.codekk.com/detail/Android/JayFang1993/ScanBook"},{"projectUrl":"https://github.com/vivian8725118/SearchListView","committer":"vivian8725118","updateTime":"2016-07-14T02:36:49.915000","hide":false,"lang":"Android","demoUrl":"","projectName":"SearchListView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"vivian8725118","authorUrl":"https:/github.com/vivian8725118","recommend":false,"desc":"带搜索栏的 listview，轻拉出现搜索栏，用力拉出现下拉刷新","createTime":"2016-07-14T02:36:49.915000","tags":[{"userName":"vivian8725118","type":"open-source-project","createTime":"2016-07-14T02:36:49.915000","name":"listview"},{"userName":"vivian8725118","type":"open-source-project","createTime":"2016-07-14T02:36:49.915000","name":"SearchListView"},{"userName":"vivian8725118","type":"open-source-project","createTime":"2016-07-14T02:36:49.915000","name":"下拉刷新"}],"voteUp":0,"_id":"5786fac1fa7a4c321862b4e9","codeKKUrl":"http://p.codekk.com/detail/Android/vivian8725118/SearchListView"},{"projectUrl":"https://github.com/Blankeer/SoleBooks","committer":"Blankeer","updateTime":"2016-07-21T07:04:57.137000","hide":false,"lang":"Android","demoUrl":"","projectName":"SoleBooks","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"Blankeer","authorUrl":"https:/github.com/Blankeer","recommend":false,"desc":"类似豆瓣读书，提供一个书籍查看、搜索、交流的平台","createTime":"2016-07-21T07:04:57.137000","tags":[{"userName":"Blankeer","type":"open-source-project","createTime":"2016-07-21T07:04:57.138000","name":"MVP RxJava"},{"userName":"Trinea","contentId":"57907419fa7a4c321862b60b","type":"open-source-project","createTime":"2016-07-28T09:43:25.316000","name":"App"}],"voteUp":0,"_id":"57907419fa7a4c321862b60b","codeKKUrl":"http://p.codekk.com/detail/Android/Blankeer/SoleBooks"},{"projectUrl":"https://github.com/7449/codeKKSimple","committer":"7449","updateTime":"2016-09-06T05:08:10.897000","hide":false,"lang":"Android","demoUrl":"","projectName":"codeKKSimple","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"7449","authorUrl":"https:/github.com/7449","recommend":false,"desc":"codeKK 第三方简易客户端，只有查看开源项目以及搜索开源项目这两个功能，有缓存功能","createTime":"2016-09-06T05:08:10.897000","tags":[{"userName":"7449","type":"open-source-project","createTime":"2016-09-06T05:08:10.897000","name":"codeKK"},{"userName":"7449","type":"open-source-project","createTime":"2016-09-06T05:08:10.897000","name":"rxjava"},{"userName":"7449","type":"open-source-project","createTime":"2016-09-06T05:08:10.897000","name":"retrofit2"},{"userName":"7449","contentId":"57ce4f3afa7a4c321862c0a0","type":"open-source-project","createTime":"2016-09-06T05:44:25.406000","name":"mvp"}],"voteUp":0,"_id":"57ce4f3afa7a4c321862c0a0","codeKKUrl":"http://p.codekk.com/detail/Android/7449/codeKKSimple"},{"projectUrl":"https://github.com/kongnanlive/SideBar","committer":"Trinea","updateTime":"2016-07-01T07:30:01.121000","hide":false,"lang":"Android","demoUrl":"","projectName":"SideBar","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"kongnanlive","authorUrl":"https:/github.com/kongnanlive","recommend":false,"desc":"全新的快速索引导航栏，联系人字母排序侧边栏。","createTime":"2016-07-01T07:30:01.121000","tags":[{"userName":"Trinea","type":"open-source-project","createTime":"2016-07-01T07:30:01.121000","name":"快速索引"},{"userName":"Trinea","type":"open-source-project","createTime":"2016-07-01T07:30:01.121000","name":"ListView索引"}],"voteUp":0,"_id":"57761bf9fa7a4c321862b2d1","codeKKUrl":"http://p.codekk.com/detail/Android/kongnanlive/SideBar"},{"projectUrl":"https://github.com/gjiazhe/WaveSideBar","committer":"Trinea","updateTime":"2016-09-16T10:41:23.171000","hide":false,"lang":"Android","demoUrl":"","projectName":"WaveSideBar","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"gjiazhe","authorUrl":"https:/github.com/gjiazhe","recommend":false,"desc":"索引栏","createTime":"2016-09-16T10:41:23.171000","tags":[{"userName":"Trinea","type":"open-source-project","createTime":"2016-09-16T10:41:23.171000","name":"字母索引"}],"voteUp":0,"_id":"57dbcc53fa7a4c321862c2c2","codeKKUrl":"http://p.codekk.com/detail/Android/gjiazhe/WaveSideBar"},{"projectUrl":"https://github.com/wenhuaijun/SearchPictureTool","committer":"wenhuaijun","updateTime":"2016-02-17T13:26:39.753000","hide":false,"lang":"Android","demoUrl":"https://github.com/wenhuaijun/SearchPictureTool","projectName":"SearchPictureTool","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"wenhuaijun","authorUrl":"https:/github.com/wenhuaijun","recommend":false,"desc":"一款开源的图片搜索APP。Material Design风格。使用Rxjava，MVP快速开发框架，封装的RecyclerView，retrofit 2.0网络请求库，Fresco图片加载库，图片瀑布流和错位式布局。具有热门推荐、每日一笑、板块分类、一键下载图片、分享图片、收藏图片、设为桌面壁纸、设为锁屏壁纸等功能","createTime":"2016-02-17T13:26:39.753000","tags":[{"userName":"Trinea","contentId":"56c4750f4a38205862ef3d1d","type":"open-source-project","createTime":"2016-03-20T14:39:58.143000","name":"图片加载"},{"userName":"Trinea","contentId":"56c4750f4a38205862ef3d1d","type":"open-source-project","createTime":"2016-03-20T14:40:04.853000","name":"瀑布流"},{"userName":"Trinea","contentId":"56c4750f4a38205862ef3d1d","type":"open-source-project","createTime":"2016-03-20T14:40:09.289000","name":"Material Design"}],"voteUp":0,"_id":"56c4750f4a38205862ef3d1d","codeKKUrl":"http://p.codekk.com/detail/Android/wenhuaijun/SearchPictureTool"},{"projectUrl":"https://github.com/mcxtzhang/SuspensionIndexBar","committer":"mcxtzhang","updateTime":"2016-11-29T03:47:58.847000","hide":false,"lang":"Android","demoUrl":"","projectName":"SuspensionIndexBar","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"mcxtzhang","authorUrl":"https:/github.com/mcxtzhang","recommend":false,"desc":"快速实现分组悬停、右侧索引导航联动 列表。\n如 美团选择城市界面，微信通讯录界面、饿了么点餐界面等。","createTime":"2016-11-29T03:47:58.847000","tags":[{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"悬停"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"分组"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"索引"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"导航"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"A-Z索引"}],"voteUp":0,"_id":"583cfa6efa7a4c321862cf57","codeKKUrl":"http://p.codekk.com/detail/Android/mcxtzhang/SuspensionIndexBar"},{"lang":"Android","committer":"Trinea","updateTime":"2015-09-01T01:25:34","hide":false,"tags":[{"userName":"Trinea","contentId":"55edafd8d6459ae793499d28","type":"open-source-project","createTime":"2015-11-19T03:15:20.558000","name":"工具"}],"projectName":"android-resource-navigator","expiredTimes":0,"smallType":"五、其他","bigType":"第四部分 开发工具及测试工具","usedTimes":0,"source":"GitHub","authorName":"jgilfelt","voteUp":0,"projectUrl":"https://github.com/jgilfelt/android-resource-navigator","recommend":false,"desc":"chrome 插件，可以方便的查看 github 上 android 源码工程的 styles.xml 和 themes.xml。主要功能：(1) 快速打开 android styles.xml themes.xml(2) 方便在资源间跳转。styles.xml themes.xml 文件中资源链接跳转，可以方便跳转到某个资源(3) 方便查找某个 style 和 theme。chrome 地址栏输入 arn+tab+搜索内容回车即可(4) 自动下载不同分辨率下的 drawable(5) 通过映射查找那些不是按照固定命名规则命名的 style 和 theme","createTime":"2015-09-01T01:25:34","onlineDemoUrl":"https://chrome.google.com/webstore/detail/android-resource-navigato/agoomkionjjbejegcejiefodgbckeebo?hl=en&gl=GB","authorUrl":"https:/github.com/jgilfelt","_id":"55edafd8d6459ae793499d28","codeKKUrl":"http://p.codekk.com/detail/Android/jgilfelt/android-resource-navigator"},{"projectUrl":"https://github.com/7449/SlideView","committer":"7449","updateTime":"2016-07-08T02:32:05.744000","hide":false,"lang":"Android","demoUrl":"","projectName":"SlideView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"7449","authorUrl":"https:/github.com/7449","recommend":false,"desc":"模仿微信通讯录侧边快速索引","createTime":"2016-07-08T02:32:05.744000","tags":[{"userName":"7449","type":"open-source-project","createTime":"2016-07-08T02:32:05.745000","name":"slide 自定义view 快速索引"}],"voteUp":0,"_id":"577f10a5fa7a4c321862b3d7","codeKKUrl":"http://p.codekk.com/detail/Android/7449/SlideView"},{"projectUrl":"https://github.com/YoKeyword/IndexableRecyclerView","committer":"YoKeyword","updateTime":"2016-10-11T04:56:51.070000","hide":false,"lang":"Android","demoUrl":"","projectName":"IndexableRecyclerView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"YoKeyword","authorUrl":"https:/github.com/YoKeyword","recommend":false,"desc":"用于实现城市选择、联系人等功能的易拓展 RecyclerView 库，包含自动索引，粘性等功能","createTime":"2016-10-11T04:56:51.070000","tags":[{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-10-11T04:56:51.071000","name":"RecyclerView"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-10-11T04:56:51.071000","name":"Sticky"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-10-11T04:56:51.071000","name":"Index"},{"userName":"Trinea","contentId":"57fc7113fa7a4c321862c7bb","type":"open-source-project","createTime":"2016-10-11T08:55:25.145000","name":"联系人索引"}],"voteUp":0,"_id":"57fc7113fa7a4c321862c7bb","codeKKUrl":"http://p.codekk.com/detail/Android/YoKeyword/IndexableRecyclerView"},{"projectUrl":"https://github.com/YoKeyword/IndexableStickyListView","committer":"YoKeyword","updateTime":"2016-03-26T02:45:49.735000","hide":false,"lang":"Android","demoUrl":"","projectName":"IndexableStickyListView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"YoKeyword","authorUrl":"https:/github.com/YoKeyword","recommend":false,"desc":"IndexableListView + StickyListHeader功能的字母索引ListVIew，轻松实现选择城市、选择联系人等功能","createTime":"2016-03-26T02:45:49.735000","tags":[{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-03-26T02:45:49.735000","name":"ListView"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-03-26T02:45:49.735000","name":"Index"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-03-26T02:45:49.735000","name":"Sticky"},{"userName":"mikedream89","contentId":"56f5f7dd4a38205862ef4558","type":"open-source-project","createTime":"2016-04-22T08:19:35.697000","name":"444"},{"userName":"changjieyy","contentId":"56f5f7dd4a38205862ef4558","type":"open-source-project","createTime":"2016-04-28T06:06:53.240000","name":"联系人"}],"voteUp":0,"_id":"56f5f7dd4a38205862ef4558","codeKKUrl":"http://p.codekk.com/detail/Android/YoKeyword/IndexableStickyListView"},{"lang":"Android","committer":"Trinea","updateTime":"2015-09-01T02:23:47","hide":false,"demoUrl":"https://github.com/Trinea/TrineaDownload/blob/master/indexable-listview.apk?raw=true","projectName":"IndexableListView","smallType":"一、ListView","apps":"微信通讯录、小米联系人","bigType":"第一部分 个性化控件(View)","usedTimes":0,"source":"GitHub","authorName":"woozzu","expiredTimes":0,"authorUrl":"https:/github.com/woozzu","projectUrl":"https://github.com/woozzu/IndexableListView","recommend":false,"desc":"ListView 右侧会显示 item 首字母快捷索引，点击可快速滑动到某个 item","createTime":"2015-09-01T02:23:47","voteUp":0,"_id":"55edafd7d6459ae793499b81","codeKKUrl":"http://p.codekk.com/detail/Android/woozzu/IndexableListView"},{"projectUrl":"https://github.com/jiang111/IndexRecyclerView","committer":"YumikoAzu","updateTime":"2016-03-20T06:10:39.905000","hide":false,"lang":"Android","demoUrl":"https://github.com/jiang111/IndexRecyclerView","projectName":"IndexRecyclerView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"jiang111","authorUrl":"https:/github.com/jiang111","recommend":false,"desc":"通过RecyclerView实现联系人的功能。\n\n1.首字母悬浮在顶部。\n2.侧滑删除联系人。\n3.联系人索引。","createTime":"2016-03-20T06:10:39.905000","tags":[{"userName":"YumikoAzu","type":"open-source-project","createTime":"2016-03-20T06:10:39.905000","name":"RecyclerView"}],"voteUp":0,"_id":"56ee3edf4a38205862ef436c","codeKKUrl":"http://p.codekk.com/detail/Android/jiang111/IndexRecyclerView"},{"projectUrl":"https://github.com/D-clock/AndroidAlbum","committer":"D-clock","updateTime":"2016-01-27T12:02:17.947000","hide":false,"lang":"Android","demoUrl":"https://github.com/D-clock/AndroidAlbum","projectName":"AndroidAlbum","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"D-clock","authorUrl":"https:/github.com/D-clock","recommend":false,"desc":"一个图片选择器，特点如下：\n1、遵循MVP的编码设计；\n2、使用工厂模式抽象封装加载图片的框架，降低对具体加载图片框架的依赖；\n3、添加闪退日志的搜集机制，方便揪Bug；\n还在不断完善ing...","createTime":"2016-01-27T12:02:17.947000","tags":[{"userName":"D-clock","type":"open-source-project","createTime":"2016-01-27T12:02:17.947000","name":"图片选择"},{"userName":"D-clock","type":"open-source-project","createTime":"2016-01-27T12:02:17.948000","name":"MVP"},{"userName":"D-clock","type":"open-source-project","createTime":"2016-01-27T12:02:17.948000","name":"ImageSelector"}],"voteUp":0,"_id":"56a8b1c94a38205862ef3b1e","codeKKUrl":"http://p.codekk.com/detail/Android/D-clock/AndroidAlbum"},{"projectUrl":"https://github.com/JustWayward/BookReader","committer":"smuyyh","updateTime":"2016-09-18T00:47:41.454000","hide":false,"lang":"Android","demoUrl":"","projectName":"BookReader","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"JustWayward","authorUrl":"https:/github.com/JustWayward","recommend":false,"desc":"任阅小说阅读器，高仿追书神器。基于 RxJava + Retrofit2 + Dagger2，结合 MVP 模式开发，项目结构清晰。实现追书推荐、标签检索、3D 仿真翻页效果、文章阅读、缓存章节、日夜间模式、文本朗读等功能。","createTime":"2016-09-18T00:47:41.454000","tags":[{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"阅读器"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"RxJava"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"Retrofit"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"Dagger"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"小说"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"MVP"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"追书神器"}],"voteUp":0,"_id":"57dde42dfa7a4c321862c2f6","codeKKUrl":"http://p.codekk.com/detail/Android/JustWayward/BookReader"},{"projectUrl":"https://github.com/SkillCollege/SimplifyReader","lang":"Android","updateTime":"2015-09-11T16:00:00","hide":false,"committer":"codeKKAuto","projectName":"SimplifyReader","expiredTimes":0,"voteUp":0,"usedTimes":0,"source":"GitHub","authorName":"SkillCollege","officialUrl":null,"recommend":false,"desc":"一款基于Google Material Design设计开发的Android客户端，包括新闻简读，图片浏览，视频爽看 ，音乐轻听以及二维码扫描五个子模块。项目采取的是MVP架构开发，由于还是摸索阶段，可能不是很规范。但基本上应该是这么个套路，至少我个人认为是这样的~恩，就是这样的！","createTime":"2015-09-11T16:00:00","authorUrl":"https://github.com/SkillCollege","_id":"55f3ddf4d6459ae79349a11a","codeKKUrl":"http://p.codekk.com/detail/Android/SkillCollege/SimplifyReader"}],"totalCount":23,"pageSize":100}
     */

    private int code;
    private String message;
    private SearchDataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SearchDataBean getData() {
        return data;
    }

    public void setData(SearchDataBean data) {
        this.data = data;
    }

    public static class SearchDataBean implements Parcelable {
        /**
         * isFullSearch : false
         * projectArray : [{"projectUrl":"https://github.com/handsomezhou/QwertySearchLibrary","committer":"handsomezhou","updateTime":"2016-02-02T03:19:06.453000","hide":false,"lang":"Android","demoUrl":"https://github.com/handsomezhou/QwertySearchLibrary/blob/master/external_res/bin/QwertySearchDemo.ap","projectName":"QwertySearchLibrary","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"handsomezhou","authorUrl":"https:/github.com/handsomezhou","recommend":false,"desc":"The library of QwertySearch,a Java Library Which provide data analysis methods, \ndata matching method and so on for Qwerty pinyin search.","createTime":"2016-02-02T03:19:06.453000","tags":[{"userName":"handsomezhou","type":"open-source-project","createTime":"2016-02-02T03:19:06.453000","name":"Qwerty search"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:34.500000","name":"Pinyin search"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:40.738000","name":"拼音搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:56.603000","name":"模糊搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:20:34.876000","name":"全键盘搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:20:51.547000","name":"搜索"}],"voteUp":0,"_id":"56b0202a4a38205862ef3bf9","codeKKUrl":"http://p.codekk.com/detail/Android/handsomezhou/QwertySearchLibrary"},{"projectUrl":"https://github.com/handsomezhou/T9SearchLibrary","committer":"handsomezhou","updateTime":"2016-02-02T03:16:33.163000","hide":false,"lang":"Android","demoUrl":"https://github.com/handsomezhou/T9SearchLibrary/blob/master/external_res/bin/T9SearchDemo.apk?raw=tr","projectName":"T9SearchLibrary","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"handsomezhou","authorUrl":"https:/github.com/handsomezhou","recommend":false,"desc":"The library of T9Search,a Java Library Which provide data analysis methods, \ndata matching method and so on for T9 pinyin search.","createTime":"2016-02-02T03:16:33.163000","tags":[{"userName":"handsomezhou","type":"open-source-project","createTime":"2016-02-02T03:16:33.163000","name":"T9 search"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:17:43.333000","name":"Pinyin search"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:17:49.592000","name":"拼音搜索"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:18:02.937000","name":"模糊搜索"},{"userName":"handsomezhou","contentId":"56b01f914a38205862ef3bf7","type":"open-source-project","createTime":"2016-02-02T03:21:04.272000","name":"搜索"}],"voteUp":0,"_id":"56b01f914a38205862ef3bf7","codeKKUrl":"http://p.codekk.com/detail/Android/handsomezhou/T9SearchLibrary"},{"lang":"Android","committer":"codeKKAuto","updateTime":"2015-11-28T16:00:00","hide":false,"authorUrl":"https://github.com/arimorty","tags":[{"userName":"Trinea","contentId":"565a4723fbbec781c2f75949","type":"open-source-project","createTime":"2015-11-30T08:03:11.445000","name":"搜索框"},{"userName":"Trinea","contentId":"565a4723fbbec781c2f75949","type":"open-source-project","createTime":"2015-11-30T08:03:13.419000","name":"搜索联想"},{"userName":"Trinea","contentId":"565a4723fbbec781c2f75949","type":"open-source-project","createTime":"2015-11-30T08:03:29.456000","name":"SearchView"}],"projectName":"floatingsearchview","expiredTimes":0,"authorName":"arimorty","usedTimes":0,"source":"GitHub","projectUrl":"https://github.com/arimorty/floatingsearchview","officialUrl":"https://github.com/arimorty/floatingsearchview/blob/master/README.md","recommend":false,"desc":"A search view that implements a floating search bar also known as persistent search","createTime":"2015-11-28T16:00:00","voteUp":0,"_id":"565a4723fbbec781c2f75949","codeKKUrl":"http://p.codekk.com/detail/Android/arimorty/floatingsearchview"},{"projectUrl":"https://github.com/liangpengfei/SearchView","committer":"liangpengfei","updateTime":"2015-11-25T04:12:40.136000","hide":false,"lang":"Android","demoUrl":"https://github.com/liangpengfei/SearchView","projectName":"SearchView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"liangpengfei","authorUrl":"https:/github.com/liangpengfei","recommend":false,"desc":"一个实现了搜索动画效果的searchview,实现了点击后开始动画，数据加载完毕后停止动画，灵感来源dribbble","createTime":"2015-11-25T04:12:40.136000","tags":[{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"searchview"},{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"搜索"},{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"动画"},{"userName":"liangpengfei","type":"open-source-project","createTime":"2015-11-25T04:12:40.136000","name":"dribbble"}],"voteUp":0,"_id":"56553538fbbec781c2f75812","codeKKUrl":"http://p.codekk.com/detail/Android/liangpengfei/SearchView"},{"projectUrl":"https://github.com/jeanboydev/Android-SearchView","committer":"jeanboydev","updateTime":"2016-11-14T02:35:45.523000","hide":false,"lang":"Android","demoUrl":"","projectName":"Android-SearchView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"jeanboydev","authorUrl":"https:/github.com/jeanboydev","recommend":false,"desc":"动感十足的搜索加载 View。","createTime":"2016-11-14T02:35:45.523000","tags":[{"userName":"jeanboydev","type":"open-source-project","createTime":"2016-11-14T02:35:45.523000","name":"搜索"},{"userName":"jeanboydev","contentId":"58292301fa7a4c321862cd10","type":"open-source-project","createTime":"2016-11-14T02:35:59.053000","name":"Search"},{"userName":"jeanboydev","contentId":"58292301fa7a4c321862cd10","type":"open-source-project","createTime":"2016-11-14T02:36:11.710000","name":"自定义View"},{"userName":"jeanboydev","contentId":"58292301fa7a4c321862cd10","type":"open-source-project","createTime":"2016-11-14T02:36:19.470000","name":"动感"}],"voteUp":0,"_id":"58292301fa7a4c321862cd10","codeKKUrl":"http://p.codekk.com/detail/Android/jeanboydev/Android-SearchView"},{"lang":"Android","committer":"handsomezhou","updateTime":"2015-11-16T15:14:34.387000","hide":false,"demoUrl":"https://github.com/handsomezhou/PinyinSearchLibrary/blob/master/external_res/bin/ContactsSearch.apk?","projectName":"PinyinSearchLibrary","expiredTimes":0,"authorName":"handsomezhou","usedTimes":0,"source":"User","projectUrl":"https://github.com/handsomezhou/PinyinSearchLibrary","voteUp":0,"recommend":false,"desc":"The library of PinyinSearch,a Java Library which provide data parsing methods, \ndata matching method and so on for T9 search and Qwerty search.\n\nPinyinSearch = T9Search + QwertySearch","createTime":"2015-11-16T15:14:34.387000","tags":[{"userName":"handsomezhou","isDelete":false,"type":"open-source-project","createTime":"2015-11-16T15:14:34.388000","name":"T9 search"},{"userName":"handsomezhou","isDelete":false,"type":"open-source-project","createTime":"2015-11-16T15:14:34.388000","name":"Pinyin search"},{"userName":"handsomezhou","isDelete":false,"type":"open-source-project","createTime":"2015-11-16T15:14:34.388000","name":"拼音搜索"},{"userName":"handsomezhou","name":"模糊搜索","contentId":"5649f2dafbbec781c2f755b5","isDelete":false,"type":"open-source-project","createTime":"2015-11-18T06:32:03.281000"},{"userName":"handsomezhou","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-02-02T03:23:17.907000","name":"全键盘搜索"},{"userName":"handsomezhou","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-02-02T03:23:21.136000","name":"联系人"},{"userName":"handsomezhou","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-02-02T03:23:48.992000","name":"contacts"},{"userName":"Trinea","contentId":"5649f2dafbbec781c2f755b5","type":"open-source-project","createTime":"2016-03-20T14:18:21.942000","name":"Qwerty search"}],"authorUrl":"https:/github.com/handsomezhou","_id":"5649f2dafbbec781c2f755b5","codeKKUrl":"http://p.codekk.com/detail/Android/handsomezhou/PinyinSearchLibrary"},{"lang":"Android","committer":"Trinea","updateTime":"2015-09-01T01:33:47","hide":false,"projectName":"ScanBook","expiredTimes":0,"smallType":"二、项目","bigType":"第三部分 优秀项目","usedTimes":0,"source":"GitHub","authorName":"JayFang1993","other":"APK 地址：http://www.wandoujia.com/apps/com.scanbook","authorUrl":"https:/github.com/JayFang1993","projectUrl":"https://github.com/JayFang1993/ScanBook","recommend":false,"desc":"扫描搜索查询图书信息","createTime":"2015-09-01T01:33:47","voteUp":0,"_id":"55edafd8d6459ae793499cf1","codeKKUrl":"http://p.codekk.com/detail/Android/JayFang1993/ScanBook"},{"projectUrl":"https://github.com/vivian8725118/SearchListView","committer":"vivian8725118","updateTime":"2016-07-14T02:36:49.915000","hide":false,"lang":"Android","demoUrl":"","projectName":"SearchListView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"vivian8725118","authorUrl":"https:/github.com/vivian8725118","recommend":false,"desc":"带搜索栏的 listview，轻拉出现搜索栏，用力拉出现下拉刷新","createTime":"2016-07-14T02:36:49.915000","tags":[{"userName":"vivian8725118","type":"open-source-project","createTime":"2016-07-14T02:36:49.915000","name":"listview"},{"userName":"vivian8725118","type":"open-source-project","createTime":"2016-07-14T02:36:49.915000","name":"SearchListView"},{"userName":"vivian8725118","type":"open-source-project","createTime":"2016-07-14T02:36:49.915000","name":"下拉刷新"}],"voteUp":0,"_id":"5786fac1fa7a4c321862b4e9","codeKKUrl":"http://p.codekk.com/detail/Android/vivian8725118/SearchListView"},{"projectUrl":"https://github.com/Blankeer/SoleBooks","committer":"Blankeer","updateTime":"2016-07-21T07:04:57.137000","hide":false,"lang":"Android","demoUrl":"","projectName":"SoleBooks","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"Blankeer","authorUrl":"https:/github.com/Blankeer","recommend":false,"desc":"类似豆瓣读书，提供一个书籍查看、搜索、交流的平台","createTime":"2016-07-21T07:04:57.137000","tags":[{"userName":"Blankeer","type":"open-source-project","createTime":"2016-07-21T07:04:57.138000","name":"MVP RxJava"},{"userName":"Trinea","contentId":"57907419fa7a4c321862b60b","type":"open-source-project","createTime":"2016-07-28T09:43:25.316000","name":"App"}],"voteUp":0,"_id":"57907419fa7a4c321862b60b","codeKKUrl":"http://p.codekk.com/detail/Android/Blankeer/SoleBooks"},{"projectUrl":"https://github.com/7449/codeKKSimple","committer":"7449","updateTime":"2016-09-06T05:08:10.897000","hide":false,"lang":"Android","demoUrl":"","projectName":"codeKKSimple","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"7449","authorUrl":"https:/github.com/7449","recommend":false,"desc":"codeKK 第三方简易客户端，只有查看开源项目以及搜索开源项目这两个功能，有缓存功能","createTime":"2016-09-06T05:08:10.897000","tags":[{"userName":"7449","type":"open-source-project","createTime":"2016-09-06T05:08:10.897000","name":"codeKK"},{"userName":"7449","type":"open-source-project","createTime":"2016-09-06T05:08:10.897000","name":"rxjava"},{"userName":"7449","type":"open-source-project","createTime":"2016-09-06T05:08:10.897000","name":"retrofit2"},{"userName":"7449","contentId":"57ce4f3afa7a4c321862c0a0","type":"open-source-project","createTime":"2016-09-06T05:44:25.406000","name":"mvp"}],"voteUp":0,"_id":"57ce4f3afa7a4c321862c0a0","codeKKUrl":"http://p.codekk.com/detail/Android/7449/codeKKSimple"},{"projectUrl":"https://github.com/kongnanlive/SideBar","committer":"Trinea","updateTime":"2016-07-01T07:30:01.121000","hide":false,"lang":"Android","demoUrl":"","projectName":"SideBar","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"kongnanlive","authorUrl":"https:/github.com/kongnanlive","recommend":false,"desc":"全新的快速索引导航栏，联系人字母排序侧边栏。","createTime":"2016-07-01T07:30:01.121000","tags":[{"userName":"Trinea","type":"open-source-project","createTime":"2016-07-01T07:30:01.121000","name":"快速索引"},{"userName":"Trinea","type":"open-source-project","createTime":"2016-07-01T07:30:01.121000","name":"ListView索引"}],"voteUp":0,"_id":"57761bf9fa7a4c321862b2d1","codeKKUrl":"http://p.codekk.com/detail/Android/kongnanlive/SideBar"},{"projectUrl":"https://github.com/gjiazhe/WaveSideBar","committer":"Trinea","updateTime":"2016-09-16T10:41:23.171000","hide":false,"lang":"Android","demoUrl":"","projectName":"WaveSideBar","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"gjiazhe","authorUrl":"https:/github.com/gjiazhe","recommend":false,"desc":"索引栏","createTime":"2016-09-16T10:41:23.171000","tags":[{"userName":"Trinea","type":"open-source-project","createTime":"2016-09-16T10:41:23.171000","name":"字母索引"}],"voteUp":0,"_id":"57dbcc53fa7a4c321862c2c2","codeKKUrl":"http://p.codekk.com/detail/Android/gjiazhe/WaveSideBar"},{"projectUrl":"https://github.com/wenhuaijun/SearchPictureTool","committer":"wenhuaijun","updateTime":"2016-02-17T13:26:39.753000","hide":false,"lang":"Android","demoUrl":"https://github.com/wenhuaijun/SearchPictureTool","projectName":"SearchPictureTool","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"wenhuaijun","authorUrl":"https:/github.com/wenhuaijun","recommend":false,"desc":"一款开源的图片搜索APP。Material Design风格。使用Rxjava，MVP快速开发框架，封装的RecyclerView，retrofit 2.0网络请求库，Fresco图片加载库，图片瀑布流和错位式布局。具有热门推荐、每日一笑、板块分类、一键下载图片、分享图片、收藏图片、设为桌面壁纸、设为锁屏壁纸等功能","createTime":"2016-02-17T13:26:39.753000","tags":[{"userName":"Trinea","contentId":"56c4750f4a38205862ef3d1d","type":"open-source-project","createTime":"2016-03-20T14:39:58.143000","name":"图片加载"},{"userName":"Trinea","contentId":"56c4750f4a38205862ef3d1d","type":"open-source-project","createTime":"2016-03-20T14:40:04.853000","name":"瀑布流"},{"userName":"Trinea","contentId":"56c4750f4a38205862ef3d1d","type":"open-source-project","createTime":"2016-03-20T14:40:09.289000","name":"Material Design"}],"voteUp":0,"_id":"56c4750f4a38205862ef3d1d","codeKKUrl":"http://p.codekk.com/detail/Android/wenhuaijun/SearchPictureTool"},{"projectUrl":"https://github.com/mcxtzhang/SuspensionIndexBar","committer":"mcxtzhang","updateTime":"2016-11-29T03:47:58.847000","hide":false,"lang":"Android","demoUrl":"","projectName":"SuspensionIndexBar","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"mcxtzhang","authorUrl":"https:/github.com/mcxtzhang","recommend":false,"desc":"快速实现分组悬停、右侧索引导航联动 列表。\n如 美团选择城市界面，微信通讯录界面、饿了么点餐界面等。","createTime":"2016-11-29T03:47:58.847000","tags":[{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"悬停"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"分组"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"索引"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"导航"},{"userName":"mcxtzhang","type":"open-source-project","createTime":"2016-11-29T03:47:58.847000","name":"A-Z索引"}],"voteUp":0,"_id":"583cfa6efa7a4c321862cf57","codeKKUrl":"http://p.codekk.com/detail/Android/mcxtzhang/SuspensionIndexBar"},{"lang":"Android","committer":"Trinea","updateTime":"2015-09-01T01:25:34","hide":false,"tags":[{"userName":"Trinea","contentId":"55edafd8d6459ae793499d28","type":"open-source-project","createTime":"2015-11-19T03:15:20.558000","name":"工具"}],"projectName":"android-resource-navigator","expiredTimes":0,"smallType":"五、其他","bigType":"第四部分 开发工具及测试工具","usedTimes":0,"source":"GitHub","authorName":"jgilfelt","voteUp":0,"projectUrl":"https://github.com/jgilfelt/android-resource-navigator","recommend":false,"desc":"chrome 插件，可以方便的查看 github 上 android 源码工程的 styles.xml 和 themes.xml。主要功能：(1) 快速打开 android styles.xml themes.xml(2) 方便在资源间跳转。styles.xml themes.xml 文件中资源链接跳转，可以方便跳转到某个资源(3) 方便查找某个 style 和 theme。chrome 地址栏输入 arn+tab+搜索内容回车即可(4) 自动下载不同分辨率下的 drawable(5) 通过映射查找那些不是按照固定命名规则命名的 style 和 theme","createTime":"2015-09-01T01:25:34","onlineDemoUrl":"https://chrome.google.com/webstore/detail/android-resource-navigato/agoomkionjjbejegcejiefodgbckeebo?hl=en&gl=GB","authorUrl":"https:/github.com/jgilfelt","_id":"55edafd8d6459ae793499d28","codeKKUrl":"http://p.codekk.com/detail/Android/jgilfelt/android-resource-navigator"},{"projectUrl":"https://github.com/7449/SlideView","committer":"7449","updateTime":"2016-07-08T02:32:05.744000","hide":false,"lang":"Android","demoUrl":"","projectName":"SlideView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"7449","authorUrl":"https:/github.com/7449","recommend":false,"desc":"模仿微信通讯录侧边快速索引","createTime":"2016-07-08T02:32:05.744000","tags":[{"userName":"7449","type":"open-source-project","createTime":"2016-07-08T02:32:05.745000","name":"slide 自定义view 快速索引"}],"voteUp":0,"_id":"577f10a5fa7a4c321862b3d7","codeKKUrl":"http://p.codekk.com/detail/Android/7449/SlideView"},{"projectUrl":"https://github.com/YoKeyword/IndexableRecyclerView","committer":"YoKeyword","updateTime":"2016-10-11T04:56:51.070000","hide":false,"lang":"Android","demoUrl":"","projectName":"IndexableRecyclerView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"YoKeyword","authorUrl":"https:/github.com/YoKeyword","recommend":false,"desc":"用于实现城市选择、联系人等功能的易拓展 RecyclerView 库，包含自动索引，粘性等功能","createTime":"2016-10-11T04:56:51.070000","tags":[{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-10-11T04:56:51.071000","name":"RecyclerView"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-10-11T04:56:51.071000","name":"Sticky"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-10-11T04:56:51.071000","name":"Index"},{"userName":"Trinea","contentId":"57fc7113fa7a4c321862c7bb","type":"open-source-project","createTime":"2016-10-11T08:55:25.145000","name":"联系人索引"}],"voteUp":0,"_id":"57fc7113fa7a4c321862c7bb","codeKKUrl":"http://p.codekk.com/detail/Android/YoKeyword/IndexableRecyclerView"},{"projectUrl":"https://github.com/YoKeyword/IndexableStickyListView","committer":"YoKeyword","updateTime":"2016-03-26T02:45:49.735000","hide":false,"lang":"Android","demoUrl":"","projectName":"IndexableStickyListView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"YoKeyword","authorUrl":"https:/github.com/YoKeyword","recommend":false,"desc":"IndexableListView + StickyListHeader功能的字母索引ListVIew，轻松实现选择城市、选择联系人等功能","createTime":"2016-03-26T02:45:49.735000","tags":[{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-03-26T02:45:49.735000","name":"ListView"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-03-26T02:45:49.735000","name":"Index"},{"userName":"YoKeyword","type":"open-source-project","createTime":"2016-03-26T02:45:49.735000","name":"Sticky"},{"userName":"mikedream89","contentId":"56f5f7dd4a38205862ef4558","type":"open-source-project","createTime":"2016-04-22T08:19:35.697000","name":"444"},{"userName":"changjieyy","contentId":"56f5f7dd4a38205862ef4558","type":"open-source-project","createTime":"2016-04-28T06:06:53.240000","name":"联系人"}],"voteUp":0,"_id":"56f5f7dd4a38205862ef4558","codeKKUrl":"http://p.codekk.com/detail/Android/YoKeyword/IndexableStickyListView"},{"lang":"Android","committer":"Trinea","updateTime":"2015-09-01T02:23:47","hide":false,"demoUrl":"https://github.com/Trinea/TrineaDownload/blob/master/indexable-listview.apk?raw=true","projectName":"IndexableListView","smallType":"一、ListView","apps":"微信通讯录、小米联系人","bigType":"第一部分 个性化控件(View)","usedTimes":0,"source":"GitHub","authorName":"woozzu","expiredTimes":0,"authorUrl":"https:/github.com/woozzu","projectUrl":"https://github.com/woozzu/IndexableListView","recommend":false,"desc":"ListView 右侧会显示 item 首字母快捷索引，点击可快速滑动到某个 item","createTime":"2015-09-01T02:23:47","voteUp":0,"_id":"55edafd7d6459ae793499b81","codeKKUrl":"http://p.codekk.com/detail/Android/woozzu/IndexableListView"},{"projectUrl":"https://github.com/jiang111/IndexRecyclerView","committer":"YumikoAzu","updateTime":"2016-03-20T06:10:39.905000","hide":false,"lang":"Android","demoUrl":"https://github.com/jiang111/IndexRecyclerView","projectName":"IndexRecyclerView","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"jiang111","authorUrl":"https:/github.com/jiang111","recommend":false,"desc":"通过RecyclerView实现联系人的功能。\n\n1.首字母悬浮在顶部。\n2.侧滑删除联系人。\n3.联系人索引。","createTime":"2016-03-20T06:10:39.905000","tags":[{"userName":"YumikoAzu","type":"open-source-project","createTime":"2016-03-20T06:10:39.905000","name":"RecyclerView"}],"voteUp":0,"_id":"56ee3edf4a38205862ef436c","codeKKUrl":"http://p.codekk.com/detail/Android/jiang111/IndexRecyclerView"},{"projectUrl":"https://github.com/D-clock/AndroidAlbum","committer":"D-clock","updateTime":"2016-01-27T12:02:17.947000","hide":false,"lang":"Android","demoUrl":"https://github.com/D-clock/AndroidAlbum","projectName":"AndroidAlbum","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"D-clock","authorUrl":"https:/github.com/D-clock","recommend":false,"desc":"一个图片选择器，特点如下：\n1、遵循MVP的编码设计；\n2、使用工厂模式抽象封装加载图片的框架，降低对具体加载图片框架的依赖；\n3、添加闪退日志的搜集机制，方便揪Bug；\n还在不断完善ing...","createTime":"2016-01-27T12:02:17.947000","tags":[{"userName":"D-clock","type":"open-source-project","createTime":"2016-01-27T12:02:17.947000","name":"图片选择"},{"userName":"D-clock","type":"open-source-project","createTime":"2016-01-27T12:02:17.948000","name":"MVP"},{"userName":"D-clock","type":"open-source-project","createTime":"2016-01-27T12:02:17.948000","name":"ImageSelector"}],"voteUp":0,"_id":"56a8b1c94a38205862ef3b1e","codeKKUrl":"http://p.codekk.com/detail/Android/D-clock/AndroidAlbum"},{"projectUrl":"https://github.com/JustWayward/BookReader","committer":"smuyyh","updateTime":"2016-09-18T00:47:41.454000","hide":false,"lang":"Android","demoUrl":"","projectName":"BookReader","expiredTimes":0,"usedTimes":0,"source":"User","authorName":"JustWayward","authorUrl":"https:/github.com/JustWayward","recommend":false,"desc":"任阅小说阅读器，高仿追书神器。基于 RxJava + Retrofit2 + Dagger2，结合 MVP 模式开发，项目结构清晰。实现追书推荐、标签检索、3D 仿真翻页效果、文章阅读、缓存章节、日夜间模式、文本朗读等功能。","createTime":"2016-09-18T00:47:41.454000","tags":[{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"阅读器"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"RxJava"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"Retrofit"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"Dagger"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"小说"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"MVP"},{"userName":"smuyyh","type":"open-source-project","createTime":"2016-09-18T00:47:41.454000","name":"追书神器"}],"voteUp":0,"_id":"57dde42dfa7a4c321862c2f6","codeKKUrl":"http://p.codekk.com/detail/Android/JustWayward/BookReader"},{"projectUrl":"https://github.com/SkillCollege/SimplifyReader","lang":"Android","updateTime":"2015-09-11T16:00:00","hide":false,"committer":"codeKKAuto","projectName":"SimplifyReader","expiredTimes":0,"voteUp":0,"usedTimes":0,"source":"GitHub","authorName":"SkillCollege","officialUrl":null,"recommend":false,"desc":"一款基于Google Material Design设计开发的Android客户端，包括新闻简读，图片浏览，视频爽看 ，音乐轻听以及二维码扫描五个子模块。项目采取的是MVP架构开发，由于还是摸索阶段，可能不是很规范。但基本上应该是这么个套路，至少我个人认为是这样的~恩，就是这样的！","createTime":"2015-09-11T16:00:00","authorUrl":"https://github.com/SkillCollege","_id":"55f3ddf4d6459ae79349a11a","codeKKUrl":"http://p.codekk.com/detail/Android/SkillCollege/SimplifyReader"}]
         * totalCount : 23
         * pageSize : 100
         */

        private boolean isFullSearch;
        private int totalCount;
        private int pageSize;
        private List<SearchProjectArrayBean> projectArray;

        public boolean isIsFullSearch() {
            return isFullSearch;
        }

        public void setIsFullSearch(boolean isFullSearch) {
            this.isFullSearch = isFullSearch;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public List<SearchProjectArrayBean> getProjectArray() {
            return projectArray;
        }

        public void setProjectArray(List<SearchProjectArrayBean> projectArray) {
            this.projectArray = projectArray;
        }

        public static class SearchProjectArrayBean implements Parcelable {

            /**
             * projectUrl : https://github.com/handsomezhou/QwertySearchLibrary
             * committer : handsomezhou
             * updateTime : 2016-02-02T03:19:06.453000
             * hide : false
             * lang : Android
             * demoUrl : https://github.com/handsomezhou/QwertySearchLibrary/blob/master/external_res/bin/QwertySearchDemo.ap
             * projectName : QwertySearchLibrary
             * expiredTimes : 0
             * usedTimes : 0
             * source : User
             * authorName : handsomezhou
             * authorUrl : https:/github.com/handsomezhou
             * recommend : false
             * desc : The library of QwertySearch,a Java Library Which provide data analysis methods,
             data matching method and so on for Qwerty pinyin search.
             * createTime : 2016-02-02T03:19:06.453000
             * tags : [{"userName":"handsomezhou","type":"open-source-project","createTime":"2016-02-02T03:19:06.453000","name":"Qwerty search"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:34.500000","name":"Pinyin search"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:40.738000","name":"拼音搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:19:56.603000","name":"模糊搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:20:34.876000","name":"全键盘搜索"},{"userName":"handsomezhou","contentId":"56b0202a4a38205862ef3bf9","type":"open-source-project","createTime":"2016-02-02T03:20:51.547000","name":"搜索"}]
             * voteUp : 0
             * _id : 56b0202a4a38205862ef3bf9
             * codeKKUrl : http://p.codekk.com/detail/Android/handsomezhou/QwertySearchLibrary
             * officialUrl : https://github.com/arimorty/floatingsearchview/blob/master/README.md
             * smallType : 二、项目
             * bigType : 第三部分 优秀项目
             * other : APK 地址：http://www.wandoujia.com/apps/com.scanbook
             * onlineDemoUrl : https://chrome.google.com/webstore/detail/android-resource-navigato/agoomkionjjbejegcejiefodgbckeebo?hl=en&gl=GB
             * apps : 微信通讯录、小米联系人
             */

            private String projectUrl;
            private String committer;
            private String updateTime;
            private boolean hide;
            private String lang;
            private String demoUrl;
            private String projectName;
            private int expiredTimes;
            private int usedTimes;
            private String source;
            private String authorName;
            private String authorUrl;
            private boolean recommend;
            private String desc;
            private String createTime;
            private int voteUp;
            private String _id;
            private String codeKKUrl;
            private String officialUrl;
            private String smallType;
            private String bigType;
            private String other;
            private String onlineDemoUrl;
            private String apps;
            private List<TagsBean> tags;

            public String getProjectUrl() {
                return projectUrl;
            }

            public void setProjectUrl(String projectUrl) {
                this.projectUrl = projectUrl;
            }

            public String getCommitter() {
                return committer;
            }

            public void setCommitter(String committer) {
                this.committer = committer;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public boolean isHide() {
                return hide;
            }

            public void setHide(boolean hide) {
                this.hide = hide;
            }

            public String getLang() {
                return lang;
            }

            public void setLang(String lang) {
                this.lang = lang;
            }

            public String getDemoUrl() {
                return demoUrl;
            }

            public void setDemoUrl(String demoUrl) {
                this.demoUrl = demoUrl;
            }

            public String getProjectName() {
                return projectName;
            }

            public void setProjectName(String projectName) {
                this.projectName = projectName;
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

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public int getVoteUp() {
                return voteUp;
            }

            public void setVoteUp(int voteUp) {
                this.voteUp = voteUp;
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

            public String getSmallType() {
                return smallType;
            }

            public void setSmallType(String smallType) {
                this.smallType = smallType;
            }

            public String getBigType() {
                return bigType;
            }

            public void setBigType(String bigType) {
                this.bigType = bigType;
            }

            public String getOther() {
                return other;
            }

            public void setOther(String other) {
                this.other = other;
            }

            public String getOnlineDemoUrl() {
                return onlineDemoUrl;
            }

            public void setOnlineDemoUrl(String onlineDemoUrl) {
                this.onlineDemoUrl = onlineDemoUrl;
            }

            public String getApps() {
                return apps;
            }

            public void setApps(String apps) {
                this.apps = apps;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean implements Parcelable {
                /**
                 * userName : handsomezhou
                 * type : open-source-project
                 * createTime : 2016-02-02T03:19:06.453000
                 * name : Qwerty search
                 * contentId : 56b0202a4a38205862ef3bf9
                 */

                private String userName;
                private String type;
                private String createTime;
                private String name;
                private String contentId;

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

                public String getContentId() {
                    return contentId;
                }

                public void setContentId(String contentId) {
                    this.contentId = contentId;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.userName);
                    dest.writeString(this.type);
                    dest.writeString(this.createTime);
                    dest.writeString(this.name);
                    dest.writeString(this.contentId);
                }

                public TagsBean() {
                }

                protected TagsBean(Parcel in) {
                    this.userName = in.readString();
                    this.type = in.readString();
                    this.createTime = in.readString();
                    this.name = in.readString();
                    this.contentId = in.readString();
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
                dest.writeString(this.projectUrl);
                dest.writeString(this.committer);
                dest.writeString(this.updateTime);
                dest.writeByte(this.hide ? (byte) 1 : (byte) 0);
                dest.writeString(this.lang);
                dest.writeString(this.demoUrl);
                dest.writeString(this.projectName);
                dest.writeInt(this.expiredTimes);
                dest.writeInt(this.usedTimes);
                dest.writeString(this.source);
                dest.writeString(this.authorName);
                dest.writeString(this.authorUrl);
                dest.writeByte(this.recommend ? (byte) 1 : (byte) 0);
                dest.writeString(this.desc);
                dest.writeString(this.createTime);
                dest.writeInt(this.voteUp);
                dest.writeString(this._id);
                dest.writeString(this.codeKKUrl);
                dest.writeString(this.officialUrl);
                dest.writeString(this.smallType);
                dest.writeString(this.bigType);
                dest.writeString(this.other);
                dest.writeString(this.onlineDemoUrl);
                dest.writeString(this.apps);
                dest.writeList(this.tags);
            }

            public SearchProjectArrayBean() {
            }

            protected SearchProjectArrayBean(Parcel in) {
                this.projectUrl = in.readString();
                this.committer = in.readString();
                this.updateTime = in.readString();
                this.hide = in.readByte() != 0;
                this.lang = in.readString();
                this.demoUrl = in.readString();
                this.projectName = in.readString();
                this.expiredTimes = in.readInt();
                this.usedTimes = in.readInt();
                this.source = in.readString();
                this.authorName = in.readString();
                this.authorUrl = in.readString();
                this.recommend = in.readByte() != 0;
                this.desc = in.readString();
                this.createTime = in.readString();
                this.voteUp = in.readInt();
                this._id = in.readString();
                this.codeKKUrl = in.readString();
                this.officialUrl = in.readString();
                this.smallType = in.readString();
                this.bigType = in.readString();
                this.other = in.readString();
                this.onlineDemoUrl = in.readString();
                this.apps = in.readString();
                this.tags = new ArrayList<TagsBean>();
                in.readList(this.tags, TagsBean.class.getClassLoader());
            }

            public static final Creator<SearchProjectArrayBean> CREATOR = new Creator<SearchProjectArrayBean>() {
                @Override
                public SearchProjectArrayBean createFromParcel(Parcel source) {
                    return new SearchProjectArrayBean(source);
                }

                @Override
                public SearchProjectArrayBean[] newArray(int size) {
                    return new SearchProjectArrayBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeByte(this.isFullSearch ? (byte) 1 : (byte) 0);
            dest.writeInt(this.totalCount);
            dest.writeInt(this.pageSize);
            dest.writeList(this.projectArray);
        }

        public SearchDataBean() {
        }

        protected SearchDataBean(Parcel in) {
            this.isFullSearch = in.readByte() != 0;
            this.totalCount = in.readInt();
            this.pageSize = in.readInt();
            this.projectArray = new ArrayList<SearchProjectArrayBean>();
            in.readList(this.projectArray, SearchProjectArrayBean.class.getClassLoader());
        }

        public static final Creator<SearchDataBean> CREATOR = new Creator<SearchDataBean>() {
            @Override
            public SearchDataBean createFromParcel(Parcel source) {
                return new SearchDataBean(source);
            }

            @Override
            public SearchDataBean[] newArray(int size) {
                return new SearchDataBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.code);
        dest.writeString(this.message);
        dest.writeParcelable(this.data, flags);
    }

    public SearchBean() {
    }

    protected SearchBean(Parcel in) {
        this.code = in.readInt();
        this.message = in.readString();
        this.data = in.readParcelable(SearchDataBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<SearchBean> CREATOR = new Parcelable.Creator<SearchBean>() {
        @Override
        public SearchBean createFromParcel(Parcel source) {
            return new SearchBean(source);
        }

        @Override
        public SearchBean[] newArray(int size) {
            return new SearchBean[size];
        }
    };
}
