package com.zsy.Date;

import java.util.Date;

public class DateDemo01 {

    public static void main(String[] args) {

        Date d1 = new Date(); // 系统当前的日期时间
        System.out.println(d1);

        //// 获取 date 对象的时间毫秒值
        long v1 = d1.getTime();
        System.out.println(v1);

        // 时间毫秒值转换成 Date 对象
        v1 = v1 + 1000 * 2;
        Date d2 = new Date(v1);
        System.out.println(d2);

        // 设置 Date 对象 为毫秒值对应的时间
        Date d3 = new Date();
        d3.setTime(v1);
        System.out.println(d3);
    }
}

