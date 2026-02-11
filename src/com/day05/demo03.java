package com.day05;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        //班主任需要统计10名学生的数学成绩(0-100分)，
        //计算及格率，平均分，并找出最高分。
        //要求1:键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
        //要求2:定义方法，求及格人数，根据及格人数，求及格率。
        //要求3:定义方法求总分，根据总分求平均分
        //要求4:定义方法求最大值。
        int[] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
            }
            else {
                System.out.println("成绩无效，请重新输入！");
                i--;
            }
        }
        System.out.println("及格人数：" + getCount(scores));
        System.out.println("及格率：" + getRate(scores));
        System.out.println("总分：" + getSum(scores));
        System.out.println("平均分：" + getAvg(scores));
        System.out.println("最高分：" + getMax(scores));
    }
    // 定义方法，求及格人数
    public static int getCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        return count;
    }
    // 定义方法，求及格率
    public static double getRate(int[] arr) {
        return getCount(arr) * 1.0 / arr.length;
    }
    // 定义方法，求总分
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    // 定义方法，求平均分
    public static double getAvg(int[] arr) {
        return getSum(arr) * 1.0 / arr.length;
    }
    // 定义方法，求最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
