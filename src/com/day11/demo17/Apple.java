package com.day11.demo17;

// 2. 子类1：苹果（必须重写抽象方法eat()）
class Apple extends Fruit {
    public Apple(String name) {
        super(name); // 调用父类构造方法初始化名称
    }

    // 重写抽象方法：实现苹果的具体吃法
    @Override
    public void eat() {
        System.out.println("吃" + getName() + "：洗干净后直接啃");
    }
}
