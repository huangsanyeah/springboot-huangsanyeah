package com.wonders.util.sdf;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Description sdf异常情况 https://blog.csdn.net/xiongxianze/article/details/79282495
 * @Author huangweiyue
 * @Date Created in 2018-06-15 23:25
 * @ModifiedBy
 * @Version v1.0
 */
public class SdfErrorExample {
    //(1)创建单例实例
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        //(2)创建多个线程，并启动
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    try {//(3)使用单例日期实例解析文本
                        //由于多个线程使用的是一个cal对象，所以线程A执行返回的就可能是被线程B清空后的对象
                        System.out.println(sdf.parse("2017-12-13 15:17:27"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();//(4)启动线程
        }
    }
}
