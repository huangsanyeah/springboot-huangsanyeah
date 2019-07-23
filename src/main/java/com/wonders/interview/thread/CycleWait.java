package com.wonders.interview.thread;

public class CycleWait implements Runnable {
    private String value;

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {
        CycleWait cycleWait = new CycleWait();
        Thread t = new Thread(cycleWait);
        t.start();
        //方法1：主线程循环等待
       /* while (cycleWait.value==null){
            Thread.currentThread().sleep(100);
        }*/
        //方法2：join方法阻塞当前线程等的子线程处理完毕
        t.join();
        System.out.println("value: " + cycleWait.value);
    }
}
