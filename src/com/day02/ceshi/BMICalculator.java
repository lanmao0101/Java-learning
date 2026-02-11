package com.day02.ceshi;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // 1. 创建Scanner对象，用于接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 2. 提示并获取用户输入的身高（单位：厘米）
        System.out.print("请输入您的身高（单位：米，例如175）：");
        double height = scanner.nextDouble();

        // 3. 提示并获取用户输入的体重（单位：千克）
        System.out.print("请输入您的体重（单位：千克，例如65）：");
        double weight = scanner.nextDouble();

        // 4. 计算BMI值：BMI = 体重 ÷ (身高 × 身高)
        double bmi = weight / (height * height)*10000;

        // 5. 根据BMI值判断身体状态和健康风险
        String status;
        String healthRisk;
        if (bmi < 18.5) {
            status = "消瘦";
            healthRisk = "部分增加";
        } else if (bmi >= 18.5 && bmi <= 23.9) {
            status = "正常";
            healthRisk = "正常";
        } else if (bmi >= 24.0 && bmi <= 26.9) {
            status = "偏胖";
            healthRisk = "增加";
        } else if (bmi >= 27.0 && bmi <= 29.9) {
            status = "肥胖";
            healthRisk = "中度增加";
        } else {
            status = "严重肥胖";
            healthRisk = "严重增加";
        }

        // 6. 输出结果（BMI保留两位小数，提升可读性）
        System.out.println("------------------------");
        System.out.printf("您的BMI指数为：%.2f%n", bmi);
        System.out.println("身体状态：" + status);
        System.out.println("健康风险：" + healthRisk);

        // 关闭Scanner
        scanner.close();
        //计算当前身高在标准bmi区间内，体重最多是多少
        double maxWeight = height * height * 23.9/10000;
        System.out.println("当前身高在标准bmi区间内，体重最多为："+maxWeight);
        //计算当前身高在标准bmi区间内，体重最少是多少
        double minWeight = height * height * 18.5/10000;
        System.out.println("当前身高在标准bmi区间内，体重最少为："+minWeight);
    }
}
