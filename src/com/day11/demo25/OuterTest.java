package com.day11.demo25;

// 专门用于测试的类，存放main方法
public class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // 方式一：通过外部类方法获取 PrivateInner 实例
        PrivateInner privateInner = outer.getPrivateInnerInstance();
        privateInner.show();

        System.out.println("------------------------");

        // 方式二：直接创建 PublicInner 实例
        PublicInner publicInner = new PublicInner();
        publicInner.display();
    }
}
