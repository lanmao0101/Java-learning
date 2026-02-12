package com.day05;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        //某快递公司的运费规则如下(首重1kg，超出部分按kg计算，不足1kg按1kg算):
        //首重1kg:10元;
        //超出1-5kg:每kg加2元;
        //超出5kg以上:每kg加1.5元。
        //键盘录入小数，表示用户快递的重量，计算最终的结果
        //要求1:快递重量必须大于0，否则重新输入
        //要求2:不同价位的计算，单独定义一个方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入快递的重量：");
        double weight = sc.nextDouble();
        System.out.println("运费为：" + getPrice(weight));
    }
    // 定义一个方法，参数传递快递的重量，返回最终的运费
    public static double getPrice(double weight) {
        double price = 0;
        if (weight > 0) {
            if (weight <= 1) {
                price = 10;
            }
            else if (weight <= 5) {
                price = 10 + (weight - 1) * 2;
            }
            else {
                price = 10 + 3 * 2 + (weight - 5) * 1.5;
            }
        }
        else {
            System.out.println("请输入正确的重量");
        }
        return price;
    }
}
