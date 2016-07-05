package com.blue.testretrofit.dao;

import java.util.List;

/**
 * 福利数据模型
 * Created by xybcoder on 2016/3/1.
 * 数据格式见：http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1
 */
public class MeiziData {

    /**
     * error : false
     * results : [{"_id":"5779d746421aa964a66e5892","createdAt":"2016-07-04T11:25:58.11Z","desc":"EditText的撤销和反撤销","publishedAt":"2016-07-04T12:21:38.653Z","source":"web","type":"Android","url":"https://github.com/qinci/AndroidEdit","used":true,"who":null},{"_id":"5779b195421aa90191bc2a31","createdAt":"2016-07-04T08:45:09.333Z","desc":"与 so 有关的一个长年大坑","publishedAt":"2016-07-04T12:21:38.653Z","source":"chrome","type":"Android","url":"https://zhuanlan.zhihu.com/p/21359984","used":true,"who":"MVP"},{"_id":"5778eedf421aa90193d85b93","createdAt":"2016-07-03T18:54:23.470Z","desc":"阿里Weex框架Android平台初体验","publishedAt":"2016-07-04T12:21:38.653Z","source":"web","type":"Android","url":"http://smilevenus.com/2016/07/03/阿里Weex框架Android平台初体验/","used":true,"who":null},{"_id":"577725a2421aa9018f352380","createdAt":"2016-07-02T10:23:30.589Z","desc":"Rx和RxJava文档中文翻译项目","publishedAt":"2016-07-04T12:21:38.653Z","source":"chrome","type":"Android","url":"https://github.com/mcxiaoke/RxDocs","used":true,"who":"蒋朋"},{"_id":"577626f2421aa97a566cc17f","createdAt":"2016-07-01T16:16:50.418Z","desc":"Markdown编辑器","publishedAt":"2016-07-04T12:21:38.653Z","source":"chrome","type":"Android","url":"https://github.com/qinci/MarkdownEditors","used":true,"who":"蒋朋"},{"_id":"5775c331421aa901fb9825ed","createdAt":"2016-07-01T09:11:13.536Z","desc":"Android消息处理机制(Handler、Looper、MessageQueue与Message)，这是我见过最好的一篇了","publishedAt":"2016-07-01T11:06:20.244Z","source":"chrome","type":"Android","url":"http://www.cnblogs.com/angeldevil/p/3340644.html","used":true,"who":"花开堪折枝"},{"_id":"5775c21b421aa97a566cc16a","createdAt":"2016-07-01T09:06:35.743Z","desc":"Float Button 圆形进度条效果","publishedAt":"2016-07-01T11:06:20.244Z","source":"chrome","type":"Android","url":"https://github.com/DmitryMalkovich/circular-with-floating-action-button","used":true,"who":"代码家"},{"_id":"5775c190421aa901fb9825ec","createdAt":"2016-07-01T09:04:16.135Z","desc":"Material Design 风格的搜索效果","publishedAt":"2016-07-01T11:06:20.244Z","source":"chrome","type":"Android","url":"https://github.com/Mauker1/MaterialSearchView","used":true,"who":"代码家"},{"_id":"5775c137421aa97a566cc169","createdAt":"2016-07-01T09:02:47.410Z","desc":"节操精选家开源的视频播放器解决方案","publishedAt":"2016-07-01T11:06:20.244Z","source":"chrome","type":"Android","url":"https://github.com/lipangit/JieCaoVideoPlayer","used":true,"who":"代码家"},{"_id":"57755676421aa97a566cc167","createdAt":"2016-07-01T01:27:18.971Z","desc":"Material Design初露锋芒之复杂视图轻松实现","publishedAt":"2016-07-01T11:06:20.244Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/e64a4e08f57a","used":true,"who":null}]
     */

    private boolean error;
    /**
     * _id : 5779d746421aa964a66e5892
     * createdAt : 2016-07-04T11:25:58.11Z
     * desc : EditText的撤销和反撤销
     * publishedAt : 2016-07-04T12:21:38.653Z
     * source : web
     * type : Android
     * url : https://github.com/qinci/AndroidEdit
     * used : true
     * who : null
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private Object who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public Object getWho() {
            return who;
        }

        public void setWho(Object who) {
            this.who = who;
        }
    }
}
