package com.day11.demo22;

interface MyInterface {
    // 静态方法：归接口所有
    static void staticMethod() {
        System.out.println("接口静态方法");
    }

    // 抽象方法：必须被实现类重写
    void abstractMethod();
}

class MyImpl implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("实现抽象方法");
    }
}

public class Test {
    public static void main(String[] args) {
        // ✅ 正确：通过接口名调用静态方法
        MyInterface.staticMethod();

        // ❌ 错误：不能通过实现类名调用
        // MyImpl.staticMethod();

        // ❌ 错误：不能通过对象调用
        // MyImpl obj = new MyImpl();
        // obj.staticMethod();
    }
}