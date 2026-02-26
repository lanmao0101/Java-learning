package com.day11.demo03;

// 子类：笔记本电脑（直接继承电子设备，新增编程功能）
public class Laptop extends ElectronicDevice {
    // 无参构造
    public Laptop() {
    }

    // 带参构造：调用父类构造
    public Laptop(String brand, double price) {
        super(brand, price);
    }

    // 笔记本独有行为：编程（显示品牌）
    public void code() {
        System.out.println(getBrand() + "笔记本：使用电脑编程");
    }
}
