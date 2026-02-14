package com.day08.demo04;

// 带this关键词的Student类
public class Student {
    // 私有属性（成员变量）
    private String name;
    private int age;
    private String grade; // 新增：年级（大一/大二/大三）

    // 1. 无参构造
    public Student() {
        // this() 调用本类的有参构造（必须写在构造方法第一行）
        this("默认姓名", 18, "大一");
        System.out.println("无参构造被调用，this指向：" + this);
    }

    // 2. 有参构造
    public Student(String name, int age, String grade) {
        // this区分成员变量和局部变量（最常用！）
        // this.name = 成员变量（类里的name）
        // name = 构造方法的参数（局部变量）
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 设置姓名（this区分变量）
    public void setName(String name) {
        // 这里的this.name是类的成员变量，name是方法参数
        this.name = name;
        // this调用当前对象的其他方法
        this.printThisInfo(); // 等价于直接写printThisInfo()，加this更清晰
    }

    // 设置年龄（this区分变量）
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println(this.name + "的年龄无效！"); // this.name获取当前对象的姓名
            return;
        }
        this.age = age;
    }

    // 设置年级
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // 打印当前对象信息（演示this代表当前对象）
    public void printThisInfo() {
        System.out.println("当前对象：" + this
                + "，姓名：" + this.name
                + "，年龄：" + this.age
                + "，年级：" + this.grade);
    }

    // get方法（this可选，但加了更清晰）
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGrade() {
        return this.grade;
    }
}
