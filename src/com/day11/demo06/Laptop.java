package com.day11.demo06;

// 子类：笔记本电脑（无额外补贴，直接复用父类方法）
class Laptop extends SmartDevice {
    public Laptop() {
    }

    public Laptop(String name, double price) {
        super(name, price);
    }
    // 无需重写，直接继承父类的calculatePrice
}
