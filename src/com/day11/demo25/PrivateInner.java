package com.day11.demo25;

// 拆分为独立的公共类（原 private 修饰的内部类，拆分后需改为 public 才能被外部访问）
public class PrivateInner {
    // 持有外部类的引用，模拟原内部类访问外部类成员的逻辑
    private Outer outer;

    // 通过构造器注入 Outer 对象
    public PrivateInner(Outer outer) {
        this.outer = outer;
    }

    public void show() {
        System.out.println("这是原 private 内部类拆分后的独立类方法");
        // 通过 getter 访问 Outer 的私有成员
        System.out.println("访问外部类成员：" + outer.getOuterField());
    }
}
