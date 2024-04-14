package com.zsy.Array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = {12, 24, 36};

        // 访问数组中的数据
        System.out.println(arr[0]);

        // 修改数组中的数据
        arr[0] = 66;
        System.out.println(arr[0]);

        // 访问数组的长度
        System.out.println(arr.length);

        // 数组的最大索引：(数组名.length -1)，前提：数组中元素个数大于 0
    }
}
