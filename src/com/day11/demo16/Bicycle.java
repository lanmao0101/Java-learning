package com.day11.demo16;

public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }
    // 重写移动方法（自行车的移动逻辑）
    @Override
    public void move() {
        System.out.println("自行车" + getBrand() + "正在以" + getSpeed() + "km/h的速度移动...");
    }
    // 自行车特有行为：鸣铃
    public void ringBell() {
        System.out.println("自行车" + getBrand() + "正在鸣铃...");
    }
}
