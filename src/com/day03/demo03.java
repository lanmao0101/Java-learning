package com.day03;

import java.util.Scanner;
/**
 * 需求：
 * 录入成绩，如果成绩在0-100之间，则判断是否通过，否则提示输入错误
 */
public class demo03 {
    static void main(String[] args){
        //定义一场考试的成绩
        int score;
        ///录入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        //判断成绩是否合理，满足0-100之间
        score = sc.nextInt();
        if(score>=0 && score<=100){
            //判断成绩是否合格
            if(score>=60){
                System.out.println("恭喜通过");
            }
            else{
                System.out.println("请重新考试");
            }
        }
        else{
            System.out.println("请输入正确的成绩");
        }
    }
}
