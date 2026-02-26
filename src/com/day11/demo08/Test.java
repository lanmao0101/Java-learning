package com.day11.demo08;

public class Test {
    public static void main(String[] args) {
        // 测试本科学生类的功能
        // 创建一个本科学生对象，姓名：张三，年龄：20，年级：大三
        UndergraduateStudent undergrad = new UndergraduateStudent("张三", 20, "大三");
        undergrad.eat();        // 调用继承自Person的吃饭方法
        undergrad.sleep();      // 调用继承自Person的睡觉方法
        undergrad.study();      // 调用本科学生特有的学习方法

        System.out.println("-------------------");  // 分隔线，便于区分不同的测试部分

        // 测试硕士研究生类的功能
        // 创建一个硕士研究生对象，姓名：李四，年龄：23，年级：研二
        MasterStudent master = new MasterStudent("李四", 23, "研二");
        master.eat();           // 调用继承自Person的吃饭方法
        master.sleep();         // 调用重写后的睡觉方法（可能是豪华公寓睡觉）
        master.study();         // 调用硕士研究生特有的学习方法

        System.out.println("-------------------");

        // 测试专业课老师类的功能
        // 创建一个专业课老师对象，姓名：王老师，年龄：35，教授科目：Java
        MajorTeacher majorTeacher = new MajorTeacher("王老师", 35, "Java");
        majorTeacher.eat();     // 调用继承自Person的吃饭方法
        majorTeacher.sleep();   // 调用继承自Person的睡觉方法
        majorTeacher.teach();   // 调用重写后的教书方法（教授专业课程）

        System.out.println("-------------------");

        // 测试通识课老师类的功能
        // 创建一个通识课老师对象，姓名：李老师，年龄：40
        GeneralTeacher generalTeacher = new GeneralTeacher("李老师", 40);
        generalTeacher.eat();   // 调用继承自Person的吃饭方法
        generalTeacher.sleep(); // 调用继承自Person的睡觉方法
        generalTeacher.teach(); // 调用重写后的教书方法（教授通识课程）
    }
}
