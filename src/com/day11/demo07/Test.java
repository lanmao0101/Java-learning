package com.day11.demo07;

public class Test {
    public static void main(String[] args) {
        //测试学生无参构造
        Student stu = new Student();
        System.out.println("姓名 "+stu.name+"年龄 "+stu.age+"班级 "+stu.grade);
        System.out.println("--------------------------------");
        //测试学生有参构造
        Student stu1 = new Student("小王", 18, "2年纪");
        System.out.println("姓名 "+stu1.name+"年龄 "+stu1.age+"班级 "+stu1.grade);
        System.out.println("--------------------------------");
        //测试老师无参构造
        Teacher tea = new Teacher();
        System.out.println("姓名 "+tea.name+"年龄 "+tea.age+"科目 "+tea.subject);
        System.out.println("--------------------------------");
        //测试老师有参构造
        Teacher tea1 = new Teacher("王老师", 28, "java");
        System.out.println("姓名 "+tea1.name+"年龄 "+tea1.age+"科目 "+tea1.subject);
    }
}
