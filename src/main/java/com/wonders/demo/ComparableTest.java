package com.wonders.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author huangweiyue
 * @description Comparable 【内部排序】， 通过implements Comparable<Object>接口override compareTo方法实现
 * @date Created in 2019-06-28
 */
public class ComparableTest {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<Person>();
        Person test1=new Person(66,"李四");
        Person test2=new Person(29,"王五");
        Person test3=new Person(28,"赵六");
        Person test4=new Person(20,"钱三");
        list.add(test4);
        list.add(test3);
        list.add(test2);
        list.add(test1);
        Collections.sort(list);
        for(Object s:list){
            System.out.println(s);
        }
    }


}

class Person implements Comparable<Person>{
    public int age;    //年龄
    public String name;  //姓名

    //get、set方法
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
    //实现Comparable接口必须实现compareTo方法 比较规则自己实现
    @Override
    public int compareTo(Person person) {
        if(this.age==person.getAge()){
            return 0;
        }else if(this.age>person.getAge()){
            return 1;
        }else {
            return -1;
        }
    }
}