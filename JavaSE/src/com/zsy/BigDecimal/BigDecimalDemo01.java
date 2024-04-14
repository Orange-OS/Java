package com.zsy.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo01 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

        System.out.println("-----");

        // 把小数转换成字符串再得到 BigDecimal 对象
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1); // 加法
        BigDecimal c2 = a1.subtract(b1); // 减法
        BigDecimal c3 = a1.multiply(b1); // 乘法
        BigDecimal c4 = a1.divide(b1); // 除法
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("-----");

        // 除法除不尽会报错
        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
//        BigDecimal k = i.divide(j);
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println(k);

        // BifDecimal 转为 double
        double v = k.doubleValue();
        System.out.println(v);
    }
}
