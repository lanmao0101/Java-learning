package com.day11.demo17;

// 1. 抽象父类：定义"水果"的模板（只定规则，不写具体实现）
abstract class Fruit {
    // 共性属性：水果名称
    private String name;

    // 构造方法（抽象类也可以有构造方法，给子类初始化属性）
    public Fruit(String name) {
        this.name = name;
    }

    // 普通方法（抽象类可以有具体实现的方法）
    public String getName() {
        return name;
    }

    // 抽象方法：定义"吃水果"的规则，无方法体，强制子类实现
    public abstract void eat();
}

