package com.wonders.demo;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description String immutable
 * @date Created in 2019-07-01
 * @modifiedBy
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "Sachin";
        //concat() method appends the string at the end
        s.concat(" Tendulkar");

        //s+="111";

        //will print Sachin because strings are immutable objects
        //System.out.println(s);

        // a 为一个引用
        String a = new String("ab");
        // b为另一个引用,对象的内容一样
        String b = new String("ab");
        // 放在常量池中
        String aa = "ab";
        // 从常量池中查找
        String bb = "ab";
        // true
        if (aa == bb) {
            System.out.println("aa==bb");
        }
        // false，非同一对象
        if (a == b) {
            System.out.println("a==b");
        }
        // true
        if (a.equals(b)) {
            System.out.println("aEQb");
        }
        // true
        if (42 == 42.0) {
            System.out.println("true");
        }
    }
}
