package com.adcat.monitor.domain;

public class Area {

    private long id;


    private String name;

    //0
    private long parentId;


    private long sort;


    public long getId() {
        return this.id;
    }

    ;

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    ;

    public void setName(String name) {
        this.name = name;
    }

    public long getParentId() {
        return this.parentId;
    }

    ;

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public long getSort() {
        return this.sort;
    }

    ;

    public void setSort(long sort) {
        this.sort = sort;
    }

}
