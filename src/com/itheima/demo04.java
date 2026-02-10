package com.itheima;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        /*小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大
 已知：
     饱了么App：全场9折优惠
     美单App：满30减10元
         */
        //键盘输入外卖价格

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入外卖价格：");
        double price = sc.nextDouble();
        double app1,app2;
        //在饱了么app的优惠价格
        app1 = price * 0.9;
        //在美单app的优惠价格
        if (price >= 30){
            app2 = price - 10;
        }
        else{
            app2 = price;
        }
        //两家的价格分别是
        System.out.println("在饱了么app的优惠价格："+app1);
        System.out.println("在美单app的优惠价格："+app2);
        if (app1 < app2){
            System.out.println("饱了么App：全场9折优惠");
        }
        else{
            System.out.println("美单App：满30减10元");
        }
    }
}
