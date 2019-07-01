package com.wonders.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangweiyue
 * @description subList fail-fast
 * @date Created in 2019-06-29
 */
public class SubListFailFast {
    public static void main(String[] args) {
        List masterList=new ArrayList();
        masterList.add("one");
        masterList.add("two");
        masterList.add("three");
        masterList.add("four");
        masterList.add("five");

        //subList无法序列化，而且它的修改会导致主列表的修改 且主列表的元素个数改动会让其敏感（例如遍历输出抛出ConcurrentModificationException）异常
        List branchList=masterList.subList(0,3);

//报异常java.util.ConcurrentModificationException
//        masterList.remove(0);
//        masterList.add("ten");
//        masterList.clear();

        //可执行
        branchList.clear();
        branchList.add("six");
        branchList.add("seven");
        branchList.remove(0);
        for (Object t:branchList){
            System.out.println(t);
        }


        System.out.println("branchList:"+branchList);
        System.out.println("masterList:"+masterList);
    }
}
