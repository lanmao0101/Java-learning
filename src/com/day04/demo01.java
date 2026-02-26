package com.day04;

public class demo01 {
    static void main(String[] args) {
        // ==================== 方式1：静态初始化（声明时直接赋值，无需指定长度） ====================
        // 适合知道具体元素的场景（你之前出错的核心就是没掌握这种方式的正确写法）
        int[] scores = {90, 85, 95, 88}; // 存储4个成绩的int数组
        String[] names = {"张三", "李四", "王五"}; // 存储3个名字的String数组
        boolean[] isPass = {true, false, true}; // 存储是否及格的boolean数组

        // ==================== 方式2：动态初始化（先指定长度，后赋值） ====================
        // 适合不知道具体元素，只知道长度的场景
        double[] heights = new double[5]; // 声明长度为5的double数组，初始值都是0.0
        // 逐个赋值（索引从0开始）
        heights[0] = 1.75;
        heights[1] = 1.80;
        heights[2] = 1.68;
        // 未赋值的元素会用默认值填充（double默认0.0，int默认0，String默认null，boolean默认false）

        // ==================== 访问数组元素（通过索引） ====================
        System.out.println("第一个成绩：" + scores[0]); // 输出90
        System.out.println("第二个名字：" + names[1]); // 输出李四
        System.out.println("第三个是否及格：" + isPass[2]); // 输出true
        System.out.println("第四个身高（默认值）：" + heights[3]); // 输出0.0

        // ==================== 获取数组长度 ====================
        System.out.println("成绩数组的长度：" + scores.length); // 输出4（注意：是length属性，不是方法，没有()）
        System.out.println("身高数组的长度：" + heights.length); // 输出5
    }
}