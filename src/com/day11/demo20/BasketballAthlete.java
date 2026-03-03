package com.day11.demo20;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    // 重写学习方法：学打篮球
    @Override
    public void learn() {
        System.out.println(getName() + "（" + getAge() + "岁）在学打篮球");
    }
}
