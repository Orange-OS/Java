package com.zsy.Collection;

import java.util.LinkedList;

public class LinkedListDemo02 {
    public static void main(String[] args) {
        // 创建一个栈
        LinkedList<String> stack = new LinkedList<>();

        // 压栈 stack.push 也可以
        stack.addFirst("一");
        stack.addFirst("二");
        stack.addFirst("三");
        stack.addFirst("四");

        System.out.println(stack);

        // 出栈 stack.pop 也可以
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        System.out.println(stack);
    }
}
