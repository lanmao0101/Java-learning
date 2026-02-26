package com.day11.demo08;

/**
 * MajorTeacher类表示专业课老师，继承自Teacher类。
 * 包含学科属性，并提供专业课老师的特有行为和构造方法。
 */
public class MajorTeacher extends Teacher {
    // 新增属性：学科
    private String subject;

    /**
     * 无参构造函数，创建一个默认的MajorTeacher对象。
     * 输出提示信息表明调用了无参构造函数。
     */
    public MajorTeacher() {
        System.out.println("MajorTeacher无参构造");
    }

    /**
     * 有参构造函数，创建一个指定姓名、年龄和学科的MajorTeacher对象。
     *
     * @param name    姓名
     * @param age     年龄
     * @param subject 学科
     */
    public MajorTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("MajorTeacher有参构造");
    }

    /**
     * 重写teach方法，实现专业课老师的教学行为。
     * 输出老师姓名和正在讲授的专业课信息。
     */
    @Override
    public void teach() {
        System.out.println("老师" + getName() + "正在讲" + subject + "课");
    }
}
