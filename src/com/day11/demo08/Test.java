package com.day11.demo08;

public class Test {
    public static void main(String[] args) {
        // 测试本科学生
        UndergraduateStudent undergrad = new UndergraduateStudent("张三", 20, "大三");
        undergrad.eat();
        undergrad.sleep();
        undergrad.study();

        System.out.println("-------------------");

        // 测试硕士研究生
        MasterStudent master = new MasterStudent("李四", 23, "研二");
        master.eat();
        master.sleep(); // 重写后的豪华公寓睡觉
        master.study();

        System.out.println("-------------------");

        // 测试专业课老师
        MajorTeacher majorTeacher = new MajorTeacher("王老师", 35, "Java");
        majorTeacher.eat();
        majorTeacher.sleep();
        majorTeacher.teach();

        System.out.println("-------------------");

        // 测试通识课老师
        GeneralTeacher generalTeacher = new GeneralTeacher("李老师", 40);
        generalTeacher.eat();
        generalTeacher.sleep();
        generalTeacher.teach();
    }
}
