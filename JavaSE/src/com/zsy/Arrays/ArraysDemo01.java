package com.zsy.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class ArraysDemo01 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = Arrays.copyOfRange(arr1, 0, 1);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr1, 5);
        System.out.println(Arrays.toString(arr3));

        double[] prices = {10, 20, 30};
        System.out.println(Arrays.toString(prices));
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        // 默认升序排序
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

        // 方式一：让该类的对象实现 Compareable 接口，然后重写 compareTo 方法，指定比较规则
        // 方式二：创建 Comparator 比较器接口的匿名内部类对象，然后指定比较规则

        // 约定：左边对象大于右边对象，返回正整数
        // 约定：左边对象小于右边对象，返回负整数
        // 约定：左边对象等于右边对象，返回 0
    }
}
