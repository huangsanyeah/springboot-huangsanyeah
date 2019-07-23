package com.wonders.interview.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        FutureTask<String> task = new FutureTask<String>(new MyCallable());
//        new Thread(task).start();
//        if (!task.isDone()) {
//            System.out.println("task has not finished, please wait!");
//        }
//        System.out.println("task return: " + task.get());
        //FutureTask  implements了RunnableFuture， RunnableFuture<V> extends Runnable
        FutureTask<String> task = new FutureTask(new MyCallable());
        //直接单线程启动
        new Thread(task).start();
        if (!task.isDone()) {
            System.out.println("task还没结束");
        }
        System.out.println("task结果:" + task.get());

    }
}
