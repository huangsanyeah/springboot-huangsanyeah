package com.wonders.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Description Predicate的removeIf()批量删除所有符合filter条件的所有元素, 该方法需要一个Predicate作为参数，也是函数式接口
 * 函数式接口(Functional Interface)就是一个【有且仅有一个抽象方法】，但是可以有多个非抽象方法的接口。
 * 函数式接口可以被隐式转换为lambda表达式。
 * 函数式接口可以现有的函数友好地支持 lambda。
 * @Author huangweiyue
 * @Date Created in 2018-07-12 21:47
 * @ModifiedBy
 * @Version v1.0
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("NBA2017年总冠军球队是金州勇士");
        collection.add("大灌篮");
        collection.add("伟大的迈克尔乔丹");
        collection.add("了不起的盖茨比");
        collection.add("哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        collection.add("12138");
        //使用Lambada表达式来遍历 目标类型是Predicate来遍历集合元素
        collection.removeIf(ele -> ((String) ele).length() < 10);
        System.out.println(collection);
    }
}
