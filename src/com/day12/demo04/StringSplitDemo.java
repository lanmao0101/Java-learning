package com.day12.demo04;

import java.util.Scanner;

public class StringSplitDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String input = sc.nextLine();

        // 空字符串不处理，直接结束
        if (input == null || input.isEmpty()) {
            System.out.println("空字符串，不处理");
            sc.close();
            return;
        }

        // 1. 补0：计算需要补的0的个数，使总长度为8的整数倍
        int len = input.length();
        int needZero = (8 - len % 8) % 8; // 取模两次，避免刚好整除时补8个0
        StringBuilder sb = new StringBuilder(input);
        // 循环补0
        for (int i = 0; i < needZero; i++) {
            sb.append("0");
        }
        String paddedStr = sb.toString();

        // 2. 按8个字符拆分并输出
        int lineNum = 1;
        for (int i = 0; i < paddedStr.length(); i += 8) {
            // 截取[i, i+8)区间的子串
            String sub = paddedStr.substring(i, Math.min(i + 8, paddedStr.length()));
            System.out.printf("第%d行：%s%n", lineNum++, sub);
        }

        sc.close();
    }
}
