package com.day11.demo02;

//手机类（继承电子设备类）
public class Phone extends ElectronicDevice{
    //定义打电话的方法
    public void call() {
        System.out.println("打电话");
    }
    //定义发短信的方法
    public void sendMessage() {
        System.out.println("发短信");
    }
}
