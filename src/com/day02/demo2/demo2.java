package com.day02.demo2;

public class demo2 {
    //定义一个变量记录微信余额
    static double money = 10000;

    //定义一个变量记录支付宝余额
    static double money2 = 10000;

    //定义一个变量记录银行卡余额
    static double money3 = 10000;

    //计算一共有多少钱
    static double getMoney(){
        return money + money2 + money3;
    }
    //微信收了10块钱红包
    static void wechat(){
        money = money + 10;
    }
}
