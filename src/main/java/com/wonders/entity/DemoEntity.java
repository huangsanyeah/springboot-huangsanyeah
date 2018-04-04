package com.wonders.entity;

import com.wonders.validator.CustomAnnotation;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * @author huangweiyue
 * @date 2018-04-04 14:34
 * validator数据校验实体类
 */
public class DemoEntity implements Serializable {
    @NotBlank(message = "姓名不能为空")
    private String name;

    //@CustomAnnotation(message = "--address校验失败--")
    @CustomAnnotation
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
