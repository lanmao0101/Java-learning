package com.day04;

import java.util.Scanner;

public class demo09 {
    public static void main(String[] args) {
        //给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //输入目标值
        System.out.println("请输入目标值：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        //开始寻找目标值
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("目标值" + target + "的索引为：" + i);
                return;
            }
        }
    }
}
