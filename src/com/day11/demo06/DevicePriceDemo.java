package com.day11.demo06;

// 测试类
public class DevicePriceDemo {
    public static void main(String[] args) {
        // 测试手机（有额外补贴）
        SmartDevice phone = new Phone("小米14", 4999);
        System.out.println("手机【小米14】原价：4999元，折后价：" + phone.calculatePrice() + "元");

        // 测试笔记本（无额外补贴）
        SmartDevice laptop = new Laptop("联想小新", 5999);
        System.out.println("笔记本【联想小新】原价：5999元，折后价：" + laptop.calculatePrice() + "元");

        // 测试平板（无额外补贴）
        SmartDevice tablet = new Tablet("iPad Pro", 12999);
        System.out.println("平板【iPad Pro】原价：12999元，折后价：" + tablet.calculatePrice() + "元");
    }
}
