package com.day11.demo27;

public class TestStaticInner {
    public static void main(String[] args) {
        // ============== 1. 创建静态内部类对象（图中格式） ==============
        // 格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
        OuterClass.StaticInnerClass innerObj = new OuterClass.StaticInnerClass();

        // 调用静态内部类的【实例方法】
        innerObj.instanceInnerMethod();

        System.out.println("--------------------------");

        // ============== 2. 调用静态内部类的静态方法（图中格式） ==============
        // 格式：外部类名.内部类名.方法名();
        OuterClass.StaticInnerClass.staticInnerMethod();
    }
}