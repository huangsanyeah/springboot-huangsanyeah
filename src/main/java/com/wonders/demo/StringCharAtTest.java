package com.wonders.demo;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 测试charAt方法
 * @date Created in 2019-04-22
 * @modifiedBy
 */
public class StringCharAtTest {
    public static void main(String[] args) {
        String queryType="011111";
        System.out.println(queryType.charAt(3));
        if('1'==(queryType.charAt(9))){
            System.out.println("首位是1");
        }else {
            System.out.println("首位是0");
        }
    }
}
