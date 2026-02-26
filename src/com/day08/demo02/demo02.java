package com.day08.demo02;


public class demo02 {
    //小狗有属性:姓名、年龄。行为:吃骨头
    //实现以下需求
    //要求1:小狗的年龄:0~15岁
    //要求2:打印小狗所有的信息:小白，2岁
    //要求3:调用吃骨头的方法打印效果:2岁的小白，正在吃骨头
    static void main(String[] args) {
        //定义3条小狗对象
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.setName("小白");
        dog1.setAge(2);
        dog2.setName("小黑");
        dog2.setAge(3);
        dog3.setName("小黄");
        dog3.setAge(20);
        System.out.println(dog1.getName() + "，" + dog1.getAge() + "岁");
        dog1.eat();
        System.out.println(dog2.getName() + "，" + dog2.getAge() + "岁");
        System.out.println(dog3.getName() + "，" + dog3.getAge() + "岁");
    }
}
