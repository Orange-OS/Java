package com.zsy.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
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

        // remove方法：
        // 根据键删除集合中的元素，返回被删除元素的值

        map.put("张", "三");
        map.put("李", "四");
        map.put("王", "五");

        String value = map.remove("张");
        System.out.println(value); // 三

        System.out.println(map);
    }
}
