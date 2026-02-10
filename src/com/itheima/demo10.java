package com.itheima;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        //第一个测试功能
        System.out.println("------------------------");
        // 计算10000元、年利率1.7%，多少年能翻倍
        int year = 0;
        double money = 10000; // 本金

        // 循环计算，直到资金翻倍
        while (money < 20000) {
            money *= 1.017; // 每年本息更新
            year++;
            // 用String.format直接保留两位小数，简洁高效
            System.out.println("第" + year + "年后，本息合计：" + String.format("%.2f", money));
        }

        // 输出最终结果
        System.out.println("总共需要" + year + "年，本息合计：" + String.format("%.2f", money));

        //第二个测试功能
        System.out.println("------------------------");
        //珠穆朗玛峰8848.86米，纸张厚度0.1毫米，求一张纸折叠多少次可以比珠穆朗玛峰高
        double height = 8848.86, thickness = 0.1;
        int count = 0;
        while (thickness<height){
            thickness *= 2;
            count++;
        }
        System.out.println("折叠了"+count+"次，可以比珠穆朗玛峰高");
        //第三个测试功能
        System.out.println("------------------------");
        //键盘输入一个数，求各个位的数字之和，如果是负数，先取绝对值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("各个位数数字之和为：" + sum);
    }
}