package com.adcat.monitor.dto;

import java.util.List;

public class ErrorDto<K, T> {

    public static final Integer OK = 200;   //请求正常处理完毕
    public static final Integer No_Content = 204;   //请求成功处理，没有实体的主体返回
    public static final Integer Partial_Content = 206;  //GET范围请求已成功处理

    public static final Integer Moved_Permanently = 301;    //永久重定向，资源已永久分配新URI
    public static final Integer Found = 302;                //临时重定向，资源已临时分配新URI
    public static final Integer See_Other = 303;            //临时重定向，期望使用GET定向获取
    public static final Integer Not_Modified = 304;     //发送的附带条件请求未满足
    public static final Integer Temporary_Redirect = 307;   //临时重定向，POST不会变成GET

    public static final Integer Bad_Request = 400;   //请求报文语法错误或参数错误
    public static final Integer Unauthorized = 401;   //需要通过HTTP认证，或认证失败
    public static final Integer Forbidden = 403;   //请求资源被拒绝
    public static final Integer Not_Found = 404;   //无法找到请求资源（服务器无理由拒绝）

    public static final Integer Internal_Server_Error = 500;   //服务器故障或Web应用故障
    public static final Integer Service_Unavailable = 503;   //服务器超负载或停机维护


    /**
     * status : success
     * msg : 成功
     * errorCode : 200
     * entity : {"sysList":[{"id":3,"labelName":"神经","useCount":208,"searchCount":1963,"sort":3,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E7%A5%9E%E7%BB%8F.png","labelType":"COMMON"},{"id":7,"labelName":"外科","useCount":395,"searchCount":5791,"sort":37,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%A4%96%E7%A7%91.png","labelType":"COMMON"},{"id":8,"labelName":"五官科","useCount":69,"searchCount":1917,"sort":8,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E8%80%B3%E9%BC%BB%E5%96%89.png","labelType":"COMMON"},{"id":9,"labelName":"骨科","useCount":138,"searchCount":2458,"sort":9,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E9%AA%A8%E5%A4%B4.png","labelType":"COMMON"},{"id":10,"labelName":"儿科","useCount":53,"searchCount":1765,"sort":10,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%84%BF%E7%A7%91.png","labelType":"COMMON"},{"id":11,"labelName":"妇产科","useCount":70,"searchCount":549,"sort":11,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%A6%87%E4%BA%A7%E7%A7%91.png","labelType":"COMMON"},{"id":12,"labelName":"肿瘤科","useCount":37,"searchCount":610,"sort":12,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E8%82%BF%E7%98%A4%E7%A7%91.png","labelType":"COMMON"},{"id":13,"labelName":"眼科","useCount":14,"searchCount":111,"sort":13,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E7%9C%BC%E7%A7%91.png","labelType":"COMMON"},{"id":15,"labelName":"医学影像","useCount":23,"searchCount":277,"sort":15,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%BD%B1%E5%83%8F.png","labelType":"COMMON"},{"id":17,"labelName":"口腔科","useCount":10,"searchCount":206,"sort":17,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%8F%A3%E8%85%94.png","labelType":"COMMON"},{"id":18,"labelName":"中医科","useCount":18,"searchCount":110,"sort":18,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E4%B8%AD%E5%8C%BB.png","labelType":"COMMON"},{"id":19,"labelName":"康复","useCount":15,"searchCount":66,"sort":19,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%BA%B7%E5%A4%8D.png","labelType":"COMMON"},{"id":21,"labelName":"传染科","useCount":9,"searchCount":98,"sort":21,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E6%84%9F%E6%9F%93.png","labelType":"COMMON"},{"id":23,"labelName":"皮肤性病科","useCount":20,"searchCount":63,"sort":23,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E7%9A%AE%E8%82%A4.png","labelType":"COMMON"},{"id":24,"labelName":"检验科","useCount":19,"searchCount":79,"sort":24,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E6%A3%80%E9%AA%8C%E7%A7%91.png","labelType":"COMMON"},{"id":26,"labelName":"急诊医学科","useCount":14,"searchCount":92,"sort":26,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E6%80%A5%E8%AF%8A.png","labelType":"COMMON"},{"id":33,"labelName":"其他","useCount":407,"searchCount":401,"sort":99,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%85%B6%E4%BB%96.png","labelType":"COMMON"},{"id":36,"labelName":"男科","useCount":42,"searchCount":772,"sort":6,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/Rectangle%208.png","labelType":"COMMON"},{"id":37,"labelName":"运动医学","useCount":18,"searchCount":367,"sort":7,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/Rectangle%209@1.5x.png","labelType":"COMMON"},{"id":38,"labelName":"血管外科","useCount":79,"searchCount":6506,"sort":1,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E8%A1%80%E7%AE%A1%E5%A4%96%E7%A7%91@1.5x.png","labelType":"LIVE"},{"id":39,"labelName":"麻醉科","useCount":1,"searchCount":56,"sort":39,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E9%BA%BB%E9%86%89%E7%A7%91.png","labelType":"COMMON"},{"id":40,"labelName":"重症医学科","useCount":1,"searchCount":106,"sort":40,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E9%87%8D%E7%97%87%E5%8C%BB%E5%AD%A6%E7%A7%91.png","labelType":"COMMON"},{"id":41,"labelName":"营养科","useCount":1,"searchCount":56,"sort":41,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E8%90%A5%E5%85%BB%E7%A7%91.png","labelType":"COMMON"},{"id":42,"labelName":"医疗美容科","useCount":6,"searchCount":107,"sort":42,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%8C%BB%E7%96%97%E7%BE%8E%E5%AE%B9%E7%A7%91.png","labelType":"COMMON"},{"id":43,"labelName":"中西医结合科","useCount":0,"searchCount":80,"sort":43,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E4%B8%AD%E8%A5%BF%E5%8C%BB%E7%BB%93%E5%90%88%E7%A7%91.png","labelType":"COMMON"},{"id":44,"labelName":"结核病科","useCount":0,"searchCount":43,"sort":44,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E7%BB%93%E6%A0%B8%E7%97%85%E7%A7%91.png","labelType":"COMMON"},{"id":45,"labelName":"病理科","useCount":2,"searchCount":47,"sort":45,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E7%97%85%E7%90%86%E7%A7%91.png","labelType":"COMMON"},{"id":46,"labelName":"体检科","useCount":0,"searchCount":31,"sort":46,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E4%BD%93%E6%A3%80%E7%A7%91.png","labelType":"COMMON"},{"id":47,"labelName":"医院管理","useCount":3,"searchCount":53,"sort":47,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%8C%BB%E9%99%A2%E7%AE%A1%E7%90%86.png","labelType":"COMMON"},{"id":48,"labelName":"内科","useCount":68,"searchCount":925,"sort":48,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%86%85%E7%A7%91.png","labelType":"COMMON"},{"id":49,"labelName":"精神心理科","useCount":12,"searchCount":199,"sort":49,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E7%B2%BE%E7%A5%9E%E5%BF%83%E7%90%86%20copy.png","labelType":"COMMON"},{"id":50,"labelName":"康复医学科","useCount":0,"searchCount":42,"sort":50,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%BA%B7%E5%A4%8D%E5%8C%BB%E5%AD%A6%E7%A7%91.png","labelType":"COMMON"},{"id":51,"labelName":"医疗科技","useCount":0,"searchCount":0,"sort":51,"iconUrl":null,"labelType":"EVENT"},{"id":52,"labelName":"前沿医术","useCount":0,"searchCount":0,"sort":52,"iconUrl":null,"labelType":"EVENT"},{"id":53,"labelName":"运动健身","useCount":0,"searchCount":0,"sort":83,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":54,"labelName":"亲子活动","useCount":0,"searchCount":0,"sort":84,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":55,"labelName":"户外出游","useCount":0,"searchCount":0,"sort":85,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":56,"labelName":"互联网","useCount":0,"searchCount":0,"sort":86,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":57,"labelName":"科技","useCount":0,"searchCount":0,"sort":87,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":58,"labelName":"创业投资","useCount":0,"searchCount":0,"sort":88,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":59,"labelName":"职场提升","useCount":0,"searchCount":0,"sort":89,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":60,"labelName":"丽人时尚","useCount":0,"searchCount":0,"sort":90,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":61,"labelName":"演出娱乐","useCount":0,"searchCount":0,"sort":91,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":62,"labelName":"单身交友","useCount":0,"searchCount":0,"sort":92,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":63,"labelName":"文艺生活","useCount":0,"searchCount":0,"sort":93,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":64,"labelName":"公益文化","useCount":0,"searchCount":0,"sort":94,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":65,"labelName":"教育培训","useCount":0,"searchCount":0,"sort":95,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":66,"labelName":"金融","useCount":0,"searchCount":0,"sort":96,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":67,"labelName":"设计","useCount":0,"searchCount":0,"sort":97,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":68,"labelName":"职场","useCount":0,"searchCount":0,"sort":98,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":69,"labelName":"影视","useCount":0,"searchCount":0,"sort":99,"iconUrl":null,"labelType":"EVENT_OTHER"},{"id":70,"labelName":"基础医学","useCount":0,"searchCount":0,"sort":53,"iconUrl":null,"labelType":"EVENT"},{"id":71,"labelName":"临床诊断学","useCount":0,"searchCount":0,"sort":54,"iconUrl":null,"labelType":"EVENT"},{"id":72,"labelName":"治疗学","useCount":0,"searchCount":0,"sort":55,"iconUrl":null,"labelType":"EVENT"},{"id":73,"labelName":"保健医学","useCount":0,"searchCount":0,"sort":56,"iconUrl":null,"labelType":"EVENT"},{"id":74,"labelName":"护理","useCount":0,"searchCount":0,"sort":57,"iconUrl":null,"labelType":"EVENT"},{"id":75,"labelName":"预防医学","useCount":0,"searchCount":0,"sort":58,"iconUrl":null,"labelType":"EVENT"},{"id":76,"labelName":"军事医学与特种医学","useCount":0,"searchCount":0,"sort":59,"iconUrl":null,"labelType":"EVENT"},{"id":77,"labelName":"药学","useCount":0,"searchCount":0,"sort":60,"iconUrl":null,"labelType":"EVENT"},{"id":78,"labelName":"中药学","useCount":0,"searchCount":0,"sort":61,"iconUrl":null,"labelType":"EVENT"},{"id":79,"labelName":"热点新闻与红头文件","useCount":0,"searchCount":0,"sort":62,"iconUrl":null,"labelType":"EVENT"},{"id":80,"labelName":"心血管内科","useCount":0,"searchCount":0,"sort":63,"iconUrl":null,"labelType":"EVENT"},{"id":81,"labelName":"呼吸内科","useCount":0,"searchCount":0,"sort":64,"iconUrl":null,"labelType":"EVENT"},{"id":82,"labelName":"消化内科","useCount":0,"searchCount":0,"sort":65,"iconUrl":null,"labelType":"EVENT"},{"id":83,"labelName":"血液内科","useCount":0,"searchCount":0,"sort":66,"iconUrl":null,"labelType":"EVENT"},{"id":84,"labelName":"肾脏内科","useCount":0,"searchCount":0,"sort":67,"iconUrl":null,"labelType":"EVENT"},{"id":85,"labelName":"内分泌学与代谢学","useCount":0,"searchCount":0,"sort":68,"iconUrl":null,"labelType":"EVENT"},{"id":86,"labelName":"风湿病学与自体免疫病学","useCount":0,"searchCount":0,"sort":69,"iconUrl":null,"labelType":"EVENT"},{"id":87,"labelName":"感染性疾病学","useCount":0,"searchCount":0,"sort":70,"iconUrl":null,"labelType":"EVENT"},{"id":88,"labelName":"普外科","useCount":0,"searchCount":0,"sort":71,"iconUrl":null,"labelType":"EVENT"},{"id":89,"labelName":"神经外科","useCount":0,"searchCount":0,"sort":72,"iconUrl":null,"labelType":"EVENT"},{"id":90,"labelName":"颅脑外科","useCount":0,"searchCount":0,"sort":73,"iconUrl":null,"labelType":"EVENT"},{"id":91,"labelName":"胸外科","useCount":0,"searchCount":0,"sort":74,"iconUrl":null,"labelType":"EVENT"},{"id":92,"labelName":"血管外科","useCount":0,"searchCount":0,"sort":75,"iconUrl":null,"labelType":"EVENT"},{"id":93,"labelName":"泌尿生殖外科","useCount":0,"searchCount":0,"sort":76,"iconUrl":null,"labelType":"EVENT"},{"id":94,"labelName":"骨外科","useCount":0,"searchCount":0,"sort":77,"iconUrl":null,"labelType":"EVENT"},{"id":95,"labelName":"烧伤外科","useCount":0,"searchCount":0,"sort":78,"iconUrl":null,"labelType":"EVENT"},{"id":96,"labelName":"整形外科","useCount":0,"searchCount":0,"sort":79,"iconUrl":null,"labelType":"EVENT"},{"id":97,"labelName":"手外科","useCount":0,"searchCount":0,"sort":80,"iconUrl":null,"labelType":"EVENT"}],"defaultList":[{"id":34,"labelName":"医疗科技","useCount":3,"searchCount":59,"sort":34,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%8C%BB%E7%96%97%E7%A7%91%E6%8A%80.png","labelType":"LIVE,NEWS"},{"id":35,"labelName":"医疗人文","useCount":4,"searchCount":43,"sort":35,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%8C%BB%E7%96%97%E4%BA%BA%E6%96%87.png","labelType":"LIVE,NEWS"}]}
     * data : null
     * total : 2
     * pageNum : 2
     * pageSize : 2
     * totalPages : 2
     * extra : null
     */

