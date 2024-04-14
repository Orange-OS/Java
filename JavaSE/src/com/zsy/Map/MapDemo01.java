package com.zsy.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
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

        // put方法：添加/覆盖
        // 在添加数据的时候，如果键不存在，那么直接把键值对对象添加到集合中，返回值为null
        // 在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把覆盖的值进行返回

        map.put("张", "三");
        map.put("李", "四");
        map.put("王", "五");

        String put = map.put("张", "四");
        System.out.println(put); // 三

        System.out.println(map);

    }
}
