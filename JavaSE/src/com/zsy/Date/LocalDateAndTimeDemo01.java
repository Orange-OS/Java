package com.zsy.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAndTimeDemo01 {
    public static void main(String[] args) {
        // LocalDate 代表本地日期 年、月、日、星期
        // LocalTime 代表本地时间 时、分、秒、纳秒
        // LocalDateTime 代表本地日期、时间 年、月、日、星期、时、分、秒、纳秒

        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        System.out.println(ld1.getYear());
        System.out.println(ld1.getMonth());
        System.out.println(ld1.getMonthValue());
        System.out.println(ld1.getDayOfMonth());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getDayOfWeek().getValue());

        LocalDate ld2 = ld1.withYear(2099);
        System.out.println(ld2);

        LocalDate ld3 = ld1.plusYears(2);
        System.out.println(ld3);

        LocalDate ld4 = ld1.minusYears(2);
        System.out.println(ld4);

        LocalDate ld5 = LocalDate.of(2099, 12, 12);
        System.out.println(ld5);

        // 判断 ld5 是否在 ld4 之前
        System.out.println(ld5.isBefore(ld4));
        System.out.println(ld5.isAfter(ld4));
    }


}