    private String status;
    private String msg;
    private int errorCode;
    private K entity;
    private List<T> data;
    private int total;
    private int pageNum;
    private int pageSize;
    private int totalPages;
    private Object extra;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public K getEntity() {
        return entity;
    }

    public void setEntity(K entity) {
        this.entity = entity;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public static class EntityBean {
        public static class SysListBean {
            /**
             * id : 3
             * labelName : 神经
             * useCount : 208
             * searchCount : 1963
             * sort : 3
             * iconUrl : http://onmtzwa3g.bkt.clouddn.com/%E7%A5%9E%E7%BB%8F.png
             * labelType : COMMON
             */

            private int id;
            private String labelName;
            private int useCount;
            private int searchCount;
            private int sort;
            private String iconUrl;
            private String labelType;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLabelName() {
                return labelName;
            }

            public void setLabelName(String labelName) {
                this.labelName = labelName;
            }

            public int getUseCount() {
                return useCount;
            }

            public void setUseCount(int useCount) {
                this.useCount = useCount;
            }

            public int getSearchCount() {
                return searchCount;
            }

            public void setSearchCount(int searchCount) {
                this.searchCount = searchCount;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getIconUrl() {
                return iconUrl;
            }

            public void setIconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
            }

            public String getLabelType() {
                return labelType;
            }

            public void setLabelType(String labelType) {
                this.labelType = labelType;
            }
        }

        public static class DefaultListBean {
            /**
             * id : 34
             * labelName : 医疗科技
             * useCount : 3
             * searchCount : 59
             * sort : 34
             * iconUrl : http://onmtzwa3g.bkt.clouddn.com/%E5%8C%BB%E7%96%97%E7%A7%91%E6%8A%80.png
             * labelType : LIVE,NEWS
             */

            private int id;
            private String labelName;
            private int useCount;
            private int searchCount;
            private int sort;
            private String iconUrl;
            private String labelType;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLabelName() {
                return labelName;
            }

            public void setLabelName(String labelName) {
                this.labelName = labelName;
            }

            public int getUseCount() {
                return useCount;
            }

            public void setUseCount(int useCount) {
                this.useCount = useCount;
            }

            public int getSearchCount() {
                return searchCount;
            }

            public void setSearchCount(int searchCount) {
                this.searchCount = searchCount;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getIconUrl() {
                return iconUrl;
            }

            public void setIconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
            }

            public String getLabelType() {
                return labelType;
            }

            public void setLabelType(String labelType) {
                this.labelType = labelType;
            }
        }
    }
}
