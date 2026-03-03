package com.day11.demo16;

// 测试类：创建人，使用不同交通工具
public class Test {
    public static void main(String[] args) {
        // 1. 创建人对象
        Person person = new Person("张三", 18, "高三");
        // 2. 创建自行车对象（子类），赋值给父类变量（自动类型转换）
        Vehicle a = new Bicycle("a", 10);
        person.travel(a);
        System.out.println("------------------");
        // 3. 创建汽车对象（子类），赋值给父类变量（自动类型转换）
        Vehicle b = new Car("b", 100);
        person.travel(b);
        System.out.println("------------------");
    }
}
