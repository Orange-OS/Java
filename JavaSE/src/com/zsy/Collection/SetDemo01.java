package com.zsy.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {
    public static void main(String[] args) {
        // HashSet 无顺序、不重复、无索引
        // LinkedHashSet 有顺序、不重复、无索引
        // TreeSet 排序、不重复、无索引

        Set<Integer> set1 = new HashSet<>(); // 无顺序、不重复、无索引
        set1.add(666);
        set1.add(555);
        set1.add(666);
        set1.add(777);
        set1.add(888);
        System.out.println(set1);

        System.out.println("-----");

        Set<Integer> set2 = new LinkedHashSet<>(); // 有顺序、不重复、无索引
        set2.add(666);
        set2.add(555);
        set2.add(666);
        set2.add(777);
        set2.add(888);
        System.out.println(set2);

        System.out.println("-----");

        Set<Integer> set3 = new TreeSet<>(); // 排序(默认升序)、不重复、无索引
        set3.add(666);
        set3.add(555);
        set3.add(666);
        set3.add(777);
        set3.add(888);
        System.out.println(set3);
    }
}
