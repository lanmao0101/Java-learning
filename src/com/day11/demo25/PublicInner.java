package com.day11.demo25;

public class PublicInner {
    // JDK16+ 支持静态变量（JDK8 需删除此行）
    public static final String INNER_STATIC_FIELD = "JDK16+ 内部类静态变量";

    public void display() {
        System.out.println("这是原 public 内部类拆分后的独立类方法");
        System.out.println("内部类静态变量：" + INNER_STATIC_FIELD);
    }
}