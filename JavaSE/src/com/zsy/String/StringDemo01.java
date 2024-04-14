package com.zsy.String;

public class StringDemo01 {
    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println(str1);

        String str2 = new String("abc");
        System.out.println(str2);

        char[] chars = new char[]{'a', 'b', 'c'};
        String str3 = new String(chars);
        System.out.println(str3);

        byte[] bytes = new byte[]{97, 98, 99};
        String str4 = new String(bytes);
        System.out.println(str4);
    }


}
