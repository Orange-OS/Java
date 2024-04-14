package com.zsy.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();

        c1.add("Java");
        c1.add("Python");
        c1.add("Go");
        System.out.println(c1);

        System.out.println("-----");

        // 使用迭代器遍历集合
        // 从集合对象中获取迭代器对象
        Iterator<String> it1 = c1.iterator();
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());

        System.out.println("-----");

        // 使用循环结合迭代器遍历集合
        Iterator<String> it2 = c1.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            System.out.println(next);
        }

        System.out.println("-----");

        // 增强 for 循环，可以用来遍历集合或数组，本质就是迭代器遍历集合的简化写法
        // c1.for
        for (String ele : c1) {
            System.out.println(ele);
        }

        System.out.println("-----");

        // Lambda
        c1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 简化
        c1.forEach((String s) -> {
            System.out.println(s);
        });
    }
}
