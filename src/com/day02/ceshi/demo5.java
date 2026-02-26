package com.day02.ceshi;

import java.util.Scanner;

public class demo5 {
    static void main(String[] args) {
        //键盘输入一个秒数
        Scanner sc = new Scanner(System.in);
        //按照秒数进行转换
        System.out.println("请输入一个秒数：");
        int seconds = sc.nextInt();
        //获取分钟
        int minutes = seconds / 60;
        //获取小时
        int hours = minutes / 60;
        //获取天数
        int days = hours / 24;
        System.out.println(days + "天" + hours % 24 + "小时" + minutes % 60 + "分" + seconds % 60 + "秒");
    }
}
