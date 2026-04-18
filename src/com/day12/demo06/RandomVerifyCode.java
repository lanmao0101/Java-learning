package com.day12.demo06;

import java.util.Random;

public class RandomVerifyCode {
    public static void main(String[] args) {
        // 生成10个验证码示例
        for (int i = 0; i < 10; i++) {
            String code = generateVerifyCode();
            System.out.println("生成的验证码：" + code);
        }
    }

    /**
     * 随机生成符合规则的验证码：
     * 长度为5，包含4个字母（大小写随机）和1个数字，数字位置随机
     * @return 合法验证码
     */
    public static String generateVerifyCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // 1. 生成4个随机字母（大小写都可能）
        for (int i = 0; i < 4; i++) {
            // 随机选择大小写字母：A-Z(65-90) 或 a-z(97-122)
            if (random.nextBoolean()) {
                // 大写字母
                char upper = (char) (random.nextInt(26) + 'A');
                sb.append(upper);
            } else {
                // 小写字母
                char lower = (char) (random.nextInt(26) + 'a');
                sb.append(lower);
            }
        }

        // 2. 生成1个随机数字（0-9）
        char digit = (char) (random.nextInt(10) + '0');

        // 3. 把数字随机插入到5个位置中的任意一个（0~4）
        int insertPos = random.nextInt(5);
        sb.insert(insertPos, digit);

        return sb.toString();
    }
}
