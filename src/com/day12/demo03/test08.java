package com.day12.demo03;

public class test08 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloJava");
        for (int i = 0; i < 10000; i++){
            sb.append(i);
        }
        System.out.println(sb);
    }
}
