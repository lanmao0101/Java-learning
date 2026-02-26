package com.day11.demo08;

public class Student extends  Person{
    private String grade;
    public Student() {
        System.out.println("Student无参构造");
    }
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("Student有参构造");
    }
    public void study(){
        System.out.println(getName()+"在学习");
    }
}
