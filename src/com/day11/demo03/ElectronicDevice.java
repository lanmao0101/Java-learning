package com.day11.demo03;

// 顶层父类：电子设备（封装共有属性，提供构造和getter/setter）
public class ElectronicDevice {
    // 私有属性，符合封装原则
    private String brand;
    private double price;

    // 无参构造
    public ElectronicDevice() {
    }

    // 带参构造：初始化品牌和价格
    public ElectronicDevice(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // getter/setter：提供属性的访问和修改入口
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
