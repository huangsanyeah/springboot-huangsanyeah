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
            //boolean remove(Object o);
            set.remove(i);
            //E remove(int index)
            list.remove(i);
        }
        System.out.println("================================================");
        System.out.println("set after remove" + set);
        System.out.println("list after remove" + list);
//        set after add[-3, -2, -1, 0, 1, 2]
//        list after add[-3, -2, -1, 0, 1, 2]
//================================================
//        set after remove[-3, -2, -1]
//        list after remove[-2, 0, 2]
    }
}
