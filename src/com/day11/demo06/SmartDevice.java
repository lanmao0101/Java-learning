package com.day11.demo06;

// 父类：智能设备（所有设备的共性）
class SmartDevice {
    protected String name;  // 商品名
    protected double price; // 商品原价

    public SmartDevice() {
    }

    public SmartDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 核心方法：计算商品价格（按区间打折）
    public double calculatePrice() {
        if (price < 1000) {
            return price; // 0~1000，不打折
        } else if (price < 5000) {
            return price * 0.9; // 1000~5000，9折
        } else if (price < 10000) {
            return price * 0.8; // 5000~10000，8折
        } else {
            return price * 0.7; // 10000以上，7折
        }
    }

    // getter/setter（可选，这里为了简洁省略）
}
