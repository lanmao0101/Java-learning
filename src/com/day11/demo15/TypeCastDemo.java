package com.day11.demo15;

public class TypeCastDemo {
    public static void main(String[] args) {
        // 第一步：自动转换（父类变量指向子类对象）
        Animal animal = new Cat();

        // 第二步：强制类型转换（从父类转回子类）
        Cat cat = (Cat) animal;
        cat.eat(); // 执行子类eat()，输出「猫吃小鱼干」
        cat.catchMouse(); // 可以调用子类特有方法，输出「猫抓老鼠」

        // 【避坑】强制转换的前提：父类变量实际指向的是该子类对象！
        // 错误示例（编译通过，运行报错）：
        // Animal animal2 = new Animal();
        // Cat cat2 = (Cat) animal2; // ClassCastException（动物不能强转成猫）
    }
}