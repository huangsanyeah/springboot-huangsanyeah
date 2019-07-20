package com.wonders.interview.thread;

public class CASCase {
    public volatile int value;

    public synchronized void add() {
        value++;
    }
}
