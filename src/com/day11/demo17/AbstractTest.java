package com.day11.demo17;

// 4. 测试类：验证抽象类的使用
public class AbstractTest {
    public static void main(String[] args) {
        // 【关键1】抽象类不能直接实例化（下面这行代码会编译报错）
        // Fruit fruit = new Fruit("水果");

        // 【关键2】多态：父类引用指向子类对象（抽象类的核心价值）
        Fruit apple = new Apple("红富士苹果");
        Fruit banana = new Banana("小米蕉");

        // 【关键3】调用抽象方法：执行子类的具体实现（多态体现）
        apple.eat();
        banana.eat();
    }
}
