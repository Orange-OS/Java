package com.zsy.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo07 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("张", "三");
        map.put("李", "四");
        map.put("王", "五");

        // 遍历第三种方式

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        System.out.println("-----");

        map.forEach((key, value) -> {
                    System.out.println(key + "=" + value);
                }
        );

        System.out.println("-----");

        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
