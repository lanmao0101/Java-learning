package com.day11.demo08;

/**
 * GeneralTeacher类表示通识课老师，继承自Teacher类。
 * 提供通识课老师的特有行为和构造方法。
 */
public class GeneralTeacher extends Teacher {

    /**
     * 无参构造函数，创建一个默认的GeneralTeacher对象。
     * 输出提示信息表明调用了无参构造函数。
     */
    public GeneralTeacher() {
        System.out.println("GeneralTeacher无参构造");
    }

    /**
     * 有参构造函数，创建一个指定姓名和年龄的GeneralTeacher对象。
     *
     * @param name 姓名
     * @param age  年龄
     */
    public GeneralTeacher(String name, int age) {
        super(name, age);
        System.out.println("GeneralTeacher有参构造");
    }

    /**
     * 重写teach方法，实现通识课老师的教学行为。
     * 输出老师姓名和正在教授通识课知识的信息。
     */
    @Override
    public void teach() {
        System.out.println(getName() + "在教通识课知识");
    }
}
