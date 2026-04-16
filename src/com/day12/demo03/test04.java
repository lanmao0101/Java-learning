package com.day12.demo03;

public class test04 {
    public static void main(String[] args) {
        //字符串的截取
        String s = "HelloWorld";

// 从 index=3 开始，截取到末尾
        String s1 = s.substring(3);   // "loWorld"

// 从 index=2 开始，到 index=5（不包含5）
        String s2 = s.substring(2,5); // "llo"
    }
}
