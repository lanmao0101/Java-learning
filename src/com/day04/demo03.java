package com.day04;

import java.util.Scanner;

public class demo03 {
    static void main(String[] args) {
        //数组动态初始化
        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextInt();
        }
    }
}
