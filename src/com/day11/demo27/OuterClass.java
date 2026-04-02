package com.day11.demo27;

// 外部类
public class OuterClass {
    // 外部类的静态变量
    private static String staticOuterStr = "我是外部类的静态变量";
    // 外部类的非静态变量（实例变量）
    private String instanceOuterStr = "我是外部类的实例变量";

    // 外部类的静态方法
    private static void staticOuterMethod() {
        System.out.println("调用了外部类的静态方法");
    }

    // 外部类的非静态方法（实例方法）
    private void instanceOuterMethod() {
        System.out.println("调用了外部类的实例方法");
    }

    // ====================== 静态内部类（核心）======================
    public static class StaticInnerClass {
        // 静态内部类的静态方法
        public static void staticInnerMethod() {
            // ✅ 规则2：静态内部类可以直接访问外部类的【静态变量/静态方法】
            System.out.println("静态内部类静态方法访问外部类静态变量：" + staticOuterStr);
            staticOuterMethod();

            // ❌ 错误：静态内部类不能直接访问外部类的【非静态变量/非静态方法】
            // System.out.println(instanceOuterStr);
            // instanceOuterMethod();

            // ✅ 规则2补充：要访问非静态成员，必须先创建外部类的对象
            OuterClass outerObj = new OuterClass();
            System.out.println("通过外部类对象访问非静态变量：" + outerObj.instanceOuterStr);
            outerObj.instanceOuterMethod();
        }

        // 静态内部类的实例方法
        public void instanceInnerMethod() {
            System.out.println("调用了静态内部类的实例方法");
            // 同样可以访问外部类静态成员
            System.out.println("实例方法访问外部类静态变量：" + staticOuterStr);
        }
    }
    // ==============================================================
}
