package com.day08.demo02;

// 狗类：封装名字和年龄（年龄限制0-15）
public class Dog {
    // 私有属性：狗的名字
    private String name;
    // 私有属性：狗的年龄（0-15岁）
    private int age;

    // 设置名字（规范命名+简化参数）
    public void setName(String name1) {
        name = name1; // this区分成员变量和参数
    }

    // 获取名字
    public String getName() {
        return name;
    }

    // 设置年龄（保留核心校验，简化提示）
    public void setAge(int age1) {
        if (age1 >= 0 && age1 <= 15) {
            age = age1;
        } else {
            System.out.println("年龄无效！请输入0-15之间的数字");
        }
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 狗吃东西
    public void eat() {
        System.out.println(name + "正在吃骨头");
    }
}