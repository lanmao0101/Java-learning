package com.day12.demo06;

public class DataDesensitization {
    public static void main(String[] args) {
        // 测试手机号脱敏
        String phone = "13112345678";
        String desPhone = desensitizePhone(phone);
        System.out.println("原始手机号：" + phone);
        System.out.println("脱敏后：" + desPhone); // 输出：131****5678

        // 测试邮箱脱敏
        String email = "zw1234@163.com";
        String desEmail = desensitizeEmail(email);
        System.out.println("原始邮箱：" + email);
        System.out.println("脱敏后：" + desEmail); // 输出：z***@163.com
    }

    /**
     * 手机号脱敏：中间4位替换为****
     * @param phone 原始手机号（11位有效手机号）
     * @return 脱敏后的手机号
     */
    public static String desensitizePhone(String phone) {
        // 边界校验：非11位手机号直接返回原串
        if (phone == null || phone.length() != 11) {
            return phone;
        }
        // 截取前3位 + **** + 后4位
        return phone.substring(0, 3) + "****" + phone.substring(7);
    }

    /**
     * 邮箱脱敏：保留首字母和@后内容，中间用***填充
     * @param email 原始邮箱
     * @return 脱敏后的邮箱
     */
    public static String desensitizeEmail(String email) {
        // 边界校验：空串/无@的邮箱直接返回
        if (email == null || !email.contains("@")) {
            return email;
        }

        // 拆分邮箱为用户名和域名两部分
        int atIndex = email.indexOf("@");
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex);

        // 用户名脱敏：保留首字母，中间用***
        if (username.length() <= 1) {
            // 用户名长度为1时，直接保留
            return username + domain;
        }
        return username.charAt(0) + "***" + domain;
    }
}
