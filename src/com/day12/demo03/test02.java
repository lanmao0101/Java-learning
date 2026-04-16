package com.day12.demo03;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 3;
        int attempts = 0;
        
        while (attempts < maxAttempts) {
            System.out.println("请输入用户名：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String pwd = scanner.next();
            
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登录成功！");
                break;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("用户名或密码错误！请重新输入\n");
                } else {
                    System.out.println("用户名或密码错误！您已用完所有登录机会，程序退出。");
                }
            }
        }
        
        scanner.close();
    }
}
