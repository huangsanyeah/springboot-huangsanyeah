package com.wonders.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 验证isEqualCollection
 * @date Created in 2019-07-19
 * @modifiedBy
 */
public class CollectionContains {
    public static void main(String[] args) {
        List<D> list1 = new ArrayList<>();
        D d1 = new D(1, "11");
        List<E> e1ist = new ArrayList<>();
        E e1 = new E("e");
        e1ist.add(e1);
        d1.setE(e1ist);
        D d2 = new D(2, "22");
        D d3 = new D(3, "33");
        D d4 = new D(4, "44");
        D d5 = new D(1, "55");
        list1.add(d1);
        list1.add(d2);
        list1.add(d3);
        list1.add(d4);
        list1.add(d5);

        List<D> list2 = new ArrayList<>();
        D d6 = new D(1, "11");


        D d7 = new D(2, "22");
        //D d8=new D(3,"66");
        D d8 = new D(3, "33");
        D d9 = new D(4, "44");
        //D d10=new D(1,"55");

        List<E> e1ist2 = new ArrayList<>();
        E e2 = new E("e");
        e1ist2.add(e2);
        d6.setE(e1ist2);

        list2.add(d6);
        list2.add(d7);
        list2.add(d8);
        list2.add(d9);
        //list2.add(d10);

        for (D d : list2) {
            if (!list1.contains(d)) {
                System.out.println("list2中有元素不再list1中" + d);
            }
        }

        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        System.out.println(CollectionUtils.isEqualCollection(list3, list4));
    }
}

@Data
@AllArgsConstructor
class D {
    private int a;
    private String b;
    private List<E> e;

    public D(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

@Data
@AllArgsConstructor
class E {
    private String c;
}