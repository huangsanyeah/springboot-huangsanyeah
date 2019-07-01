package com.wonders.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-06-29
 * @modifiedBy
 */
public class ArrayListFailFast {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        //这只是碰巧没触发ConcurrentModificationException异常
    /*    for (String s : list) {
            if("two".equals(s)){
                list.remove(s);
            }
        }*/

        //使用迭代器删除列表中的元素
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            //多线程情况下加锁
            synchronized (list){
                String item=iterator.next();
                if("two".equals(item)){
                    //TODO 注意！！！ 不是list的remove
                    iterator.remove();
                }
            }
        }



        System.out.println(list);
    }
}
