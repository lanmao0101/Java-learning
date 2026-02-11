package com.day03;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
    /*
    需求：初始最大生命200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来
    假设，游戏人物不会死亡，最少1点血
    问：最终游戏人物血量是多少？
     */
        int maxHp = 200;
        int hurt;
        int recover;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入X：");
        hurt = sc.nextInt();
        System.out.println("请输入Y：");
        recover = sc.nextInt();
        maxHp -= hurt;
        if(maxHp<=1) {
            maxHp = 1;
        }
        maxHp += recover;
        //最终血量
        System.out.println("最终血量："+maxHp);
    }
}
