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
    static void main(String[] args) {
        // 大乐透规则注释（保留不变）
        System.out.println("===== 大乐透购彩兑奖模拟系统 =====");
        Scanner sc = new Scanner(System.in);

        // 1. 生成官方中奖号码（仅生成一次）
        int[] winningRed = new int[5];
        int[] winningBlue = new int[2];
        generateLotteryNums(winningRed, winningBlue);
        Arrays.sort(winningRed);
        Arrays.sort(winningBlue);
        // 优化：中奖号码横向紧凑显示
        System.out.println("\n【官方中奖号码】 红球：" + getNumStr(winningRed) + " | 蓝球：" + getNumStr(winningBlue));

        // 2. 存储用户购买的所有彩票
        List<LotteryTicket> ticketList = new ArrayList<>();

        // 3. 循环购票（逻辑不变，仅优化交互提示）
        boolean continueBuy = true;
        while (continueBuy) {
            System.out.println("\n===== 购买第" + (ticketList.size() + 1) + "张彩票 =====");
            System.out.println("1-机选  2-手动选号");
            int buyType = sc.nextInt();
            while (buyType != 1 && buyType != 2) {
                System.out.println("仅支持1/2，请重新输入：");
                buyType = sc.nextInt();
            }

            int[] myRed = new int[5];
            int[] myBlue = new int[2];
            if (buyType == 1) {
                generateLotteryNums(myRed, myBlue);
                Arrays.sort(myRed);
                Arrays.sort(myBlue);
                System.out.println("机选号码：红球=" + getNumStr(myRed) + " | 蓝球=" + getNumStr(myBlue));
            } else {
                inputRedBalls(sc, myRed);
                inputBlueBalls(sc, myBlue);
                Arrays.sort(myRed);
                Arrays.sort(myBlue);
                System.out.println("手动选号：红球=" + getNumStr(myRed) + " | 蓝球=" + getNumStr(myBlue));
            }

            // 选择追加
            System.out.println("\n是否追加？1-追加  0-不追加");
            int addChoice = sc.nextInt();
            while (addChoice != 0 && addChoice != 1) {
                System.out.println("仅支持1/0，请重新输入：");
                addChoice = sc.nextInt();
            }
            boolean isAdd = addChoice == 1;
            System.out.println("追加状态：" + (isAdd ? "已追加" : "未追加"));

            // 保存彩票
            ticketList.add(new LotteryTicket(myRed, myBlue, isAdd));

            // 询问继续
            System.out.println("\n是否继续购票？1-继续  0-停止兑奖");
            int continueChoice = sc.nextInt();
            while (continueChoice != 0 && continueChoice != 1) {
                System.out.println("仅支持1/0，请重新输入：");
                continueChoice = sc.nextInt();
            }
            continueBuy = continueChoice == 1;
        }

        // 4. 批量兑奖：核心优化——横向紧凑显示每张彩票结果
        System.out.println("\n==================================== 兑奖结果 ====================================");
        // 打印表头（横向）
        System.out.printf("%-6s | %-20s | %-10s | %-15s | %-20s%n",
                "序号", "号码（红|蓝）", "追加状态", "命中（红/蓝）", "中奖等级");
        System.out.println("----------------------------------------------------------------------------------");
        // 遍历彩票，横向打印每一行
        for (int i = 0; i < ticketList.size(); i++) {
            LotteryTicket ticket = ticketList.get(i);
            // 统计命中数
            int hitRed = countHitNums(ticket.redBalls, winningRed);
            int hitBlue = countHitNums(ticket.blueBalls, winningBlue);
            // 拼接号码字符串（横向）
            String numStr = getNumStr(ticket.redBalls) + " | " + getNumStr(ticket.blueBalls);
            // 拼接追加状态
            String addStr = ticket.isAdd ? "已追加" : "未追加";
            // 拼接命中数
            String hitStr = hitRed + "个 / " + hitBlue + "个";
            // 中奖等级
            String prize = getPrizeLevel(hitRed, hitBlue);
            // 格式化横向打印（对齐）
            System.out.printf("%-6d | %-20s | %-10s | %-15s | %-20s%n",
                    (i+1), numStr, addStr, hitStr, prize);
        }
        System.out.println("==================================================================================");

        sc.close();
    }

    // 新增：将号码数组转为紧凑字符串（如03 08 15 27 32），无多余换行
    public static String getNumStr(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(String.format("%02d ", num));
        }
        // 去掉最后一个空格，避免多余字符
        return sb.toString().trim();
    }

    // 生成彩票号码（逻辑不变）
    public static void generateLotteryNums(int[] redBalls, int[] blueBalls) {
        Random random = new Random();
        // 红球
        for (int i = 0; i < redBalls.length; i++) {
            int num = random.nextInt(35) + 1;
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (redBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat) {
                i--;
            } else {
                redBalls[i] = num;
            }
        }
        // 蓝球
        for (int i = 0; i < blueBalls.length; i++) {
            int num = random.nextInt(12) + 1;
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (blueBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat) {
                i--;
            } else {
                blueBalls[i] = num;
            }
        }
    }

    // 输入红球（逻辑不变，仅精简提示）
    public static void inputRedBalls(Scanner sc, int[] redBalls) {
        System.out.println("输入5个红球（1-35，不重复），逐个输入：");
        for (int i = 0; i < redBalls.length; i++) {
            System.out.print("第" + (i+1) + "个：");
            int num = sc.nextInt();
            while (num < 1 || num > 35) {
                System.out.println("红球需1-35，请重新输入：");
                num = sc.nextInt();
            }
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (redBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            while (isRepeat) {
                System.out.println("号码重复，请重新输入：");
                num = sc.nextInt();
                if (num >=1 && num <=35) {
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

    // 输入蓝球（逻辑不变，仅精简提示）
    public static void inputBlueBalls(Scanner sc, int[] blueBalls) {
        System.out.println("输入2个蓝球（1-12，不重复），逐个输入：");
        for (int i = 0; i < blueBalls.length; i++) {
            System.out.print("第" + (i+1) + "个：");
            int num = sc.nextInt();
            while (num < 1 || num > 12) {
                System.out.println("蓝球需1-12，请重新输入：");
                num = sc.nextInt();
            }
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (blueBalls[j] == num) {
                    isRepeat = true;
                    break;
                }
            }
            while (isRepeat) {
                System.out.println("号码重复，请重新输入：");
                num = sc.nextInt();
                if (num >=1 && num <=12) {
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

    // 统计命中数（逻辑不变）
    public static int countHitNums(int[] myNums, int[] winningNums) {
        int hitCount = 0;
        for (int myNum : myNums) {
            for (int winningNum : winningNums) {
                if (myNum == winningNum) {
                    hitCount++;
                    break;
                }
            }
        }
        return hitCount;
    }

    // 判断中奖等级（逻辑不变）
    public static String getPrizeLevel(int hitRed, int hitBlue) {
        if (hitRed == 5 && hitBlue == 2) {
            return "一等奖（5红+2蓝）";
        } else if (hitRed == 5 && hitBlue == 1) {
            return "二等奖（5红+1蓝）";
        } else if ((hitRed == 4 && hitBlue == 2) || (hitRed == 5 && hitBlue == 0)) {
            return "三等奖（4红+2蓝/5红）";
        } else if ((hitRed == 3 && hitBlue == 2) || (hitRed == 4 && hitBlue == 1)) {
            return "四等奖（3红+2蓝/4红+1蓝）";
        } else if ((hitRed == 2 && hitBlue == 2) || (hitRed == 3 && hitBlue == 1) || (hitRed == 4 && hitBlue == 0)) {
            return "五等奖（2红+2蓝等）";
        } else if ((hitRed == 1 && hitBlue == 2) || (hitRed == 2 && hitBlue == 1) || (hitRed == 3 && hitBlue == 0) || (hitRed >= 0 && hitBlue == 2)) {
            return "六等奖（1红+2蓝等）";
        } else {
            return "未中奖";
        }
    }
}