package com.day11.demo20;

public abstract class Athlete extends  Person{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    // 抽象方法：学习对应运动项目
    public abstract void learn();

    // 重写work方法：运动员的工作是“学习”
    @Override
    public void work() {
        learn();
    }
}
