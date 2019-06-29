package com.wonders.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author huangweiyue
 * @description List<Integer> 排序测试 Integer已经默认实现了排序接口
 * @date Created in 2019-06-28
 */
public class ListIntegerComparableTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(55);
        list.add(66);
        list.add(1);
        list.add(0);
        list.add(12);
        list.add(9);
        Collections.sort(list);
        System.out.println(list);

    }
}
