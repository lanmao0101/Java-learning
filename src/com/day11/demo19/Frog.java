package com.day11.demo19;

public class Frog extends Animal implements Swimming {
    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }

    // 重写抽象方法：吃虫子
    @Override
    public void eat() {
        System.out.println(getColor() + "的" + getName() + "在吃虫子");
    }

    // 重写接口方法：蛙泳
    @Override
    public void swimming() {
        System.out.println(getColor() + "的" + getName() + "在蛙泳");
    }
}
