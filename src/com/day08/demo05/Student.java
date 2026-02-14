package com.day08.demo05;


// 极简Student类：只保留核心属性+构造+set/get
public class Student {
    private String name;
    private int age;

    // 无参构造：只创建对象，不赋值
    public Student() {}

    // 有参构造：创建时直接赋值（this区分变量，核心）
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 仅保留核心set/get（封装基础，必须有）
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}
    public void setAge(int age) {this.age = age;}
    public int getAge() {return this.age;}
}
