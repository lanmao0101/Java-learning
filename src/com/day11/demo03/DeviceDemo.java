package com.day11.demo03;

public class DeviceDemo {
    public static void main(String[] args) {
        // 1. 创建安卓手机对象（通过构造方法赋值）
        AndroidPhone androidPhone = new AndroidPhone("华为", 5999.0);
        System.out.println("===== 安卓手机功能 =====");
        androidPhone.nfcFunction(); // 规范的方法名
        androidPhone.call();
        androidPhone.sendMessage();

        // 2. 创建苹果手机对象（通过构造方法赋值）
        IPhone iPhone = new IPhone("苹果", 9999.0);
        System.out.println("\n===== 苹果手机功能 =====");
        iPhone.call();
        iPhone.sendMessage();

        // 3. 创建笔记本电脑对象（通过构造方法赋值）
        Laptop laptop = new Laptop("戴尔", 6999.0);
        System.out.println("\n===== 笔记本电脑功能 =====");
        laptop.code(); // 还原需求的“编程”功能
    }
}

