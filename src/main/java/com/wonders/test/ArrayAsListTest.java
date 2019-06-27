package com.wonders.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 《码出高效》P159 array转List示例 注意 只能set!!! 不能修改元素的个数 java.lang.UnsupportedOperationException
 * @date Created in 2019-06-27
 * @modifiedBy
 */
public class ArrayAsListTest {
    public static void main(String[] args) {
        String[] stringArray=new String[3];
        stringArray[0]="one";
        stringArray[1]="two";
        stringArray[2]="three";

        //array to list
        List<String> stringList= Arrays.asList(stringArray);

        stringList.set(0,"oneList");
        System.out.println(stringArray[0]);
        System.out.println(stringList);

        //可以看到数组第一个元素的值也被修改为了oneList
        for (String s : stringArray) {
            System.out.println(s);
        }

        //如下三个方法修改了个数 java.lang.UnsupportedOperationException异常
        //stringList.add("four");
//        stringList.remove(2);
//        stringList.clear();

        stringList.replaceAll( e -> e.toUpperCase() );

        System.out.println(stringList);
    }
}