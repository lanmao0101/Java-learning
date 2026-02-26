package com.day11.demo03;

// 子类：苹果手机（继承手机，无独有功能）
public class IPhone extends Phone {
    // 无参构造
    public IPhone() {
    }

    // 带参构造：调用父类构造
    public IPhone(String brand, double price) {
        super(brand, price);
    }
    // 复用父类的call和sendMessage，无需额外代码
}
