package com.wonders.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description 1.java8给集合Collection提供的forEach方法（点进去）中Consumer是一个函数式接口 可以使用lambda表达式来遍历集合
 * 2.用iterator的forEachRemaining()方法
 * @Author huangweiyue
 * @Date Created in 2018-07-12 21:14
 * @ModifiedBy
 * @Version v1.0
 */
public class CollectionEach {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("NBA2017年总冠军球队是金州勇士");
        collection.add("大灌篮");
        collection.add("伟大的迈克尔乔丹");
        collection.forEach(obj -> System.out.println("forEach遍历输出的元素是--->" + obj));
        Iterator iterator = collection.iterator();
        //使用Lambada表达式来遍历 目标类型是Consumer来遍历集合元素
        iterator.forEachRemaining(String -> System.out.println("forEach遍历输出的元素是--->" + String));
    }
}
