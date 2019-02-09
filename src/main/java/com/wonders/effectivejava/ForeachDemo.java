package com.wonders.effectivejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 推荐用foreach
 * @date Created in 2018-12-23
 * @modifiedBy
 */
public class ForeachDemo {
    public static void main(String[] args) {
        Collection<Face> faces = Arrays.asList(Face.values());
        for (Iterator<Face> i = faces.iterator(); i.hasNext(); ) {
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); ) {
                System.out.println(i.next() + "," + j.next());
            }
        }
        //ONE,ONE TWO,TWO THREE,THREE FOUR,FOUR FIVE,FIVE SIX,SIX
    }
}
