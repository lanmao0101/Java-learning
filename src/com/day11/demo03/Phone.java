package com.day11.demo03;

// 中间子类：手机（继承电子设备，封装手机共有行为）
public class Phone extends ElectronicDevice {
    // 无参构造
    public Phone() {
    }

    // 带参构造：调用父类构造初始化品牌和价格
    public Phone(String brand, double price) {
        super(brand, price); // 关键：通过super调用父类构造
    }

    // 手机共有行为：打电话（显示品牌，更直观）
    public void call() {
        System.out.println(getBrand() + "手机：打电话");
    }

    // 手机共有行为：发短信（显示品牌）
    public void sendMessage() {
        System.out.println(getBrand() + "手机：发短信");
    }
}
