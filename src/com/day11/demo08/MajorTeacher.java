package com.day11.demo08;

public class MajorTeacher extends  Teacher{
    // 新增属性：学科
    private String subject;
    public MajorTeacher() {
        System.out.println("MajorTeacher无参构造");
    }
    public MajorTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("MajorTeacher有参构造");
    }
    // 重写教书方法：教专业课知识
    @Override
    public void teach() {
        System.out.println("老师" + getName() + "正在讲" + subject + "课");
    }
}
