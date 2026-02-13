package com.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 定义彩票实体类：存储单张彩票的红球、蓝球、是否追加
class LotteryTicket {
    int[] redBalls;   // 前区红球
    int[] blueBalls;  // 后区蓝球
    boolean isAdd;    // 是否追加

    public LotteryTicket(int[] redBalls, int[] blueBalls, boolean isAdd) {
        this.redBalls = redBalls;
        this.blueBalls = blueBalls;
        this.isAdd = isAdd;
    }
}

public class demo08 {
    public static void main(String[] args) {
        //大乐透选号规则明确规定:同一投注区内的号码不可重复，但不同投注区之间允许号码重复。
        //具体规则可分为前区和后区两个维度:
        //大乐透选号重复规则详解
        //1.前区号码不可重复。（红球）
        //投注范围:从01-35中选择5个号码。
        //规则要求:所选5个号码之间不可出现重复数字，如出现重复则该注视为无效投注。
        //2.后区号码不可重复，（蓝球）
        //投注范围:从01-12中选择2个号码。
        //规则要求:所选2个号码之间不可重复，否则同样视为无效投注。
        //3.跨区重复规则。
        //前区与后区号码允许交叉重复，例如前区选10，后区也可选10。
        //系统自动判定:跨区重复不会触发错误提示，属于有效投注。
        //玩法知识延伸
        //基本结构:采用”5+2”双区投注模式，前区35选5与后区12选2组合形成完整投注号码。
        //无效投注判定:同一区内重复号码在开奖前会被系统自动识别为无效票，无法参与兑奖。
        //策略提醒:虽然跨区重复有效，但统计显示前区与后区号码重复概率仅3.8%，建议选号时优先考虑号码分布合理性。
        //大乐透一等奖：5红球+2篮球
        //大乐透二等奖：5红球+1篮球
        //大乐透三等奖：4红球+2篮球或者5红球
        //大乐透四等奖：3红球+2篮球或者4红球+1篮球
        //大乐透五等奖：2红球+2篮球或者3红球+1篮球或者4红球
        //大乐透六等奖：1红球+2篮球或者2红球+1篮球或者3红球或者2篮球

        System.out.println("===== 大乐透购彩兑奖模拟系统 =====");
        Scanner sc = new Scanner(System.in);

        // 1. 生成官方中奖号码（仅生成一次）
        int[] winningRed = new int[5];
        int[] winningBlue = new int[2];
        generateLotteryNums(winningRed, winningBlue);
        Arrays.sort(winningRed);
        Arrays.sort(winningBlue);
        System.out.println("\n【官方中奖号码】");
        System.out.print("前区红球：");
        printNums(winningRed);
        System.out.print("后区蓝球：");
        printNums(winningBlue);

        // 2. 存储用户购买的所有彩票
        List<LotteryTicket> ticketList = new ArrayList<>();

        // 3. 循环购票：支持多张、机选/手动、追加
        boolean continueBuy = true;
        while (continueBuy) {
            System.out.println("\n===== 开始购买第" + (ticketList.size() + 1) + "张彩票 =====");

            // 3.1 选择购票方式：机选/手动
            System.out.println("请选择购票方式：");
            System.out.println("1 - 机选（系统随机生成）");
            System.out.println("2 - 手动选号（自己输入）");
            int buyType = sc.nextInt();
            while (buyType != 1 && buyType != 2) {
                System.out.println("输入错误！仅支持1（机选）或2（手动），请重新输入：");
                buyType = sc.nextInt();
            }

            // 3.2 生成/输入单张彩票号码
            int[] myRed = new int[5];
            int[] myBlue = new int[2];
            if (buyType == 1) {
                // 机选：复用生成号码的方法
                generateLotteryNums(myRed, myBlue);
                Arrays.sort(myRed);
                Arrays.sort(myBlue);
                System.out.println("\n【机选号码】");
                System.out.print("前区红球：");
                printNums(myRed);
                System.out.print("后区蓝球：");
                printNums(myBlue);
            } else {
                // 手动选号：复用原有输入方法
                inputRedBalls(sc, myRed);
                inputBlueBalls(sc, myBlue);
                Arrays.sort(myRed);
                Arrays.sort(myBlue);
                System.out.println("\n【手动选号结果】");
                System.out.print("前区红球：");
                printNums(myRed);
                System.out.print("后区蓝球：");
                printNums(myBlue);
            }

            // 3.3 选择是否追加
            System.out.println("\n是否选择追加（追加可提升奖金金额）？");
            System.out.println("1 - 追加");
            System.out.println("0 - 不追加");
            int addChoice = sc.nextInt();
            while (addChoice != 0 && addChoice != 1) {
                System.out.println("输入错误！仅支持1（追加）或0（不追加），请重新输入：");
                addChoice = sc.nextInt();
            }
            boolean isAdd = addChoice == 1;
            System.out.println("本次选择：" + (isAdd ? "追加" : "不追加"));

            // 3.4 保存当前彩票到列表
            ticketList.add(new LotteryTicket(myRed, myBlue, isAdd));

            // 3.5 询问是否继续购票
            System.out.println("\n是否继续购买下一张彩票？");
            System.out.println("1 - 继续");
            System.out.println("0 - 停止，开始兑奖");
            int continueChoice = sc.nextInt();
            while (continueChoice != 0 && continueChoice != 1) {
                System.out.println("输入错误！仅支持1（继续）或0（停止），请重新输入：");
                continueChoice = sc.nextInt();
            }
            continueBuy = continueChoice == 1;
        }

        // 4. 批量兑奖：遍历所有购买的彩票
        System.out.println("\n===== 开始批量兑奖 =====");
        System.out.println("你共购买了" + ticketList.size() + "张彩票，兑奖结果如下：");
        for (int i = 0; i < ticketList.size(); i++) {
            LotteryTicket ticket = ticketList.get(i);
            System.out.println("\n----- 第" + (i + 1) + "张彩票 -----");
            // 打印彩票信息
            System.out.print("号码：红球=");
            printNums(ticket.redBalls);
            System.out.print("      蓝球=");
            printNums(ticket.blueBalls);
            System.out.println("      追加状态：" + (ticket.isAdd ? "已追加" : "未追加"));

            // 统计命中数
            int hitRed = countHitNums(ticket.redBalls, winningRed);
            int hitBlue = countHitNums(ticket.blueBalls, winningBlue);
            System.out.println("命中：红球" + hitRed + "个，蓝球" + hitBlue + "个");

            // 判断奖项
            String prizeLevel = getPrizeLevel(hitRed, hitBlue);
            System.out.println("中奖等级：" + prizeLevel);
        }

        sc.close();
    }

