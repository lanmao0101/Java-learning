package com.day06;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示Java运行时内存核心区域：栈、堆、方法区（元空间）
 * 1. 栈内存：存储局部变量、方法调用栈
 * 2. 堆内存：存储对象实例、数组
 * 3. 方法区（元空间）：存储静态变量、字符串常量、类信息
 */
public class demo01 {
    // 静态变量 → 存储在【方法区（元空间）】
    private static final String STATIC_CONSTANT = "我是静态常量，存在方法区";
    // 字符串常量 → 存储在【字符串常量池（属于方法区）】
    private static final String STRING_POOL_CONSTANT = "我是字符串常量池中的常量";

    static void main(String[] args) {
        // ========== 1. 栈内存演示 ==========
        // 局部变量（int、引用类型）→ 存储在【栈内存】
        int stackInt = 100; // 基本类型值直接存在栈
        String stackStrRef = "栈中存储引用，对象存在堆/常量池"; // 引用在栈，字符串对象在常量池
        demo01 stackObjRef = new demo01(); // 引用在栈，对象实例在堆

        System.out.println("===== 栈内存演示 =====");
        System.out.println("局部变量stackInt值：" + stackInt);
        System.out.println("局部变量stackStrRef引用：" + stackStrRef);

        // ========== 2. 堆内存演示 ==========
        // 创建对象/数组 → 存储在【堆内存】
        List<String> heapList = new ArrayList<>(); // ArrayList对象在堆
        for (int i = 0; i < 5; i++) {
            // 每次new String()都会在堆创建新对象（区别于常量池）
            heapList.add("堆内存中的字符串" + i);
        }
        System.out.println("\n===== 堆内存演示 =====");
        System.out.println("堆中ArrayList的元素数量：" + heapList.size());

        // ========== 3. 方法区（元空间）演示 ==========
        System.out.println("\n===== 方法区（元空间）演示 =====");
        System.out.println("静态变量：" + STATIC_CONSTANT);
        System.out.println("字符串常量池常量：" + STRING_POOL_CONSTANT);

        // ========== 4. JVM内存使用监控 ==========
        System.out.println("\n===== JVM内存使用监控 =====");
        Runtime runtime = Runtime.getRuntime();
        // 总内存（JVM初始分配的内存）→ 单位：字节
        long totalMemory = runtime.totalMemory() / 1024 / 1024; // 转换为MB
        // 最大内存（JVM能使用的最大内存）
        long maxMemory = runtime.maxMemory() / 1024 / 1024;
        // 空闲内存
        long freeMemory = runtime.freeMemory() / 1024 / 1024;
        // 已使用内存
        long usedMemory = totalMemory - freeMemory;

        System.out.println("JVM总内存：" + totalMemory + " MB");
        System.out.println("JVM最大内存：" + maxMemory + " MB");
        System.out.println("JVM空闲内存：" + freeMemory + " MB");
        System.out.println("JVM已使用内存：" + usedMemory + " MB");

        // 手动触发GC（仅演示，实际由JVM自动管理）
        System.gc();
        System.out.println("\nGC后空闲内存：" + runtime.freeMemory() / 1024 / 1024 + " MB");
    }

    // 方法调用 → 方法栈帧入栈/出栈
    public void methodStackDemo() {
        // 该方法的局部变量 → 存储在【栈帧】中，方法执行完栈帧出栈，变量销毁
        int methodLocalVar = 200;
        System.out.println("方法内局部变量（栈内存）：" + methodLocalVar);
    }
}