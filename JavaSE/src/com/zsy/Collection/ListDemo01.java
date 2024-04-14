package com.zsy.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        // ArrayList
        // 基于数组实现
        // 查询速度快（注意：是根据索引查询数据快）
        // 删除效率低
        // 添加效率低

        List<String> list2 = new LinkedList<>();
        // LinkedList
        // 基于链表实现
        // 查询慢
        // 增删相对快
        // 应用场景：可以用来设计队列

    }
}
