package com.wonders.basic.extendsclassoverride;

import lombok.Data;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description Father的子类Son
 * @date Created in 2019-06-08
 * @modifiedBy
 */
@Data
public class Son extends Father{

    //private String fatherName;


    private String sonName;


    /**
     * 这个方法如果不override(可以注释掉这 然后运行ClassExtentsTest的main方法查看输出) 那么用的就是父类的
     * @param fatherName
     */
    @Override
    public void printName(String fatherName){
        System.out.println("【子类】输出"+fatherName);
    }

    public void setFahertName(String name){
        super.setFatherName(name);
    }

    public Son() {
    }

    public Son(String sonName) {
        super.
        this.sonName = sonName;
    }
}
