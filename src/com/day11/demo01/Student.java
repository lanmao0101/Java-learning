package com.day11.demo01;

// 子类：Student，继承Person，新增年级和学习行为
class Student extends Person {
    // 独有属性：年级
    private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        // 调用父类构造，初始化name和age
        super(name, age);
        this.grade = grade;
    }

    // 独有行为：学习
    public void study() {
        System.out.println(getName() + "在" + grade + "学习");
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
