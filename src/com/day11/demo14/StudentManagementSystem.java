package com.day11.demo14;

public class StudentManagementSystem {
    //创建一个方法用于注册用户
    //参数使用Person类,
    public void register(Person person){
        System.out.println("姓名为" + person.getName() + "的同学注册成功，账号" + person.getAccount() + "，密码" + person.getPassword());
        //调用work()方法
        person.work();
    }
}
