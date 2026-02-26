package com.day04;

public class demo05 {
    static void main(String[] args) {
        //随机生成10个不重复的0~100的整数，保存到整数数组中
        int[] scores = new int[10];
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                int score = (int)(Math.random() * 101);
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (scores[j] == score) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    scores[i] = score;
                    break;
                }
            }
            System.out.print(scores[i] + "\t");
        }
    }
}
