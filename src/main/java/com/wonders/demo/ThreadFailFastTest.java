package com.wonders.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author huangweiyue
 * @description 多线程情况下对同一个list修改造成的fail fast效果
 */
public class ThreadFailFastTest {
    /*
     * @desc java集合中Fast-Fail的测试程序。
     *
     *   fast-fail事件产生的条件：当多个线程对Collection进行操作时，若其中某一个线程通过iterator去遍历集合时，该集合的内容被其他线程所改变；则会抛出ConcurrentModificationException异常。
     *   fast-fail解决办法：通过util.concurrent集合包下的相应类去处理，则不会产生fast-fail事件。
     *
     *   本例中，分别测试ArrayList和CopyOnWriteArrayList这两种情况。ArrayList会产生fast-fail事件，而CopyOnWriteArrayList不会产生fast-fail事件。
     *   (01) 使用ArrayList时，会产生fast-fail事件，抛出ConcurrentModificationException异常；定义如下：
     *            private static List<String> list = new ArrayList<String>();
     *   (02) 使用时CopyOnWriteArrayList，不会产生fast-fail事件；定义如下：
     *            private static List<String> list = new CopyOnWriteArrayList<String>();
     *
     * @author skywang
     */


    private static List<String> list = new ArrayList<String>();

    /**
     * copyOnWrite机制 复制一个 进行操作 操作完再赋值回去
     */
    //private static List<String> list = new CopyOnWriteArrayList<String>();
    public static void main(String[] args) {

        // 同时启动两个线程对list进行操作！
        new ThreadOne().start();
        new ThreadTwo().start();
    }

    private static void printAll() {
        System.out.println("");

        String value = null;
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            value = (String) iter.next();
            System.out.print(value + ", ");
        }
    }

    /**
     * 向list中依次添加0,1,2,3,4,5，每添加一个数之后，就通过printAll()遍历整个list
     */
    private static class ThreadOne extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 6) {
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }
    }

    /**
     * 向list中依次添加10,11,12,13,14,15，每添加一个数之后，就通过printAll()遍历整个list
     */
    private static class ThreadTwo extends Thread {
        @Override
        public void run() {
            int i = 10;
            while (i < 16) {
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }
    }


}
