package com.day12.demo03;

public class test05 {
    public static void main(String[] args) {
        //字符串的替换
        String s = "a b c a b c";

// 替换所有匹配字符
        String r1 = s.replace('a', 'x');    // "x b c x b c"

// 替换所有匹配字符串
        String r2 = s.replace("ab", "xx");

// 正则替换（替换所有数字）
        String r3 = s.replaceAll("\\d", "*");

// 替换第一个匹配
        String r4 = s.replaceFirst("a", "A");
    }
}
