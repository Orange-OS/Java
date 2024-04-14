package com.zsy.Array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        // 数组就是一个容器，用来存储一批同种类型的数据

        // 静态初始化数组格式
        int[] ages1 = new int[]{12, 24, 36};
        double[] scores1 = new double[]{79.9, 89.9, 88};

        // 简化写法
        int[] ages2 = {12, 24, 36};
        double[] scores2 = {79.9, 89.9, 88};

        // 什么类型数组必须存放什么类型数据
        // 数组变量名中存储的是数组在内存中的地址，数组是一种引用数据类型
        System.out.println(ages1); // [I@7ba4f24f 解释：[ 代表数组，I 代表 int 类型，7ba4f24f 代表 16进制内存地址
    }
}
