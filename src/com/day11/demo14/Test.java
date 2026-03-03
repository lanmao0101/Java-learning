package com.day11.demo14;

public class Test {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        // 注册学生（多态：Person Per = new Student()）
        sms.register(new Student("张三", "18", "高三"));
        System.out.println("------------------");
        // 注册老师
        sms.register(new Teacher("王五", "28", "高级讲师"));
        System.out.println("------------------");
        // 注册管理员
        sms.register(new Admin("小王", "28", "高级管理员"));
        System.out.println("------------------");
    }
}
