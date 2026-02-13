package com.day08.demo03;

public class Student {
    //在校学生有属性:姓名、年龄、身高、体重。
    //行为:学习。
    private String name;
    private int age;
    private double height;
    private double weight;
    public void study(){
        System.out.println("学习");
    }
    //先不使用this关键字
    public void setName(String name1){
        name = name1;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age1){
        age = age1;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(double height1){
        height = height1;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double weight1){
        weight = weight1;
    }
    public double getWeight(){
        return weight;
    }
}
