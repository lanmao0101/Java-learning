package com.day07;

import java.util.Random;

/**
 * 红包分发程序
 * 该程序用于将指定金额的红包分发给指定数量的人，确保每人至少获得0.01元，
 * 并且最后一人领取剩余的所有金额。
 */
public class demo02 {
    /**
     * 主函数，执行红包分发逻辑
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        // 给定两个整数M和N，M表示红包总金额，N表示红包个数
        // 红包不能被1人全部领取，每人领取的红包不能小于0.01元
        // 当N为1时，红包金额只能为M。
        // 最后一人领取全部红包。

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
            // 计算当前可分配的最大金额，确保每个人至少能分到0.01元
            int maxAmount = remainingMoney - (remainingCount - 1);
            // 生成随机金额（单位：分）
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
