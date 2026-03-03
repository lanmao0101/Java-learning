package com.day11.demo18;

// 抽象类：不能直接实例化，作为子类的模板
public abstract class Animal {
    // 私有化共性属性：名字、颜色
    private String name;
    private String color;
    public Animal() {
    }
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 抽象方法：只定义规则，无方法体，强制子类重写
    public abstract void eat();

    // 普通方法：所有动物的共性行为,喝水
    public void drink() {
        System.out.println(getName() + "在喝水");
    }
}
