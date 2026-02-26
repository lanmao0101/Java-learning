package com.day11.demo07;

public class Student extends  Person{
    String grade;
    // Student无参构造
    public Student() {
        System.out.println("Student无参构造");
    }
    // Student有参构造
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("Student有参构造");
    }
}
