package com.day12.demo06;

import java.util.Scanner;

public class CharCountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 读取输入：第一行字符串（支持空格），第二行字符
        String str = sc.nextLine();
        char target = sc.nextLine().charAt(0); // 取输入的第一个字符（题目保证非空格）

        // 2. 调用统计方法，不区分大小写
        int count = countCharIgnoreCase(str, target);

        // 3. 输出结果
        System.out.println(count);

        sc.close();
    }

    /**
     * 统计字符串中目标字符的出现次数（不区分大小写）
     * @param str 原始字符串（支持字母、数字、空格）
     * @param target 目标字符（非空格）
     * @return 出现次数
     */
    public static int countCharIgnoreCase(String str, char target) {
        // 边界处理：空串直接返回0
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        // 将目标字符统一转为小写，用于不区分大小写比较
        char targetLower = Character.toLowerCase(target);

        // 遍历字符串每一个字符
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            // 统一转为小写后比较，实现不区分大小写
            if (Character.toLowerCase(current) == targetLower) {
                count++;
            }
        }
        return count;
    }
}
