package com.day02.ceshi;

// 修正1：类名改为大驼峰 Demo2（符合Java命名规范）
public class dome2 {
    static void main(String[] args) { // 核心修正：添加main方法（程序入口）
        // 所有变量和打印语句都移入main方法中
        // 定义char数据类型变量
        char ch = 'a';
        // 定义byte数据类型变量（最大值127）
        byte b = 127;
        // 定义short数据类型变量（最大值32767）
        short s = 32767;
        // 定义int数据类型变量（最大值2147483647）
        int i = 2147483647;
        // 定义long数据类型变量（最大值，结尾必须加L）
        long l = 9223372036854775807L;
        // 定义float数据类型变量（最大值，结尾必须加f）
        float f = 3.4028235E38f;
        // 定义double数据类型变量（最大值）
        double d = 1.7976931348623157E308;
        // 定义boolean数据类型变量
        boolean bool = true;

        // 打印所有变量值（现在在main方法内，可正常执行）
        System.out.println("char类型：" + ch);
        System.out.println("byte类型：" + b);
        System.out.println("short类型：" + s);
        System.out.println("int类型：" + i);
        System.out.println("long类型：" + l);
        System.out.println("float类型：" + f);
        System.out.println("double类型：" + d);
        System.out.println("boolean类型：" + bool);
    }
}