package com.itheima;

public class demo10 {
    public static void main(String[] args) {
        //学习beak关键字，跳出循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("------------------------");
        //continue关键字，跳过当前循环，继续下一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
