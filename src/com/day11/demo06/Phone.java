package com.day11.demo06;

// 子类：手机（享受额外9折补贴）
class Phone extends SmartDevice {
    public Phone() {
    }

    public Phone(String name, double price) {
        super(name, price);
    }

    // 重写价格计算：在原有折扣基础上再打9折
    @Override
    public double calculatePrice() {
        double basePrice = super.calculatePrice(); // 先调用父类的折扣计算
        return basePrice * 0.9; // 额外补贴9折
    }
}
