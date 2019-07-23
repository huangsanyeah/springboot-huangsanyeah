package com.wonders.interview.thread;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description https://beginnersbook.com/2015/03/why-dont-we-call-run-method-directly-why-call-start-method/
 * @date Created in 2019-07-22
 * @modifiedBy
 */
public class ThreadStartExample {
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
        //start 才是线程的启动方法     private native void start0();
        t1.start();
        t2.start();
    }
}
