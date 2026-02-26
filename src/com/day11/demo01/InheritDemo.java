package com.day11.demo01;

// 测试类
public class InheritDemo {
    public static void main(String[] args) {
        // 创建学生对象
        Student stu = new Student("张三", 18, "高三");
        stu.eat();    // 继承自父类的方法
        stu.study();  // 自己的方法

        System.out.println("-------------------");

        // 创建老师对象
        Teacher tea = new Teacher("李老师", 35, "Java编程");
        tea.eat();    // 继承自父类的方法
        tea.teach();  // 自己的方法
    }
}