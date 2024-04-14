package com.zsy.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo06 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("张", "三");
        map.put("李", "四");
        map.put("王", "五");

        // 遍历第二种方式

        // 获取所有的键值对对象并把它们放到一个 Set 集合中
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            // 每次拿到一个键值对对象
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
