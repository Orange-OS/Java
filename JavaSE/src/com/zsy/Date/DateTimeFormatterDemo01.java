package com.zsy.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo01 {
    public static void main(String[] args) {
        // SimpleDateFormat 线程不安全，DateTimeFormatter 线程安全

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String s1 = formatter.format(now); // 正向格式化
        System.out.println(s1);

        String s2 = now.format(formatter); // 反向格式化
        System.out.println(s2);

        // 解析时间
        String localDateTimeStr = "2022-12-12 12:12:12";
        LocalDateTime ldt = LocalDateTime.parse(localDateTimeStr, formatter);
        System.out.println(ldt);
    }
}
