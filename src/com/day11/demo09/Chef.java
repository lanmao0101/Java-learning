package com.day11.demo09;

public class Chef extends Employee{

    public Chef() {
        System.out.println("Chef无参构造");
    }

    public Chef(int id, String name, double salary) {
        super(id, name, salary);
    }

    // 重写工作方法：炒菜
    @Override
    public void work() {
        System.out.println("工号"+getId()+"的"+getName()+"正在炒菜");
    }
    // 重写吃饭方法：吃米饭
    @Override
    public void eat() {
        System.out.println("工号"+getId()+"的"+getName()+"正在吃米饭");
    }
}
