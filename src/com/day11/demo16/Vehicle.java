package com.day11.demo16;

public class Vehicle {
    // 共性属性：品牌、行驶速度
    private String brand;
    private double speed;

    // 抽象方法：移动（子类必须重写）
    public void move(){
        System.out.println("开始移动...");
    };
    public Vehicle() {
    }
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
