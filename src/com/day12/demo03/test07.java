package com.day12.demo03;

public class test07 {
    public static void main(String[] args) {
        String s = "Hello";

// 是否为空串
        boolean b1 = s.isEmpty();

// 是否以...开头
        boolean b2 = s.startsWith("He");

// 是否以...结尾
        boolean b3 = s.endsWith("lo");

// 忽略大小写比较
        boolean b4 = s.equalsIgnoreCase("hello");

// 判断是否是空白（空格、tab、换行）
        boolean b5 = s.isBlank();  // JDK 11+
    }
}
