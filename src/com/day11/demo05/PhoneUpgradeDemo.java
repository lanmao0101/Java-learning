package com.day11.demo05;

// 测试类：调用所有核心功能
public class PhoneUpgradeDemo {
    public static void main(String[] args) {
        //第一代手机
        System.out.println("第一代手机功能：");
        FirstGenPhone firstGenPhone = new FirstGenPhone();
        firstGenPhone.call();
        //第二代手机
        System.out.println("\n第二代手机功能：");
        SecondGenPhone secondGenPhone = new SecondGenPhone();
        secondGenPhone.call();
        secondGenPhone.sendMessage();
        //第三代手机
        System.out.println("\n第三代手机功能：");
        ThirdGenPhone thirdGenPhone = new ThirdGenPhone();
        thirdGenPhone.call();
        thirdGenPhone.sendMessage();
        thirdGenPhone.playGame();
    }
}