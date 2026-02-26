package com.day04;

public class demo06 {
    static void main(String[] args) {
        // 随机生成一个有序（先排序）且一定包含重复元素的数组
        int[] scores = new int[10];
        // 关键修改：将随机数范围从1-100改为1-8（数组长度10，范围8 < 10，必然有重复）
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int)(Math.random() * 8 + 1); // 取值范围：1-8
        }

        // 可选：先对数组排序，让重复元素更直观（和你注释里的“有序数组”对应）
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }

        // 打印原始数组（包含重复元素）
        System.out.println("随机生成的有序数组（含重复）：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }

        // 数组去重逻辑（保留你的原有逻辑，仅补充注释）
        int[] newScores = new int[scores.length]; // 临时存储去重后的元素
        int index = 0; // 记录去重数组的有效元素下标
        for (int i = 0; i < scores.length; i++) {
            boolean isRepeat = false; // 标记当前元素是否重复
            // 检查当前元素是否已经在去重数组中
            for (int j = 0; j < index; j++) {
                if (scores[i] == newScores[j]) {
                    isRepeat = true; // 找到重复，标记为true
                    break; // 无需继续检查，跳出内层循环
                }
            }
            // 如果不重复，就加入去重数组
            if (!isRepeat) {
                newScores[index] = scores[i];
                index++;
            }
        }

        // 打印去重后的数组（只打印有效元素，不打印默认值0）
        System.out.println("\n去重后的数组：");
        for (int i = 0; i < index; i++) {
            System.out.print(newScores[i] + "\t");
        }
    }
}