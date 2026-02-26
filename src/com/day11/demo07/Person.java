package com.day11.demo07;

public class Person {
    String name;
    int age;
    Person()
    {
        System.out.println("Person无参构造方法");
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Person有参构造方法");
    }
    public void show()
    {
        System.out.println(name + " " + age);
    }
}
