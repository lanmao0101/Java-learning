package com.day11.demo10;

public class AdminStaff extends Employee{
    //AdminStaff（行政部员工），继承Employee
    //无参构造

    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String work) {
        super(id, name, work);
    }
}
