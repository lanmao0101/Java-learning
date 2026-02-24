package com.day10.demo03;

/**
 * final关键字所有核心用法的完整演示
 * 包含：修饰类、方法、变量（基本类型/引用类型）、静态常量
 */
public class FinalAllUsagesDemo {

    // ====================== 1. final修饰变量 ======================
    // 1.1 静态常量（static final）：全局不可变，命名规范全大写
    public static final double PI = 3.1415926;
    // 1.2 实例final变量：声明时赋值
    private final String INSTANCE_CONST = "实例级不可变变量";
    // 1.3 实例final变量：构造方法中赋值
    private final int CUSTOM_VALUE;

    // 构造方法：给final实例变量赋值（只能赋值一次）
    public FinalAllUsagesDemo(int customValue) {
        this.CUSTOM_VALUE = customValue;
        // this.CUSTOM_VALUE = 100; // 编译报错：final变量只能赋值一次
    }

    // ====================== 2. final修饰方法 ======================
    // final方法：子类不能重写
    public final void finalMethod() {
        System.out.println("这是final修饰的方法，子类无法重写");
    }

    // 演示final修饰局部变量和引用类型
    public void testFinalReferenceAndLocalVar() {
        // 2.1 final修饰基本类型局部变量：赋值后不可改
        final int localFinalNum = 10;
        System.out.println("\n1. final局部基本类型变量值：" + localFinalNum);
        // localFinalNum = 20; // 编译报错：final局部变量不能重复赋值

        // 2.2 final修饰引用类型（数组）：引用地址不可改，但内容可改
        final int[] finalArray = {1, 2, 3};
        System.out.println("2. final数组修改前第一个元素：" + finalArray[0]);
        finalArray[0] = 100; // 合法：修改数组内容
        System.out.println("   final数组修改后第一个元素：" + finalArray[0]);
        // finalArray = new int[]{4,5,6}; // 编译报错：引用地址不能改

        // 2.3 final修饰引用类型（对象）：引用地址不可改，对象属性可改
        final Person finalPerson = new Person("张三", 20);
        System.out.println("3. final对象修改前年龄：" + finalPerson.getAge());
        finalPerson.setAge(25); // 合法：修改对象属性
        System.out.println("   final对象修改后年龄：" + finalPerson.getAge());
        // finalPerson = new Person("李四", 30); // 编译报错：引用地址不能改
    }

    // ====================== 程序入口 ======================
    public static void main(String[] args) {
        // 演示final变量用法
        FinalAllUsagesDemo demo = new FinalAllUsagesDemo(99);
        System.out.println("=== final修饰变量演示 ===");
        System.out.println("1. 静态常量PI：" + FinalAllUsagesDemo.PI);
        System.out.println("2. 实例final变量：" + demo.INSTANCE_CONST);
        System.out.println("3. 构造方法赋值的final变量：" + demo.CUSTOM_VALUE);

        // 演示final方法
        System.out.println("\n=== final修饰方法演示 ===");
        demo.finalMethod();
        // 子类调用父类final方法（合法）
        Child child = new Child();
        child.finalMethod();

        // 演示final引用类型
        System.out.println("\n=== final修饰引用类型演示 ===");
        demo.testFinalReferenceAndLocalVar();

        // 演示final类（不能被继承）
        System.out.println("\n=== final修饰类演示 ===");
        FinalClass finalClass = new FinalClass();
        finalClass.show();
        // SubFinalClass sub = new SubFinalClass(); // 编译报错：无法继承final类
    }

    // ====================== 内部类：演示final方法/类 ======================
    // 父类：包含final方法
    static class Parent {
        public final void finalMethod() {
            System.out.println("父类的final方法");
        }
    }

    // 子类：无法重写父类的final方法
    static class Child extends Parent {
        // @Override
        // public void finalMethod() {} // 编译报错：不能重写final方法
    }

    // final类：不能被继承
    static final class FinalClass {
        public void show() {
            System.out.println("这是final类的方法，该类不能被继承");
        }
    }

    // // 编译报错：无法继承final类
    // static class SubFinalClass extends FinalClass {}

    // 辅助类：演示final引用类型
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}