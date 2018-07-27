package com.adcat.monitor.domain;


import com.adcat.monitor.Util.DateUtils;

import java.util.Date;

public class User {

    //用户id
    private  long userId;

    //性质（个人:1/企业:2）
    private  int property = 1;

    //密码
    private  String password = "";

    //名称（个体名称或公司名称）
    private  String name = "";

    //类型（1:游客/2:广告主/3:媒体主/4:代理商）
    private  int groupid = 1;

    //手机
    private  String phoneNum;

    //关注区域
    private  String concernArea;

    //用户状态:0禁用，1启用，-1删除
    private  int status = 1;

    //-1 审核拒绝，0未审核，1已审核，2系统输入
    private  int userStatus = 0;

    //省
    private  String province;

    //市
    private  String city;

    //区
    private  String county;

    //初次录入时间
    private  Date firstEntryTime;

    //用户信息最后修改时间
    private  Date lastModifyTime;

    //是否申请媒体主，0:否 1:是
    private  int mediaStatus = 0;

    //头像url
    private  String avatar = "http://owvctf4l4.bkt.clouddn.com/useravatar_52";



    public  long  getUserId(){
        return  this.userId;
    };
    public  void  setUserId(long userId){
        this.userId=userId;
    }

    public  int  getProperty(){
        return  this.property;
    };
    public  void  setProperty(int property){
        this.property=property;
    }

    public  String  getPassword(){
        return  this.password;
    };
    public  void  setPassword(String password){
        this.password=password;
    }

    public  String  getName(){
        return  this.name;
    };
    public  void  setName(String name){
        this.name=name;
    }

    public  int  getGroupid(){
        return  this.groupid;
    };
    public  void  setGroupid(int groupid){
        this.groupid=groupid;
    }

    public  String  getPhoneNum(){
        return  this.phoneNum;
    };
    public  void  setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }

    public  String  getConcernArea(){
        return  this.concernArea;
    };
    public  void  setConcernArea(String concernArea){
        this.concernArea=concernArea;
    }

    public  int  getStatus(){
        return  this.status;
    };
    public  void  setStatus(int status){
        this.status=status;
    }

    public  int  getUserStatus(){
        return  this.userStatus;
    };
    public  void  setUserStatus(int userStatus){
        this.userStatus=userStatus;
    }

    public  String  getProvince(){
        return  this.province;
    };
    public  void  setProvince(String province){
        this.province=province;
    }

    public  String  getCity(){
        return  this.city;
    };
    public  void  setCity(String city){
        this.city=city;
    }

    public  String  getCounty(){
        return  this.county;
    };
    public  void  setCounty(String county){
        this.county=county;
    }

    public  Date  getFirstEntryTime(){
        return  this.firstEntryTime;
    };
    public  void  setFirstEntryTime(Date firstEntryTime){
        this.firstEntryTime=firstEntryTime;
    }

    public Date getLastModifyTime(){
        return  this.lastModifyTime;
    };
    public  void  setLastModifyTime(Date lastModifyTime){
        this.lastModifyTime=lastModifyTime;
    }

    public  int  getMediaStatus(){
        return  this.mediaStatus;
    };
    public  void  setMediaStatus(int mediaStatus){
        this.mediaStatus=mediaStatus;
    }

    public  String  getAvatar(){
        return  this.avatar;
    };
    public  void  setAvatar(String avatar){
        this.avatar=avatar;
    }


}
