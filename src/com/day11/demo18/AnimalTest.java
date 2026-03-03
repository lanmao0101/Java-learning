package com.day11.demo18;

public class AnimalTest {
    public static void main(String[] args) {
        // 多态：父类引用指向子类对象（抽象类的核心使用方式）
        Animal cat = new Cat("汤姆", "灰色");
        Animal dog = new Dog("旺财", "黄色");

        // 1. 调用抽象方法：执行子类重写的逻辑（运行看右边）
        cat.eat();
        dog.eat();
        System.out.println("------------------");
        // 2. 调用普通方法：执行父类的共性逻辑
        cat.drink();
        dog.drink();
        System.out.println("------------------");
        // 3. 调用子类特有方法：先判断类型，再强制转换
        if (cat instanceof Cat) {
            ((Cat) cat).catchMouse();
        }
        if (dog instanceof Dog) {
            ((Dog) dog).lookHome();
        }
    }
}
