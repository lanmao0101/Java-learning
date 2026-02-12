package com.day07;

import java.util.Random;

/**
 * 优化版红包分发程序
 * 该程序用于将指定金额的红包分发给指定数量的人，尽量使分配更平均，
 * 同时确保每人至少获得0.01元，最后一人领取剩余的所有金额。
 */
public class demo03 {
    /**
     * 主函数，执行红包分发逻辑
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        // 定义红包金额（单位：分）
        int money = 10000;
        // 定义红包个数
        int count = 10;

        // 初始化随机数生成器
        Random random = new Random();
        // 剩余可分配金额
        int remainingMoney = money;
        // 剩余待分发红包个数
        int remainingCount = count;

        // 循环分发前N-1个红包
        for (int i = 0; i < count - 1; i++) {
            // 动态计算期望值：剩余金额除以剩余人数
            double average = (double) remainingMoney / remainingCount;
            // 设置最大金额为期望值的两倍，防止极端情况
            int maxAmount = (int) Math.min(average * 2, remainingMoney - (remainingCount - 1));
            // 生成随机金额（单位：分），确保至少0.01元
            int amount = random.nextInt(maxAmount) + 1;
            // 输出当前红包金额
            System.out.println("第" + (i + 1) + "个红包金额：" + amount / 100.0);
            // 更新剩余金额和剩余红包个数
            remainingMoney -= amount;
            remainingCount--;
        }

        // 最后一个人领取剩余的所有金额
        System.out.println("第" + count + "个红包金额：" + remainingMoney / 100.0);
    }
}
