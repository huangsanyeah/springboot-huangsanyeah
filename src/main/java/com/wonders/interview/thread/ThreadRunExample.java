package com.wonders.interview.thread;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-07-22
 * @modifiedBy
 */
public class ThreadRunExample implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadRunExample(), "th1");
        Thread t2 = new Thread(new ThreadRunExample(), "th2");
        //run方法相当于顺序调用普通的方法
        t1.run();
        t2.run();
    }
}
