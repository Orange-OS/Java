package com.zsy.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        // 获取 date 对象的时间毫秒值
        long v1 = d1.getTime();
        System.out.println(v1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 格式化 date 对象
        String s1 = sdf.format(d1);
        System.out.println(s1);

        // 格式化时间毫秒值
        String s2 = sdf.format(v1);
        System.out.println(s2);

        System.out.println("-----");

        // SimpleDateFormat 解析字符串时间为 date 对象
        String dateStr = "2012-12-12 12:12:11";
        Date s3 = null;
        try {
            // sdf 中指定的时间格式必须与被解析的时间格式一致
            s3 = sdf.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s3);
    }
}
