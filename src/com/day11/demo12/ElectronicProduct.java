package com.day11.demo12;

public class ElectronicProduct extends Product{
    // 新增属性：品牌、型号
    private String brand;
    private String model;
    public ElectronicProduct() {
    }
    public ElectronicProduct(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //展示属性方法
    @Override
    public void show() {
        System.out.println("名称：" + getName() + "，价格：" + getPrice() + "，品牌：" + brand + "，型号：" + model);
    }
}
