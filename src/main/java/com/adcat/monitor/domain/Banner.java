package com.adcat.monitor.domain;

import java.util.Date;

//table bmct_multi_pictures
public class Banner {

    //banner id
    private  long id;

    //图片路径1
    private  String img1;


    private  String img2;


    private  String img3;


    private  String img4;

    //最后修改时间
    private Date modifyTime;

    //轮播时间(s)
    private  long time;

    //轮播方式(2:下翻，4:淡入）
    private  long affect;


    public  long  getId(){
        return  this.id;
    };
    public  void  setId(long id){
        this.id=id;
    }

    public  String  getImg1(){
        return  this.img1;
    };
    public  void  setImg1(String img1){
        this.img1=img1;
    }

    public  String  getImg2(){
        return  this.img2;
    };
    public  void  setImg2(String img2){
        this.img2=img2;
    }

    public  String  getImg3(){
        return  this.img3;
    };
    public  void  setImg3(String img3){
        this.img3=img3;
    }

    public  String  getImg4(){
        return  this.img4;
    };
    public  void  setImg4(String img4){
        this.img4=img4;
    }

    public  Date  getModifyTime(){
        return  this.modifyTime;
    };
    public  void  setModifyTime(Date modifyTime){
        this.modifyTime=modifyTime;
    }

    public  long  getTime(){
        return  this.time;
    };
    public  void  setTime(long time){
        this.time=time;
    }

    public  long  getAffect(){
        return  this.affect;
    };
    public  void  setAffect(long affect){
        this.affect=affect;
    }


}