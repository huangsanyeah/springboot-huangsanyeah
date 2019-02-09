package com.wonders.effectivejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Effective java第7章 chapter-41
 * list remove和set remove 重载的相关问题
 */
public class RemoveDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        System.out.println("set after add" + set);
        System.out.println("list after add" + list);
        for (int i = 0; i < 3; i++) {
            //TODO 这里是remove(E)
            set.remove(i);
            //FIXME 这里remove的是坐标 不是元素 因为Listd的remove方法remove的是 并不是<E>  list.remove((Integer)i)
            list.remove(i);
        }
        System.out.println("================================================");
        System.out.println("set after remove" + set);
        System.out.println("list after remove" + list);
    }
}
