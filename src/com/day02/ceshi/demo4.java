package com.day02.ceshi;

import java.util.Scanner;

public class demo4 {
    //键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
    public static void main(String[] args) {
        //键盘输入三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        //获取个位
        System.out.println("个位：" + number % 10);
        //获取十位
        System.out.println("十位：" + number / 10 % 10);
        //获取百位
        System.out.println("百位：" + number / 100);
    }
}
