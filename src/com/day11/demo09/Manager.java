package com.day11.demo09;

public class Manager extends Employee{
    // 新增属性：管理奖金
    private double bonus;

    public Manager() {
        System.out.println("Manager无参构造");
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // 重写工作方法：管理其他人
    @Override
    public void work() {
        System.out.println("工号"+getId()+"的"+getName()+"正在管理其他人");
    }
    // 重写吃饭方法：吃米饭
    @Override
    public void eat() {
        System.out.println("工号"+getId()+"的"+getName()+"正在吃米饭");
    }
}
