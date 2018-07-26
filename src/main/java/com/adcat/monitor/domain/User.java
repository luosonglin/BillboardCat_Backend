package com.adcat.monitor.domain;

import javax.validation.constraints.Min;

public class User {
    private Long id;
    private String name;
    @Min(value = 18,message = "未成年禁止入内")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
