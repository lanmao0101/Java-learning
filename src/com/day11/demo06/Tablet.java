package com.day11.demo06;

// 子类：平板电脑（无额外补贴，直接复用父类方法）
class Tablet extends SmartDevice {
    public Tablet() {
    }

    public Tablet(String name, double price) {
        super(name, price);
    }
    // 无需重写，直接继承父类的calculatePrice
}
