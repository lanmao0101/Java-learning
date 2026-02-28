package com.day11.demo10;

public class Teacher extends Employee{
    //Teacher（教研部员工），继承Employee
    //无参构造
    public Teacher() {}
    //带参构造
    public Teacher(String id, String name,String work){
        super(id, name, work);
    }
}
