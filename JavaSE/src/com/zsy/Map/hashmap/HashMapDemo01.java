package com.zsy.Map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        /*
            需求：创建一个HashMap集合，键是学生对象（Student），值是籍贯（String）
            存储三个键值对元素，并遍历

            要求：同姓名，同年龄认为是同一个学生
         */

        // 创建HashMap对象
        HashMap<Student, String> hashMap = new HashMap<>();

        // 创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);

        // 添加元素
        hashMap.put(s1, "浙江");
        hashMap.put(s2, "河北");
        hashMap.put(s3, "福建");
        hashMap.put(s4, "山东");

        // 遍历
        Set<Student> keys = hashMap.keySet();
        for (Student key : keys) {
            String value = hashMap.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("-----");

        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("-----");

        hashMap.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }
}
