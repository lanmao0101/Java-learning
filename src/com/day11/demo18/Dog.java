package com.day11.demo18;

public class Dog extends  Animal{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    // 重写抽象方法：实现狗的进食行为
    @Override
    public void eat() {
        System.out.println(getColor() + "的" + getName() + "在吃骨头");
    }

    // 狗的特有行为：看家
    public void lookHome() {
        System.out.println(getColor() + "的" + getName() + "在看家");
    }
}
