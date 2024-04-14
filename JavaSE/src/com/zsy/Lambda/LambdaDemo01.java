package com.zsy.Lambda;

public class LambdaDemo01 {
    public static void main(String[] args) {
//        Animal dog = new Animal(){
//            @Override
//            public void run() {
//                System.out.println("狗");
//            }
//        };
//        dog.run();

        Animal dog = new Animal(){
            @Override
            public void run() {
                System.out.println("狗");
            }
        };
        dog.run();

//        Swimming swimming = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("~");
//            }
//        };
//        swimming.swim();

        // Lambda 简化
        Swimming swimming = () -> {
            System.out.println("~");
        };
        swimming.swim();

        // 注意：Lambda 表达式只能简化函数式接口的匿名内部类
        // 什么是函数式接口：有且仅有一个抽象方法的接口
        // 省略规则：参数类型可以不写
    }

}

interface Swimming {
    void swim();
}

abstract class Animal{
    public abstract void run();
}
