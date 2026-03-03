package com.day11.demo20;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    // 重写教学方法：教打篮球
    @Override
    public void teach() {
        System.out.println(getName() + "（" + getAge() + "岁）在教打篮球");
    }
}
