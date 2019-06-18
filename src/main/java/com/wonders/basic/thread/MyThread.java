package com.wonders.basic.thread;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-06-10
 * @modifiedBy
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(getName() + "  " + i);

        }
    }
    }
