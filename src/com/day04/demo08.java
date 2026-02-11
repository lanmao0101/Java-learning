package com.day04;

public class demo08 {
    public static void main(String[] args) {
        //创建2个长度为5的int数组，并赋值
        int[] scores = {90, 85, 95, 88, 100};
        int[] ages = {18, 19, 20, 21, 22};
        //将两个数组合并到一起
        int[] newArray = new int[scores.length + ages.length];
        for (int i = 0; i < scores.length; i++) {
            newArray[i] = scores[i];
        }
        for (int i = 0; i < ages.length; i++) {
            newArray[scores.length + i] = ages[i];
        }
        //将合并后的数组有序排列
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1 - i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        System.out.println("合并后的数组为：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }
}
