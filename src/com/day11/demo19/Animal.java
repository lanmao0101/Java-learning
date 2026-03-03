package com.day11.demo19;

public abstract class Animal {
    // 私有化属性：名字、颜色
    private String name;
    private String color;
    // 构造方法
    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();
}
