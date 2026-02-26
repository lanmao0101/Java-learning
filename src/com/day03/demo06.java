package com.day03;

import java.util.Scanner;

public class demo06 {
    static void main(String[] args) {
        /*
        需求：很多App都有不同的优惠券
        假设，现在有以下优惠券
        全场商品满10减8
        全场商品满50减30
        全场商品满100减50
        全场商品满200减90

        会员卡：全场8折
        请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
         */
        // 定义变量接受键盘输入，添加输入提示
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品原价：");
        double originalPrice = sc.nextDouble();

        // 先判断输入价格是否合法（不能为0或负数）
        if (originalPrice <= 0) {
            System.out.println("输入价格有误，请输入正数");
            return; // 输入错误时直接退出程序
        }

        // 计算【使用优惠券后的价格】
        double couponPrice = originalPrice; // 默认不满足满减，价格为原价
        if (originalPrice >= 200) {
            couponPrice = originalPrice - 90;
        } else if (originalPrice >= 100) {
            couponPrice = originalPrice - 50;
        } else if (originalPrice >= 50) {
            couponPrice = originalPrice - 30;
        } else if (originalPrice >= 10) {
            couponPrice = originalPrice - 8;
        }

        // 计算【使用会员卡的价格】（全场8折，基于原价计算）
        double memberPrice = originalPrice * 0.8;

        // 比较两种优惠价格，取最小的作为最终最优惠价格
        double finalPrice = Math.min(couponPrice, memberPrice);

        // 输出结果，保留2位小数，符合价格显示习惯
        System.out.printf("最优惠的价格是：%.2f元%n", finalPrice);
    }
}