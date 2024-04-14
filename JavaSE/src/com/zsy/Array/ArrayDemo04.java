package com.zsy.Array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        // 动态初始化数组
        int[] arr = new int[3]; // arr = {0, 0, 0}

        // 动态初始化数组后，int 类型数组默认值是 0
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 后赋值
        arr[0] = 12;
        System.out.println(arr[0]);

    }
}
