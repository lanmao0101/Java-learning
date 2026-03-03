package com.day11.demo16;

public class Car extends  Vehicle{
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }
    // 重写移动方法（汽车的移动逻辑）
    @Override
    public void move() {
        System.out.println("汽车" + getBrand() + "正在以" + getSpeed() + "km/h的速度移动...");
    }
    // 汽车特有行为：鸣笛
    public void alarm() {
        System.out.println("汽车" + getBrand() + "正在鸣笛...");
    }
}
