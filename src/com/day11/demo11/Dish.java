package com.day11.demo11;

public class Dish {
    // 私有化成员变量：菜名、价格、口味
    private String name;
    private double price;
    private String taste;

    // 菜品介绍方法（子类重写）
    public void show() {
        System.out.println("菜名：" + name + "，价格：" + price + "，口味：" + taste);
    }

    public Dish() {
    }
    public Dish(String name, double price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
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

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

}
