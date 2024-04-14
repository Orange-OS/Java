package com.zsy.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        // List 系列集合特点：添加的元素是有序、可重复、有索引
        // Set 系列集合特点：添加的元素是无序、不重复、无索引

        Collection<String> c1 = new ArrayList<>();
        c1.add("Java");
        c1.add("Python");
        c1.add("Java");
        System.out.println(c1);

        System.out.println(c1.size());

        System.out.println(c1.contains("Java"));

        // 删除指定元素，如果有多个重复元素，默认删除前面第一个
        c1.remove("Java");
        System.out.println(c1);

        Object[] array = c1.toArray();
        System.out.println(Arrays.toString(array));

        c1.clear();
        System.out.println(c1);

        System.out.println(c1.isEmpty());
    }
}
