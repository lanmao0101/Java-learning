package com.day11.demo20;

public abstract class Person {
    // 共性属性：姓名、年龄
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 抽象方法：不同角色的核心工作（运动员学习/教练教学）
    public abstract void work();
}
