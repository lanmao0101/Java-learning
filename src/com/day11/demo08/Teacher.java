package com.day11.demo08;

public class Teacher extends  Person{
    public Teacher(){
        System.out.println("Teacher无参构造");
    };
    public Teacher(String name, int age) {
        super(name, age);
        System.out.println("Teacher有参构造");
    }
    // 教书方法（子类重写实现不同课程教学）
    public void teach(){
        System.out.println(getName()+"教书");
    }
}
