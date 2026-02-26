package com.day03;

import java.util.Scanner;

public class demo05 {
    static void main(String[] args) {
        // 卡拉兹函数：对输入数字，偶数则除以2，奇数则3*n+1
        Scanner sc = new Scanner(System.in);

        // 1. 提示输入并读取一次数字，保存到变量中（核心修改）
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt(); // 只读取一次输入，后续都用这个变量

        // 2. 卡拉兹函数逻辑判断
        int result;
        if (num % 2 == 0) {
            result = num / 2;
            System.out.println(num + " 是偶数，执行卡拉兹函数结果：" + result);
        } else {
            result = 3 * num + 1;
            System.out.println(num + " 是奇数，执行卡拉兹函数结果：" + result);
        }

        // 3. 关闭扫描器（规范操作，避免资源泄漏）
        sc.close();
    }
}