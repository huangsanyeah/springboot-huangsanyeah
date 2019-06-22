package com.wonders.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-06-20
 * @modifiedBy
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for(int i=0;i<1000000;i++){
            double d = Math.random()*1000;
            list.add(d+"");
        }
        long start = System.nanoTime();//获取系统开始排序的时间点
        int count= (int) (list.stream().sequential()).sorted().count();
        long end = System.nanoTime();//获取系统结束排序的时间点
        long ms = TimeUnit.NANOSECONDS.toMillis(end-start);//得到串行排序所用的时间
        System.out.println("ms"+ms);
    }
}
