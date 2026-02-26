package com.day11.demo05;

// 第二代手机：继承打电话，新增发短信
class SecondGenPhone extends FirstGenPhone {
    public void sendMessage() {
        System.out.println("发短信");
    }
}
