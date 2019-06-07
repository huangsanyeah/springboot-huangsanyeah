package com.wonders.basic.extendsclassoverride;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description Father的子类Son
 * @date Created in 2019-06-08
 * @modifiedBy
 */
public class Son extends Father{

    /**
     * 这个方法如果不复写 那么用的就是父类的
     * @param fatherName
     */
    @Override
    public void printName(String fatherName){
        System.out.println("【子类】输出"+fatherName);
    }
}
