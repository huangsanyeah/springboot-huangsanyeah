package com.wonders.basic.thread;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 实现Runnable接口形式创建线程对象
 * @date Created in 2019-06-10
 * @modifiedBy
 */
public class RunnableMainMethod {
    public static void main(String[] args) {
        RunThread runThreadA=new RunThread("线程A");
        RunThread runThreadB=new RunThread("线程B");
        RunThread runThreadC=new RunThread("线程C");

        //TODO 注意 即便是runnable接口形式 依旧是调用Thread.start()方法启动线程
        /*new Thread(runThreadA).start();
        new Thread(runThreadB).start();
        new Thread(runThreadC).start();*/

        new Thread(() -> {
            System.out.println("hello world");
        }).start();
    }
}
