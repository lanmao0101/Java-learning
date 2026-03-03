package com.day11.demo19;

public class AnimalTest {
    public static void main(String[] args) {
        // 青蛙（继承+实现接口）
        Animal frog = new Frog("青娃", "绿色");
        frog.eat();
        ((Swimming)frog).swimming();
        System.out.println("------------------");
        // 狗（继承+实现接口）
        Animal dog = new Dog("旺财", "白色");
        dog.eat();
        ((Swimming)dog).swimming();
        System.out.println("------------------");
        // 兔子（仅继承，不实现接口）
        Animal rabbit = new Rabbit("小兔子", "米色");
        rabbit.eat();
        System.out.println("------------------");
    }
}
