package com.day11.demo01;

// 父类：Person，提取学生和老师的共同属性和行为
class Person {
    // 共同属性
    private String name;
    private int age;

    // 无参构造
    public Person() {
    }

    // 带参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 共同行为：吃饭
    public void eat() {
        System.out.println(name + "在吃饭");
    }

    // getter 和 setter
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
}
