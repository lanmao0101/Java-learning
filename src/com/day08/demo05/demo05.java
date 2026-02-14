package com.day08.demo05;

public class demo05 {
    public static void main(String[] args) {
        // ========== 重点1：无参构造 + set 分步赋值（灵活） ==========
        Student stu1 = new Student(); // 先造空对象
        stu1.setName("张三");         // 分步赋值：想赋哪个赋哪个
        stu1.setAge(18);
        System.out.println("无参+set：" + stu1.getName() + "，" + stu1.getAge() + "岁");

        // ========== 重点2：有参构造 一次性赋值（简洁） ==========
        Student stu2 = new Student("李四", 19); // 造对象时直接赋值，一步到位
        System.out.println("有参构造：" + stu2.getName() + "，" + stu2.getAge() + "岁");

        // ========== 重点3：无参的灵活性（核心差异） ==========
        stu1.setAge(19); // 无参创建后，想改就改，不用动其他属性
        System.out.println("无参改年龄：" + stu1.getName() + "，" + stu1.getAge() + "岁");
    }
}