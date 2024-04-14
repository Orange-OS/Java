package com.zsy.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        Collections.addAll(names, "张三","李四","王五");
        System.out.println(names);

        System.out.println("-----");

        // 打乱 List 集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        System.out.println("-----");

        // 升序排序
        Collections.sort(names);
        System.out.println(names);
    }
}
