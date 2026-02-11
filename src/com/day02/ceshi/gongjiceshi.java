package com.day02.ceshi;

public class gongjiceshi {
    public static void main(String[] args) {
        /*
            我方：叉子           对方：长手
            攻击：220            攻击：210
            防御：85             防御：80
            血量：1012.5         血量：1223.3
            技能加成:  1.2       技能加成: 1.3

            技能造成伤害的公式：攻击力 * 技能加成 – 对方防御力
            普攻造成伤害的公式：攻击力 – 对方防御力

            计算：
                我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
                我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？

             规则：经常发生改变的数据，用变量记录
        */
        //变量定义我方攻击力
        int myAttack = 220;
        //变量定义我方防御力
        int myDefense = 85;
        //变量定义我方血量
        double myHp = 1012.5;
        //变量定义我方技能加成
        double mySkill = 1.2;
        //变量定义对方攻击力
        int enemyAttack = 210;
        //变量定义对方防御力
        int enemyDefense = 80;
        //变量定义对方血量
        double enemyHp = 1223.3;
        //变量定义技能加成
        double enemySkill = 1.3;
        //我方第一次普通攻击造成伤害
        System.out.println("我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？");
        System.out.println("普通攻击：" + (myAttack - enemyDefense) + "，对方剩余血量：" + (enemyHp - (myAttack - enemyDefense)));
        //我方第二次技能攻击造成伤害
        System.out.println("我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？");
        System.out.println("技能攻击：" + (myAttack * mySkill - enemyDefense) + "，对方剩余血量：" + (enemyHp - (myAttack * mySkill - enemyDefense)));
        //敌方第一次普通攻击造成伤害
        System.out.println("敌方第一次进行普通攻击，造成多少伤害，我方还剩余多少血量？");
        System.out.println("普通攻击：" + (enemyAttack - myDefense) + "，我方剩余血量：" + (myHp - (enemyAttack - myDefense)));
        //敌方第二次技能攻击造成伤害
        System.out.println("敌方第二次进行技能攻击，造成多少伤害，我方还剩余多少血量？");
        System.out.println("技能攻击：" + (enemyAttack * enemySkill - myDefense) + "，我方剩余血量：" + (myHp - (enemyAttack * enemySkill - myDefense)));


    }
}
