package com.adcat.monitor.domain;


import java.util.Date;

//bmct_search_media
public class SearchMedia {


    private long id;

    //用户的ID
    private long userId;

    //产品名称
    private String productName;

    //所属行业
    private String belongIndustry;

    //媒体形式
    private String mediaWays;

    //投放开始时间
    private Date putTimeStart;

    //投放结束时间
    private Date putTimeEnd;

    //投放位置
    private String putPosition;

    //投放信息
    private String putInformation;

    //投放预算
    private String putBudget;

    //状态：0:未处理 1:已处理
    private long status = 0;

    //审核人员(管理员)ID
    private long reviewId;

    //审核人员名称
    private String reviewName;


    public long getId() {
        return this.id;
    }

    ;

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return this.userId;
    }

    ;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return this.productName;
    }

    ;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBelongIndustry() {
        return this.belongIndustry;
    }

    ;

    public void setBelongIndustry(String belongIndustry) {
        this.belongIndustry = belongIndustry;
    }

    public String getMediaWays() {
        return this.mediaWays;
    }

    ;

    public void setMediaWays(String mediaWays) {
        this.mediaWays = mediaWays;
    }

    public Date getPutTimeStart() {
        return this.putTimeStart;
    }

    ;

    public void setPutTimeStart(Date putTimeStart) {
        this.putTimeStart = putTimeStart;
    }

    public Date getPutTimeEnd() {
        return this.putTimeEnd;
    }

    ;

    public void setPutTimeEnd(Date putTimeEnd) {
        this.putTimeEnd = putTimeEnd;
    }

    public String getPutPosition() {
        return this.putPosition;
    }

    ;

    public void setPutPosition(String putPosition) {
        this.putPosition = putPosition;
    }

    public String getPutInformation() {
        return this.putInformation;
    }

    ;

    public void setPutInformation(String putInformation) {
        this.putInformation = putInformation;
    }

    public String getPutBudget() {
        return this.putBudget;
    }

    ;

    public void setPutBudget(String putBudget) {
        this.putBudget = putBudget;
    }

    public long getStatus() {
        return this.status;
    }

    ;

    public void setStatus(long status) {
        this.status = status;
    }

    public long getReviewId() {
        return this.reviewId;
    }

    ;

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewName() {
        return this.reviewName;
    }

    ;

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }


}