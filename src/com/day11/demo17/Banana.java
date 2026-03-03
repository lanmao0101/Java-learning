package com.day11.demo17;

// 3. 子类2：香蕉（必须重写抽象方法eat()）
class Banana extends Fruit {
    public Banana(String name) {
        super(name);
    }

    // 重写抽象方法：实现香蕉的具体吃法
    @Override
    public void eat() {
        System.out.println("吃" + getName() + "：剥了皮再吃");
    }
}
