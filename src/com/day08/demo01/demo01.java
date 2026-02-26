package com.day08.demo01;

public class demo01 {
    static void main(String[] args) {
        //创建手机对象
        Phone phone1 = new Phone();
        phone1.brand = "华为";
        phone1.price = 5999.0;
        phone1.color = "蓝色";
        //创建手机对象
        Phone phone2 = new Phone();
        phone2.brand = "苹果";
        phone2.price = 9999.0;
        phone2.color = "黑色";
        System.out.println(phone1.brand + " " + phone1.price + " " + phone1.color);
        System.out.println(phone2.brand + " " + phone2.price + " " + phone2.color);
    }
}
