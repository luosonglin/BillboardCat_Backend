package com.adcat.monitor.dto;

import java.util.List;

public class ResponseData<K, T> {

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
     * entity : {"sysList":[{"id":96,"labelName":"整形外科","useCount":0,"searchCount":0,"sort":79,"iconUrl":null,"labelType":"EVENT"},{"id":97,"labelName":"手外科","useCount":0,"searchCount":0,"sort":80,"iconUrl":null,"labelType":"EVENT"}],"defaultList":[{"id":34,"labelName":"医疗科技","useCount":3,"searchCount":59,"sort":34,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%8C%BB%E7%96%97%E7%A7%91%E6%8A%80.png","labelType":"LIVE,NEWS"},{"id":35,"labelName":"医疗人文","useCount":4,"searchCount":43,"sort":35,"iconUrl":"http://onmtzwa3g.bkt.clouddn.com/%E5%8C%BB%E7%96%97%E4%BA%BA%E6%96%87.png","labelType":"LIVE,NEWS"}]}
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
}
