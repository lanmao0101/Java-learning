package com.day12.demo03;

public class test01 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println(s1 == s2); // true（s1、s2指向常量池同一个对象）
        System.out.println(s1 == s3); // false（s3是堆中新建对象，地址不同）
        System.out.println(s1.equals(s3)); // true（内容完全一致）
    }
}
