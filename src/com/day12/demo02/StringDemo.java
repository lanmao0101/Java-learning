package com.day12.demo02;

public class StringDemo {
    public static void main(String[] args) {
        // 1. 直接赋值
        // 最简单 最常用
        String s = "abc";
        System.out.println(s); // 输出: abc

        // 2. new + 构造方法的方式创建字符串对象
        // new + 空参构造
        String s1 = new String();
        System.out.println("--" + s1 + "@@"); // 输出: --@@（空字符串无内容）

        // 3. new + String参数构造（图中高亮的构造方法）
        String original = "hello";
        String s2 = new String(original);
        System.out.println(s2); // 输出: hello
        // 注意：s2是堆中新建对象，original是常量池对象，二者地址不同

        // 4. new + 字符数组构造
        char[] charArr = {'h','e','l','l','o'};
        String s3 = new String(charArr);
        System.out.println(s3); // 输出: hello

        // 5. new + 字节数组构造
        byte[] byteArr = {97,98,99}; // 对应ASCII: a(97), b(98), c(99)
        String s4 = new String(byteArr);
        System.out.println(s4); // 输出: abc
    }
}