    // 生成彩票号码：前区红球（1-35，5个不重复）、后区蓝球（1-12，2个不重复）
    public static void generateLotteryNums(int[] redBalls, int[] blueBalls) {
        Random random = new Random();

        // 生成前区红球（1-35，5个不重复）
        for (int i = 0; i < redBalls.length; i++) {
            int num = random.nextInt(35) + 1; // 1-35
            // 校验重复
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (redBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat) {
                i--; // 重复则重新生成当前位置
            } else {
                redBalls[i] = num;
            }
        }

        // 生成后区蓝球（1-12，2个不重复）
        for (int i = 0; i < blueBalls.length; i++) {
            int num = random.nextInt(12) + 1; // 1-12
            // 校验重复
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (blueBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat) {
                i--; // 重复则重新生成当前位置
            } else {
                blueBalls[i] = num;
            }
        }
    }

    // 用户输入前区红球（校验：5个、1-35、不重复）
    public static void inputRedBalls(Scanner sc, int[] redBalls) {
        System.out.println("请输入前区5个红球（1-35，不可重复），逐个输入：");
        for (int i = 0; i < redBalls.length; i++) {
            System.out.print("第" + (i + 1) + "个红球：");
            int num = sc.nextInt();
            // 校验范围
            while (num < 1 || num > 35) {
                System.out.println("红球必须在1-35之间！请重新输入第" + (i + 1) + "个红球：");
                num = sc.nextInt();
            }
            // 校验重复
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (redBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            while (isRepeat) {
                System.out.println("红球不可重复！你已输入过" + num + "，请重新输入第" + (i + 1) + "个红球：");
                num = sc.nextInt();
                // 重新校验范围+重复
                if (num >= 1 && num <= 35) {
                    isRepeat = false;
                    for (int j = 0; j < i; j++) {
                        if (redBalls[j] == num) {
                            isRepeat = true;
                            break;
                        }
                    }
                }
            }
            redBalls[i] = num;
        }
    }

    // 用户输入后区蓝球（校验：2个、1-12、不重复）
    public static void inputBlueBalls(Scanner sc, int[] blueBalls) {
        System.out.println("请输入后区2个蓝球（1-12，不可重复），逐个输入：");
        for (int i = 0; i < blueBalls.length; i++) {
            System.out.print("第" + (i + 1) + "个蓝球：");
            int num = sc.nextInt();
            // 校验范围
            while (num < 1 || num > 12) {
                System.out.println("蓝球必须在1-12之间！请重新输入第" + (i + 1) + "个蓝球：");
                num = sc.nextInt();
            }
            // 校验重复
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (blueBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            while (isRepeat) {
                System.out.println("蓝球不可重复！你已输入过" + num + "，请重新输入第" + (i + 1) + "个蓝球：");
                num = sc.nextInt();
                // 重新校验范围+重复
                if (num >= 1 && num <= 12) {
                    isRepeat = false;
                    for (int j = 0; j < i; j++) {
                        if (blueBalls[j] == num) {
                            isRepeat = true;
                            break;
                        }
                    }
                }
            }
            blueBalls[i] = num;
        }
    }

    // 统计命中数量：自选号码在中奖号码中的个数
    public static int countHitNums(int[] myNums, int[] winningNums) {
        int hitCount = 0;
        for (int myNum : myNums) {
            for (int winningNum : winningNums) {
                if (myNum == winningNum) {
                    hitCount++;
                    break; // 避免重复统计
                }
            }
        }
        return hitCount;
    }

    // 判断中奖等级（严格按注释里的奖项规则，从高到低判断）
    public static String getPrizeLevel(int hitRed, int hitBlue) {
        // 一等奖：5红球+2蓝球
        if (hitRed == 5 && hitBlue == 2) {
            return "一等奖（恭喜！5红+2蓝）";
        }
        // 二等奖：5红球+1蓝球
        else if (hitRed == 5 && hitBlue == 1) {
            return "二等奖（5红+1蓝）";
        }
        // 三等奖：4红球+2蓝球 或 5红球
        else if ((hitRed == 4 && hitBlue == 2) || (hitRed == 5 && hitBlue == 0)) {
            return "三等奖（4红+2蓝 或 5红）";
        }
        // 四等奖：3红球+2蓝球 或 4红球+1蓝球
        else if ((hitRed == 3 && hitBlue == 2) || (hitRed == 4 && hitBlue == 1)) {
            return "四等奖（3红+2蓝 或 4红+1蓝）";
        }
        // 五等奖：2红球+2蓝球 或 3红球+1蓝球 或 4红球
        else if ((hitRed == 2 && hitBlue == 2) || (hitRed == 3 && hitBlue == 1) || (hitRed == 4 && hitBlue == 0)) {
            return "五等奖（2红+2蓝 或 3红+1蓝 或 4红）";
        }
        // 六等奖：1红球+2蓝球 或 2红球+1蓝球 或 3红球 或 2蓝球
        else if ((hitRed == 1 && hitBlue == 2) || (hitRed == 2 && hitBlue == 1) || (hitRed == 3 && hitBlue == 0) || (hitRed >= 0 && hitBlue == 2)) {
            return "六等奖（1红+2蓝 或 2红+1蓝 或 3红 或 2蓝）";
        }
        // 未中奖
        else {
            return "未中奖（再接再厉！）";
        }
    }

    // 格式化打印号码（补0为两位，如1→01，符合彩票格式）
    public static void printNums(int[] nums) {
        for (int num : nums) {
            System.out.printf("%02d ", num);
        }
        System.out.println();
    }
}
