package com.day11.demo20;

public abstract class Coach extends Person{
    public Coach() {
    }
    public Coach(String name, int age) {
        super(name, age);
    }

    // 抽象方法：教授对应运动项目
    public abstract void teach();

    // 重写work方法：教练的工作是“教学”
    @Override
    public void work() {
        teach();
    }
}
