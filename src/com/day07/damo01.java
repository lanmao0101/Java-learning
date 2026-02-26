package com.day07;

public class damo01 {
    // 给出一个数组和一个数字，找出所有等于数字的元素并删除，生成对应长度的新数组
    // 数组是随机生成1~4的数组，长度20
    static void main(String[] args) {
        // 1. 生成原始数组（长度20，元素1-4）
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 4 + 1);
        }
        System.out.println("原始数组（长度20）：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2. 定义要删除的数字
        int num = 1;

        // ========== 核心修改：统计有效元素数量（不等于num的元素） ==========
        int validCount = 0; // 记录有效元素个数（删除后剩余的元素数）
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                validCount++;
            }
        }

        // ========== 核心修改：创建新数组，长度为有效元素数 ==========
        int[] newArr = new int[validCount];
        int index = 0; // 新数组的索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[index] = arr[i];
                index++;
            }
        }

        // 3. 输出删除后的新数组（长度为有效元素数）
        System.out.println("\n删除数字" + num + "后的数组（长度" + newArr.length + "）：");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}