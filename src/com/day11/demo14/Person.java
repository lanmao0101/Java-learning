package com.day11.demo14;

public class Person {
    //定义父类 Person，封装姓名、账号、密码，以及抽象的 work() 方法
    private String name;
    private String account;
    private String password;
    public void work() {
        System.out.println("员工" + name + "正在工作...");
    }
    public Person() {
    }
    public Person(String name, String account, String password) {
        this.name = name;
        this.account = account;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
