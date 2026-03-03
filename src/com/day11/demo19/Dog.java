package com.day11.demo19;

public class Dog extends Frog implements Swimming{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    // 重写抽象方法：吃骨头
    @Override
    public void eat() {
        System.out.println(getColor() + "的" + getName() + "在吃骨头");
    }

    // 重写接口方法：狗刨
    @Override
    public void swimming() {
        System.out.println(getColor() + "的" + getName() + "在狗刨");
    }
}
