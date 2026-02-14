package com.day08.demo06;

// 定义Person类，用于演示构造方法的核心规则
class Person {
    // 私有成员变量（封装）
    private String name;
    private int age;

    // 1. 手动编写无参数构造方法（注释里的好习惯：无论是否使用都手动写）
    // 如果不手动写，当没有任何自定义构造时，系统会自动提供这个默认无参构造
    public Person() {
        System.out.println("Person的无参数构造方法被调用");
    }

    // 2. 带全部参数的构造方法（注释里的好习惯）
    // 自定义了这个构造后，系统就不再自动提供默认的无参构造了
    // 此方法和无参构造方法名相同、参数不同，体现构造方法的重载
    public Person(String name, int age) {
        // this关键字区分成员变量和局部变量
        this.name = name;
        this.age = age;
        System.out.println("Person的带参数构造方法被调用");
    }

    // 为私有成员变量提供getter/setter方法（封装的必要补充）
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
