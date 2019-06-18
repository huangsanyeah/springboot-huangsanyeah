package com.wonders.basic.thread;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 继承Thread方式创建线程对象
 * @date Created in 2019-06-10
 * @modifiedBy
 */
public class ThreadMainMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //TODO 注意 是start（）
            new MyThread().start();
        }
    }
}
