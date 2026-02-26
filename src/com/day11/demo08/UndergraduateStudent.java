package com.day11.demo08;

public class UndergraduateStudent extends  Student{
    //攻读学士学位
    public UndergraduateStudent() {
        System.out.println("UndergraduateStudent无参构造");
    }
    public UndergraduateStudent(String name, int age, String grade) {
        super(name, age, grade);
        System.out.println("UndergraduateStudent有参构造");
    }
    // 重写学习方法：攻读学士学位
    @Override
    public void study() {
        System.out.println(getName()+"正在攻读学士学位");
    }
}
