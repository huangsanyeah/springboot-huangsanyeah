package com.wonders.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description Set添加重复元素测试
 * @Author huangweiyue
 * @Date Created in 2018-07-20 19:55
 * @ModifiedBy
 * @Version v1.0
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        //c是重复的 不会重复添加的
        set.add("c");
        set.add("c");
        set.add("c");
        set.add("a");
        set.add(1);
        set.add(3);
        set.add("b");
        System.out.println(set);

        String[] arr = new String[]{"a", "b", "a", "a", "1", "3", "2"};
        Set set1 = new HashSet();
        //注意 重复的a并不会被重复添加
        Collections.addAll(set1, arr);
        System.out.println(set1);
    }
}
