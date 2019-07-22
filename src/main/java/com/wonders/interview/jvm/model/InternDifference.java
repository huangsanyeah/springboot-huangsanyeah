package com.wonders.interview.jvm.model;

public class InternDifference {
    public static void main(String[] args) {
        String s = new String("a");
        s.intern();
        String s2 = "a";
        System.out.println(s == s2);

        String s3 = new String("a") + new String("a");
        //JKD6以后 intern()方法 会把s3的【引用地址】存入常量池
        s3.intern();
        String s4 = "aa";
        System.out.println(s3 == s4);
    }
}
