package com.zsy.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo04 {
    public static void main(String[] args) {
        /*
            V put(K key, V value)               添加元素
            V remove(Object key)                根据键删除键值对元素
            void clear()                        移除所有的键值对元素
            boolean containsKey(Object key)     判断集合是否包含指定的键
            boolean containsValue(Object value) 判断集合是否包含指定的值
            boolean isEmpty()                   判断集合是否为空
            int size()                          集合的长度，也就是集合中键值对的个数
        */

        Map<String, String> map = new HashMap<>();

        // containsKey
        // containsValue
        // isEmpty
        // size

        map.put("张", "三");
        map.put("李", "四");
        map.put("王", "五");

        boolean value1 = map.containsKey("王");
        System.out.println(value1); // true

        boolean value2 = map.containsValue("五");
        System.out.println(value2); // true

        boolean value3 = map.isEmpty();
        System.out.println(value3); // false

        int size = map.size();
        System.out.println(size); // 3


        System.out.println(map);
    }
}
