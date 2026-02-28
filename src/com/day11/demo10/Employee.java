package com.day11.demo10;

public class Employee {
    //顶层父类：Employee（员工），封装编号、姓名、工作内容和工作方法
    private String id;
    private String name;
    private String work;
    public void work(){
        System.out.println("员工" + name + "正在" + work);
    }
    //无参构造方法
    public Employee(){
        System.out.println("无参构造方法");
    }
    //有参构造方法
    public Employee(String id, String name, String work){
        this.id = id;
        this.name = name;
        this.work = work;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
