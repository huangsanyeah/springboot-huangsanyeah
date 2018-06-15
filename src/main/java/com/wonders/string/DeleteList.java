package com.wonders.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-06-15 17:01
 * @ModifiedBy
 * @Version v1.0
 */
public class DeleteList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        //换成 1 2 结果不同的
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }

        System.out.println(list.toString());

    }
}
