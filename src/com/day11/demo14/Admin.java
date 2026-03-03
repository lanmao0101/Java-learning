package com.day11.demo14;

public class Admin extends  Person{
    public Admin() {
    }

    public Admin(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public void work() {
        System.out.println("管理员" + getName() + "正在管理");
    }
}
