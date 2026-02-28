package com.day11.demo12;

public class Clothing extends Product{
    // 新增属性：尺寸、颜色
    private String size;
    private String color;

    public Clothing(String size, String color) {
    }

    public Clothing(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //重写展示属性方法
    @Override
    public void show() {
        System.out.println("名称：" + getName() + "，价格：" + getPrice() + "，尺寸：" + size + "，颜色：" + color);
    }
}
