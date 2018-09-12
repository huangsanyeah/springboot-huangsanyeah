package com.wonders.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description java 8 方法引用
 * @date Created in 2018-08-31
 * @modifiedBy
 */
public class MethodReference {
    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
        names.forEach(System.out::print);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //偶数
        Predicate<Integer> predicate1 = n -> n % 2 == 0;
        System.out.println("输出list中的偶数");
        list.stream().filter(predicate1).forEach(System.out::println);
        //大于3的
        System.out.println("输出list中大于3的数字");
        list.stream().filter(n -> n > 3).forEach(System.out::println);
    }
}
