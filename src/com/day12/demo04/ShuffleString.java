package com.day12.demo04;

import java.util.Random;

public class ShuffleString {
    public static void main(String[] args) {
        // 1. 定义任意原始字符串
        String originalStr = "HelloWorld123";
        System.out.println("原始字符串：" + originalStr);

        // 2. 调用打乱方法
        String shuffledStr = shuffle(originalStr);

        // 3. 输出结果
        System.out.println("打乱后：" + shuffledStr);
    }

    /**
     * 打乱字符串内容的方法
     * @param str 原始字符串
     * @return 打乱后的字符串
     */
    public static String shuffle(String str) {
        // 边界处理：空串或null直接返回
        if (str == null || str.length() <= 1) {
            return str;
        }

        // 1. 将字符串转为字符数组（因为String不可变，数组方便操作）
        char[] chars = str.toCharArray();
        Random random = new Random();

        // 2. Fisher-Yates 洗牌算法核心逻辑
        // 从最后一个元素开始，往前遍历
        for (int i = chars.length - 1; i > 0; i--) {
            // 生成一个 [0, i] 范围内的随机索引
            int randomIndex = random.nextInt(i + 1);

            // 3. 交换当前元素和随机位置的元素
            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }

        // 4. 将字符数组转回字符串并返回
        return new String(chars);
    }
}
