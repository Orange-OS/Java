package com.zsy.Exception;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        // 自定义异常：
        // 自定义运行时异常：
        // 定义一个异常类继承 RunTimeException
        // 重写构造器
        // 通过 throw new 异常类 来创建异常对象并抛出

        try {
            saveAge(160);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveAge(int age) {
        if (age > 0 && age < 150) {
            System.out.println("保存成功");
        } else {
            throw new AgeIllegalRunTimeException("年龄不合法");
        }
    }
}
