package com.day05;

import java.util.Scanner;

public class demo02 {
    static void main(String[] args) {
        //跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，
        //剩余的分数再求平均数，改平均数为选手最终得分。
        //要求1:利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
        //要求2:定义方法分别求数组的最大值和最小值
        //要求3:计算五名评委的总分
        //要求4:总分-最大值-最小值，求选手最终平均分
        int[] scores = new int[5];
            for (int i = 0; i < scores.length; i++) {
                System.out.println("请输入第" + (i + 1) + "个评委的打分：");
                int score = new Scanner(System.in).nextInt();
                if (score >= 0){
                    scores[i] = score;
                    continue;
                }
                System.out.println("输入的打分有误，请重新输入：");
                i--;
            }
            //平均值
        double sum = 0;
            sum = getAvg( scores);
            System.out.println("选手的最终得分为：" + sum);
    }
    // 定义方法，求数组的最大值,返回int
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    // 定义方法，求数组的最小值,返回int
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    // 定义方法，求数组的平均值,返回double
    public static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum -= getMax(arr);
        sum -= getMin(arr);
        return sum * 1.0 / (arr.length - 2);
    }
}
