package com.day11.demo01;

// 子类：Teacher，继承Person，新增学科和教书行为
class Teacher extends Person {
    // 独有属性：学科
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // 独有行为：教书
    public void teach() {
        System.out.println(getName() + "在教" + subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
