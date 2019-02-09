package com.wonders.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description isEmpty判断的是==null size=0
 * @date Created in 2018-11-19
 * @modifiedBy
 */
public class CollectionEmpty {
    public static void main(String[] args) {
        System.out.println(finallyNotWork());
    }

    public static int finallyNotWork() {
        int temp = 10000;
        try {
            throw new Exception();
        } catch (Exception e) {
            return ++temp;
        } finally {
            temp = 9999;
        }
    }

    List<Object> k = new ArrayList<>();
}
