package com.zsy.String;

public class StringDemo03 {
    public static void main(String[] args) {
        // String 是不可变字符串对象

        String str01 = "abc";
        // "" 创建的字符串对象，会存储到字符串常量池，且内容相同的字符串内容只会存储一份

        String str02 = new String("abc");
        // new 方式创建的字符串对象，每 new 一次就会产生一个新的对象放在堆内存中
    }
}
