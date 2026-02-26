package com.day11.demo03;

// 子类：安卓手机（继承手机，新增NFC功能）
public class AndroidPhone extends Phone {
    // 无参构造
    public AndroidPhone() {
    }

    // 带参构造：调用父类构造
    public AndroidPhone(String brand, double price) {
        super(brand, price);
    }

    // NFC功能（方法名更规范，显示品牌）
    public void nfcFunction() {
        System.out.println(getBrand() + "安卓手机：使用NFC功能");
    }
}
