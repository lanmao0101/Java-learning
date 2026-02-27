package com.day11.demo09;

public class Employee {
    // 私有化成员变量：工号、姓名、工资
    private int id;
    private String name;
    private double salary;
    public Employee() {
        System.out.println("Employee无参构造");
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Employee有参构造");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 工作方法（子类重写）
    public void work() {
        System.out.println("员工" + getName() + "正在工作");
    }

    // 吃饭方法（子类重写）
    public void eat() {
        System.out.println("员工" + getName() + "正在吃饭");
    }
}
