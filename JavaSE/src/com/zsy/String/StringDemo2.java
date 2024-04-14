package com.zsy.String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "abc";

        // 获取字符串长度
        System.out.println(s.length());

        // 提取字符串中某个索引位置处的字符
        System.out.println(s.charAt(0));

        // 字符串遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println();
        System.out.println("-----");

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();

        // 判断字符串内容
        String s1 = new String("ab");
        String s2 = new String("ab");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // 忽略大小写比较字符串内容
        String c1 = "34AeFg";
        String c2 = "34aefg";
        System.out.println(c1.equals(c2));
        System.out.println(c1.equalsIgnoreCase(c2));

        // 截取字符串 [) 包前不包后
        String word = "Java是最好的编程语言之一";
        System.out.println(word.substring(0,12));

        // 从当前索引位置一直截取到字符串末尾
        System.out.println(word.substring(0));

        // 把字符串中的某个内容替换成新内容，并返回新的字符串对象
        String replace = word.replace("Java", "Python");
        System.out.println(replace);

        // 判断字符串中是否包含某个关键字
        System.out.println(word.contains("Java"));

        // 判断字符串是否以某个字符串开头
        System.out.println(word.startsWith("Java"));

        // 把字符串按照指定内容分割成多个字符串，放到一个字符串数组中
        String[] splits = word.split("是");
        for (int i = 0; i < splits.length; i++) {
            System.out.print(splits[i] + " ");
        }

        System.out.println();
    }
}
