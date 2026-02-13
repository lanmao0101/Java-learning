package com.day08.demo03;

public class demo03 {
    //实现以下需求
    //要求1:大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。
    //要求2:大二期间张三体重增加了10kg
    //要求3:大三期间张三减肥成功，身高增加2cm，体重减少3kg
    //要求4:打印大学毕业之后，张三的所有信息
    public static void main(String[] args) {
        com.day08.demo03.Student student = new com.day08.demo03.Student();
        student.setName("张三");
        student.setAge(18);
        student.setHeight(183);
        student.setWeight(60);
        //刚进入大学开始学习
        System.out.println("刚进入大学开始学习");
        student.study();
        //当前信息
        System.out.println(student.getName() + "，" + student.getAge() + "岁，" + student.getHeight() + "cm，" + student.getWeight() + "kg");
        //大二期间体重增加10kg
        student.setWeight(student.getWeight() + 10);
        System.out.println("大二期间体重增加10kg");
        System.out.println(student.getName() + "，" + student.getAge() + "岁，" + student.getHeight() + "cm，" + student.getWeight() + "kg");
        //大三期间身高增加2cm，体重减少3kg
        student.setHeight(student.getHeight() + 2);
        student.setWeight(student.getWeight() - 3);
        System.out.println("大三期间身高增加2cm，体重减少3kg");
        System.out.println(student.getName() + "，" + student.getAge() + "岁，" + student.getHeight() + "cm，" + student.getWeight() + "kg");
    }
}
