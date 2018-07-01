package com.wonders.test;

import java.util.Calendar;
import java.util.Date;

/**
 * @Description java中获取时间戳
 * @Author huangweiyue
 * @Date Created in 2018-06-30 23:13
 * @ModifiedBy
 * @Version v1.0
 */
public class TimeStamp {
    public static void main(String[] args) {
        //TODO 时间戳的转化 概念以及使用场景
        //方法 一
        System.currentTimeMillis();
        //方法 二
        Calendar.getInstance().getTimeInMillis();
        //方法 三
        // new Date().getTime();
        Date d = new Date();
        System.out.println(d.getTime());
    }
}
