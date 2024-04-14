package com.zsy.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("张", "三");
        map.put("李", "四");
        map.put("王", "五");

        // 遍历第一种方式

        Set<String> keys = map.keySet();

        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }


    }
}
