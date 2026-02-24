package com.day10.demo01;

/**
 * 演示static静态变量的用法
 * 对比：实例变量（每个对象独有） vs 静态变量（所有对象共享）
 */
public class StaticVariableDemo {
    // 1. 实例变量（非静态）：每个对象都有独立的一份
    private String name; // 每个学生的姓名（独有）

    // 2. 静态变量（类变量）：所有对象共享同一份
    // 用途：统计学生总数、共享常量、全局配置等
    public static int studentCount = 0; // 统计创建的学生对象数量
    public static final String SCHOOL_NAME = "北京大学"; // 静态常量（所有学生共享的学校名称）

    // 构造器
    public StaticVariableDemo(String name) {
        this.name = name;
        // 每创建一个对象，静态变量studentCount就+1（所有对象共享这个计数）
        studentCount++;
    }

    // 打印学生信息
    public void showStudentInfo() {
        System.out.println("学生姓名：" + this.name);
        // 实例方法中可以访问静态变量
        System.out.println("所属学校：" + SCHOOL_NAME);
        System.out.println("当前学生总数：" + studentCount);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // 测试1：创建第一个学生对象
        StaticVariableDemo s1 = new StaticVariableDemo("张三");
        s1.showStudentInfo();
        // 输出：学生姓名：张三 | 所属学校：北京大学 | 当前学生总数：1

        // 测试2：创建第二个学生对象
        StaticVariableDemo s2 = new StaticVariableDemo("李四");
        s2.showStudentInfo();
        // 输出：学生姓名：李四 | 所属学校：北京大学 | 当前学生总数：2

        // 测试3：直接通过类名访问静态变量（推荐方式）
        System.out.println("通过类名访问学校名称：" + StaticVariableDemo.SCHOOL_NAME);
        System.out.println("通过类名访问学生总数：" + StaticVariableDemo.studentCount);

        // 测试4：修改静态变量（所有对象都会受影响）
        StaticVariableDemo.studentCount = 100; // 手动修改总数
        System.out.println("修改后学生总数：" + s1.studentCount); // 输出100（s1的计数也变了）
        System.out.println("修改后学生总数：" + s2.studentCount); // 输出100（s2的计数也变了）
    }
}