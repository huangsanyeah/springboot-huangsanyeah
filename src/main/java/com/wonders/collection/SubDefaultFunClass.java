package com.wonders.collection;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description java8接口的default默认方法 字类可以直接调用
 * @date Created in 2019-06-20
 * @modifiedBy
 */
public class SubDefaultFunClass implements DefaultFunInterface {
    public static void main(String[] args) {
        //实例化一个子类对象，该子类对象可以直接调用父接口中的默认方法 count
        SubDefaultFunClass sub = new SubDefaultFunClass();
        int value = sub.count();
        System.out.println("result：" + value);
    }
}
