package com.zsy.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo01 {
    public static void main(String[] args) {
        // 用于操作集合或者数组的数据

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "张三","李四","王五");
        System.out.println(names);

        System.out.println("-----");

        ArrayList<String> list1 = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张")) {
                list1.add(name);
            }
        }
        System.out.println(list1);

        System.out.println("-----");

        List<String> list2 = names.stream().filter(e -> e.startsWith("张")).collect(Collectors.toList());
        System.out.println(list2);
    }
}
