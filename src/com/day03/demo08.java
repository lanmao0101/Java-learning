package com.day03;

import java.util.Scanner;
// 本程序演示了多个基础的Java编程练习，包括循环结构的应用：
// 1. 输出一个由星号组成的金字塔图案
// 2. 正序和倒序打印数字1到5
// 3. 计算1到5的累加和
// 4. 计算1到100之间所有偶数的和
// 5. 接收用户输入的两个数字，找出并打印这两个数字之间能同时被3和5整除的所有数
// 6. 实现斐波那契数列，计算并输出第10项的值
// 7. 根据公式sn=1-2+3-4+5-6+...+n计算前n项的和，其中n由用户输入
public class demo08 {
    public static void main(String[] args) {
        //第一个测试功能
        System.out.println("------------------------");
        //输出一个金字塔的结构
        for (int i = 1; i <= 5; i++) {
            // 打印空格
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //第二个测试功能
        System.out.println("------------------------");
        //打印1~5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //打印5~1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        //第三个测试功能
        System.out.println("------------------------");
        //求1~5的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
        //第四个测试功能
        System.out.println("------------------------");
        //求1~100的偶数和
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println(sum2);
        //第五个测试功能
        System.out.println("------------------------");
        //键盘输入两个数据，求在这之间既能被3整除，也能被5整除的数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数据：");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        //第六个测试功能
        System.out.println("------------------------");
        //开始两个数据0，1，之后每个数据都是前两个数据之和，第10项数据是多少
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= 8; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
        //第七个测试功能
        System.out.println("------------------------");
        //键盘输入一个数，数列是sn=1-2+3-4+5-6+...+n，求前n项的和
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = sc1.nextInt();
        int sum3 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum3 -= i;
            } else {
                sum3 += i;
            }
        }
        System.out.println(sum3);
    }
}
