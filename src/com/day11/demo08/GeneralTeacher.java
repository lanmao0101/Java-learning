package com.day11.demo08;

public class GeneralTeacher extends  Teacher{
    public GeneralTeacher() {
        System.out.println("GeneralTeacher无参构造");
    }
    public GeneralTeacher(String name, int age) {
        super(name, age);
        System.out.println("GeneralTeacher有参构造");
    }
    @Override
    public void teach(){
        System.out.println(getName()+"在教通识课知识");
    }
}
