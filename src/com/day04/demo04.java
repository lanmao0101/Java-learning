package com.day04;

public class demo04 {
    public static void main(String[] args) {
        //随机生成一个整数数组
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int)(Math.random() * 100 + 1);
        }
        System.out.println("随机生成的数组为：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        //将数组从大到小排序
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        System.out.println("\n排序后的数组为：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
    }
}
