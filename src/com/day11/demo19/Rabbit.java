package com.day11.demo19;

public class Rabbit extends Animal{
    public Rabbit(){
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }

    // 重写抽象方法：吃胡萝卜
    @Override
    public void eat() {
        System.out.println(getColor() + "的" + getName() + "在吃胡萝卜");
    }
}
