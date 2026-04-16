package com.day12.demo03;

public class test06 {

    public static void main(String[] args) {
        String s = "HelloJava";

// 查找字符第一次出现的索引
        int idx1 = s.indexOf('J');        // 5

// 查找字符串第一次出现
        int idx2 = s.indexOf("Java");     // 5

// 从后往前找
        int idx3 = s.lastIndexOf('l');    // 3

// 判断是否包含
        boolean has = s.contains("Java"); // true
    }
}
