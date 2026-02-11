package com.day03;

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
        //输入一个大于2的数，判断是否为质数
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的数：");
        num = sc.nextInt();
        if(num>2){
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    System.out.println("不是质数");
                    return;
                }
            }
        }
        else{
            System.out.println("请输入大于2的数");
        }
        System.out.println("是质数");
    }
}
