package com.day11.demo08;

/**
 * Person类表示一个人的基本信息和行为。
 * 包含姓名和年龄属性，以及吃饭和睡觉的行为。
 */
public class Person {
    // 属性：姓名，年龄。行为：吃饭，睡觉
    private String name;
    private int age;

    /**
     * 无参构造函数，创建一个默认的Person对象。
     */
    public Person() {
    }

    /**
     * 有参构造函数，创建一个指定姓名和年龄的Person对象。
     *
     * @param name 姓名
     * @param age  年龄
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取姓名。
     *
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名。
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄。
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置年龄。
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 吃饭行为，输出"吃饭"。
     */
    public void eat() {
        System.out.println("吃饭");
    }

    /**
     * 睡觉行为，输出"睡觉"。
     */
    public void sleep() {
        System.out.println("睡觉");
    }
}
