package com.zsy.Collection;

import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args) {
        // 创建一个队列
        LinkedList<String> queue = new LinkedList<>();

        // 入队
        queue.addLast("一号");
        queue.addLast("二号");
        queue.addLast("三号");
        queue.addLast("四号");

        System.out.println(queue);

        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());

        System.out.println(queue);
    }
}
