package com.day12.demo04;

import java.util.Scanner;

public class StringReverseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 循环读取输入，直到输入"拜拜"为止
        while (true) {
            System.out.print("请输入字符串：");
            String input = sc.nextLine();

            // 终止条件：输入"拜拜"时退出循环
            if ("拜拜".equals(input)) {
                System.out.println("程序结束");
                break;
            }

            // 调用反转方法，输出结果
            String reversed = reverseString(input);
            System.out.println("反转结果：" + reversed);
        }

        sc.close();
    }

    /**
     * 反转字符串的方法
     * @param str 待反转的原始字符串
     * @return 反转后的字符串
     */
    public static String reverseString(String str) {
        // 1. 边界处理：空串或null直接返回原串
        if (str == null || str.isEmpty()) {
            return str;
        }

        // 2. 使用StringBuilder的reverse方法高效反转（最优写法）
        return new StringBuilder(str).reverse().toString();

        // --- 手动反转写法（供理解原理，面试常考） ---
        // StringBuilder sb = new StringBuilder();
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     sb.append(str.charAt(i));
        // }
        // return sb.toString();
    }
}
