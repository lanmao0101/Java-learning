package com.day11.demo07;

public class Teacher extends  Person{
    String subject;
    // Teacher无参构造
    public Teacher() {
        System.out.println("Teacher无参构造");
    }
    // Teacher有参构造
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher有参构造");
    }
}
