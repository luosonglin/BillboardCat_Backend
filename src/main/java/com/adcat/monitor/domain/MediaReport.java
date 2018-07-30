package com.adcat.monitor.domain;

import java.util.Date;

//table bmct_mi_rl
public class MediaReport {

    //报备id
    private  long reportId;

    //客户名称
    private  String customerName = "";

    //所属行业
    private  String belongIndustry = "";

    //媒体名称
    private  String mediaName;

    //投放期
    private  String deliveryPeriod = "";

    //报备媒体
    private  String reportMedia = "";

    //报备者
    private  String reportPerson = "";

    //报备时间
    private  Date alarmTime;


    private  long userId;


    private Date putTimeStart;


    private  Date putTimeEnd;


    public  long  getReportId(){
        return  this.reportId;
    };
    public  void  setReportId(long reportId){
        this.reportId=reportId;
    }

    public  String  getCustomerName(){
        return  this.customerName;
    };
    public  void  setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public  String  getBelongIndustry(){
        return  this.belongIndustry;
    };
    public  void  setBelongIndustry(String belongIndustry){
        this.belongIndustry=belongIndustry;
    }

    public  String  getMediaName(){
        return  this.mediaName;
    };
    public  void  setMediaName(String mediaName){
        this.mediaName=mediaName;
    }

    public  String  getDeliveryPeriod(){
        return  this.deliveryPeriod;
    };
    public  void  setDeliveryPeriod(String deliveryPeriod){
        this.deliveryPeriod=deliveryPeriod;
    }

    public  String  getReportMedia(){
        return  this.reportMedia;
    };
    public  void  setReportMedia(String reportMedia){
        this.reportMedia=reportMedia;
    }

    public  String  getReportPerson(){
        return  this.reportPerson;
    };
    public  void  setReportPerson(String reportPerson){
        this.reportPerson=reportPerson;
    }

    public  Date  getAlarmTime(){
        return  this.alarmTime;
    };
    public  void  setAlarmTime(Date alarmTime){
        this.alarmTime=alarmTime;
    }

    public  long  getUserId(){
        return  this.userId;
    };
    public  void  setUserId(long userId){
        this.userId=userId;
    }

    public  Date  getPutTimeStart(){
        return  this.putTimeStart;
    };
    public  void  setPutTimeStart(Date putTimeStart){
        this.putTimeStart=putTimeStart;
    }

    public  Date  getPutTimeEnd(){
        return  this.putTimeEnd;
    };
    public  void  setPutTimeEnd(Date putTimeEnd){
        this.putTimeEnd=putTimeEnd;
    }


}
