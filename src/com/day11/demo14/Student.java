package com.day11.demo14;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, String account, String password) {
        super(name, account, password);
    }
    @Override
    public void work() {
        System.out.println("学生" + getName() + "正在学习");
    }
}
