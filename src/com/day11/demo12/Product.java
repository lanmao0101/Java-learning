package com.day11.demo12;

public class Product {
    // 私有化成员变量：名称、价格
    private String name;
    private double price;
    public Product() {
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 展示属性方法（子类重写）
    public void show() {
        System.out.println("名称：" + name + "，价格：" + price);
    }
}
