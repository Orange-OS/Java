package com.zsy.Date;

import java.time.Instant;

public class InstantDemo01 {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.println(i1);

        // 总秒数
        long epochSecond = i1.getEpochSecond();
        System.out.println(epochSecond);

        // 不够 1 秒的纳秒数
        int nano = i1.getNano();
        System.out.println(nano);
    }
}
