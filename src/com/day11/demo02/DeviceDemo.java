package com.day11.demo02;

public class DeviceDemo {
    public static void main(String[] args) {
        //创建安卓手机对象（通过构造方法赋值）
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.brand = "华为";
        androidPhone.price = 5999.0;
        System.out.println("手机品牌：" + androidPhone.brand+"，手机价格：" + androidPhone.price);
        System.out.println("===== 安卓手机功能 =====");
        androidPhone.nfcFunction();
        androidPhone.call();
        androidPhone.sendMessage();
        //创建苹果手机对象（通过构造方法赋值）
        IPhone iPhone = new IPhone();
        iPhone.brand = "苹果";
        iPhone.price = 9999.0;
        System.out.println("手机品牌：" + iPhone.brand+"，手机价格：" + iPhone.price);
        System.out.println("\n===== 苹果手机功能 =====");
        iPhone.call();
        iPhone.sendMessage();
        //创建笔记本电脑对象（通过构造方法赋值）
        Laptop laptop = new Laptop();
        laptop.brand = "戴尔";
        laptop.price = 6999.0;
        System.out.println("手机品牌：" + laptop.brand+"，手机价格：" + laptop.price);
        System.out.println("\n===== 笔记本电脑功能 =====");
        laptop.code();
    }
}
