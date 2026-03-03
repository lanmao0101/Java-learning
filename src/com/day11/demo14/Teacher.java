package com.day11.demo14;

public class Teacher extends  Person{
    public Teacher() {
    }

    public Teacher(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public void work() {
        System.out.println("老师" + getName() + "正在教学");
    }
}
