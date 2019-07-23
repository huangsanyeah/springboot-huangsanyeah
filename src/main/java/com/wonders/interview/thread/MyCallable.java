package com.wonders.interview.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String value = "MyCallable的返回值";
        System.out.println("Ready to work");
        Thread.currentThread().sleep(5000);
        System.out.println("task done");
        return value;
    }

}
