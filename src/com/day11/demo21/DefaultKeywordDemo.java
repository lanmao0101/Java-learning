package com.day11.demo21;

// Java 8+ 带 default 方法的接口
interface NewInterface {
    // 抽象方法：必须重写（契约）
    void coreMethod();

    // default 方法：有方法体，实现类可直接用，无需重写
    default void defaultMethod(){
        System.out.println("这是 default 方法的默认实现");
    }
}

// 实现类1：只重写核心方法，直接用 default 方法
class Demo1 implements NewInterface {
    @Override
    public void coreMethod() {
        System.out.println("Demo1 实现核心方法");
    }
    // 无需重写 defaultMethod，直接继承使用
}

// 实现类2：重写核心方法 + 定制 default 方法
class Demo2 implements NewInterface {
    @Override
    public void coreMethod() {
        System.out.println("Demo2 实现核心方法");
    }

    // 按需重写 default 方法，定制逻辑
    @Override
    public void defaultMethod() {
        System.out.println("Demo2 定制了 default 方法");
    }
}

// 测试
public class DefaultKeywordDemo {
    public static void main(String[] args) {
        NewInterface d1 = new Demo1();
        d1.coreMethod();   // 输出：Demo1 实现核心方法
        d1.defaultMethod();  // 输出：这是 default 方法的默认实现

        NewInterface d2 = new Demo2();
        d2.coreMethod();   // 输出：Demo2 实现核心方法
        d2.defaultMethod();// 输出：Demo2 定制了 default 方法
    }
}
