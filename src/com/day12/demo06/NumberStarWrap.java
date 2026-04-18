package com.day12.demo06;

import java.util.Scanner;

public class NumberStarWrap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String input = sc.nextLine();
        sc.close();

        String result = wrapNumbersWithStar(input);
        System.out.println("处理后：" + result);
    }

    /**
     * 遍历字符串，为连续数字前后添加*
     * @param input 原始字符串
     * @return 处理后的字符串
     */
    public static String wrapNumbersWithStar(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        boolean inNumber = false; // 标记当前是否在数字片段中

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                if (!inNumber) {
                    // 数字片段开始，先加*
                    sb.append('*');
                    inNumber = true;
                }
                sb.append(c);
            } else {
                if (inNumber) {
                    // 数字片段结束，先加*
                    sb.append('*');
                    inNumber = false;
                }
                sb.append(c);
            }
        }

        // 处理字符串以数字结尾的情况
        if (inNumber) {
            sb.append('*');
        }

        return sb.toString();
    }
}
