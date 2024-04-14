package com.zsy.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {
    public static void main(String[] args) {
        // 系统此刻的日历

        // 获取系统此刻时间对应的日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);

        // 获取日历中的 date 对象
        Date date = now.getTime();
        System.out.println(date);

        // 修改日历中的某个信息
        now.set(Calendar.YEAR, 2026);
        System.out.println(now);

        // 为某个信息增加/减少指定的值
        now.add(Calendar.YEAR, -1);
        System.out.println(now);
    }
}
