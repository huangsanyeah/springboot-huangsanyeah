package com.wonders.basic.extendsclassoverride;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-06-08
 * @modifiedBy
 */
public class ClassExtentsTest {
    public static void main(String[] args) {
        Father son=new Son();
        son.printName("爸爸");

        Father father=new Father();
        father.printName("爸爸");
    }
}
