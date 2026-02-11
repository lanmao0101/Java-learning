package com.day02.ceshi;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        //定义一个scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.next();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的体重：");
        double weight = sc.nextDouble();
    }
}
