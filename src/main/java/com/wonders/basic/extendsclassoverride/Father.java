package com.wonders.basic.extendsclassoverride;

import lombok.Data;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 父子类继承关系方法重写
 * @date Created in 2019-06-07
 * @modifiedBy
 */
@Data
public class Father {
    private String fatherName;
    private String address;
    public void printName(String fatherName){
        System.out.println("【父类】输出"+fatherName);
    }
}
