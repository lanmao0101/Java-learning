package com.day04;

public class demo02 {
    public static void main(String[] args) {
        //定义一个整数数组，存储5个元素并遍历
        int[] scores = new int[5];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 80;
        scores[3] = 70;
        scores[4] = 60;
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
