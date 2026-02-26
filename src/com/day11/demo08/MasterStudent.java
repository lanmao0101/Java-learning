package com.day11.demo08;

public class MasterStudent extends Student{
    public MasterStudent() {
        System.out.println("MasterStudent无参构造");
    }
    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
        System.out.println("MasterStudent有参构造");
    }
    // 重写学习方法：攻读硕士学位
    @Override
    public void study() {
        System.out.println(getName()+"正在攻读硕士学位");
    }
}
