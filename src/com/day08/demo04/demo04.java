package com.day08.demo04;

// 测试类demo04
class demo04 {
    public static void main(String[] args) {
        // 创建第一个学生对象
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(20);
        stu1.setGrade("大三");

        // 创建第二个学生对象
        Student stu2 = new Student("李四", 19, "大二");

        // 打印两个对象的信息，看this指向
        System.out.println("===== stu1信息 =====");
        stu1.printThisInfo();
        System.out.println("===== stu2信息 =====");
        stu2.printThisInfo();

        // 对比：stu1的内存地址 和 printThisInfo里的this地址是一样的
        System.out.println("stu1的内存地址：" + stu1);
    }
}