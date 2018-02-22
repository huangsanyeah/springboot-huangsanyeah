package com.wonders.entity;

import java.io.Serializable;

/**
 * @author huangwieyue
 * @date 2018-02-22 14:55
 */
public class PoiEntity implements Serializable{
    private Integer id;
    private String name;
    private String age;

    public PoiEntity(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
