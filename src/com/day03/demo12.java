package com.day03;

import java.util.Scanner;

public class demo12 {
    static void main(String[] args) {
        //生成1~100的随机数，键盘录入一个数字，判断该数字是否猜对。
        //猜大了要提示猜大了，猜小了要提示猜小了
        int random = (int)(Math.random() * 100 + 1);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字：");
            int number = sc.nextInt();
            if (number > random) {
                System.out.println("猜大了");
            }
            else if (number < random) {
                System.out.println("猜小了");
            }
            else {
                System.out.println("恭喜猜对了");
                break;
            }
        }
    }
}
