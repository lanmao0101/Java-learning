package com.day08.demo06;

// 遵循Java命名规范，类名首字母大写（原demo06改为Demo06）
public class demo06 {
    static void main(String[] args) {
        // 测试构造方法的使用
        // 1. 调用无参数构造方法创建对象
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(18);
        System.out.println("无参构造创建的对象：" + p1.getName() + "，年龄：" + p1.getAge());

        // 2. 调用带参数构造方法创建对象
        Person p2 = new Person("李四", 20);
        System.out.println("带参构造创建的对象：" + p2.getName() + "，年龄：" + p2.getAge());
    }
}

