package com.day12.demo06;

public class LengthOfLastWord {
    public static void main(String[] args) {
        // 测试用例1：题目示例1
        String s1 = "Hello World";
        System.out.println("输入：\"" + s1 + "\"");
        System.out.println("输出：" + lengthOfLastWord(s1)); // 输出：5

        // 测试用例2：题目示例2（首尾空格、多空格）
        String s2 = "  fly me   to   the moon  ";
        System.out.println("输入：\"" + s2 + "\"");
        System.out.println("输出：" + lengthOfLastWord(s2)); // 输出：4

        // 测试用例3：题目示例3
        String s3 = "luffy is still joyboy";
        System.out.println("输入：\"" + s3 + "\"");
        System.out.println("输出：" + lengthOfLastWord(s3)); // 输出：6
    }

    /**
     * 计算字符串最后一个单词的长度
     * @param s 输入字符串（由单词和空格组成）
     * @return 最后一个单词的长度
     */
    public static int lengthOfLastWord(String s) {
        // 1. 边界处理：空串直接返回0
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int length = 0;
        // 2. 从字符串末尾开始遍历
        for (int i = s.length() - 1; i >= 0; i--) {
            // 遇到非空格：开始计数
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                // 遇到空格，且已经开始计数：说明最后一个单词结束，直接返回长度
                if (length > 0) {
                    break;
                }
            }
        }

        return length;
    }
}
