package com.wonders.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 《码出高效》P161 list to array
 * @date Created in 2019-06-27
 * @modifiedBy
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Object[] array = list.toArray();

        String[] array1 = new String[4];

        list.toArray(array1);
        //返回[null, null, null, null]
        System.out.println(Arrays.asList(array1));

        String[] array2 = new String[8];
        list.toArray(array2);
        System.out.println(Arrays.asList(array2));

        String[] array3 = new String[list.size()];
        list.toArray(array3);
        System.out.println(Arrays.asList(array3));


    }
}
