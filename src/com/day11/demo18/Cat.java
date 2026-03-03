package com.day11.demo18;

public class Cat extends  Animal{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    // 重写抽象方法：实现猫的进食行为
    @Override
    public void eat() {
        System.out.println(getColor() + "的" + getName() + "在吃鱼");
    }

    // 猫的特有行为：抓老鼠
    public void catchMouse() {
        System.out.println(getColor() + "的" + getName() + "正在抓老鼠");
    }
}
