package com.day11.demo09;

public class Test {
    public static void main(String[] args) {
        //创建经理对象
        Manager m = new Manager(10001,"小王", 30, 5000.0);
        System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getSalary() + "\t" + m.getBonus());
        //调用方法
        m.work();
        m.eat();
        //创建员工对象
        Employee e = new Employee(10002,"小王",  5000.0);
        System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
        e.work();
        e.eat();
    }
}
