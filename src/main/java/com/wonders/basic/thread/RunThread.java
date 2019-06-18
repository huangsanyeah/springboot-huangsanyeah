package com.wonders.basic.thread;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-06-10
 * @modifiedBy
 */
public class RunThread implements Runnable{
    private String title;

    public RunThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(this.title+",X="+i);
        }
    }
}
