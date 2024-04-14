package com.zsy.Break;

public class BreakDemo01 {
    public static void main(String[] args) {
        // break 跳出并结束当前所在循环的执行
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            System.out.println("i = " +  i);
        }

        System.out.println("-----");

        // continue 用于跳出当前循环的当次执行，直接进入循环的下一次执行
        for (int j = 0; j < 10; j++) {
            if (j == 5) continue;
            System.out.println("j = " +  j);
        }
    }
}
