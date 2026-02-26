package com.day10.demo02;

public class StaticVariableDemo {
    static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};

        // 调用静态方法遍历数组
        ArrayUtils.printArr(arr); // 输出: [10, 20, 50, 34, 100]

        // 调用静态方法计算平均值
        double average = ArrayUtils.getAverage(arr);
        System.out.println("数组平均值: " + average); // 输出: 数组平均值: 42.8
    }
}
