package com.day04;

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        //给定一个整数数组nums和一个整数目标值target.
        //请你在该数组中找出和为目标值target的那两个整数.列出所有满足条件的组合
        //并输出它们的数组索引。
        //随机生成一个整数数组0~10的整数数组
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
        //输入一个目标值
        System.out.println("请输入一个目标值：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
