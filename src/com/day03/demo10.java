package com.day03;

public class demo10 {
    static void main(String[] args) {
        // ====== 你原本的基础示例（保留不变） ======
        System.out.println("----- 基础示例：for循环中的break -----");
        //学习break关键字，跳出循环（修正了你原代码的beak拼写错误）
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        // 输出：1 2

        System.out.println("------------------------");
        System.out.println("----- 基础示例：for循环中的continue -----");
        //continue关键字，跳过当前循环，继续下一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        // 输出：1 2 4 5

        // ====== 补充的更多实例（类名保持demo10） ======
        System.out.println("\n================ 补充实例 ================");

        // ----- 1. break 在 while 循环中使用 -----
        System.out.println("\n----- 1. break + while 无限循环 -----");
        // 需求：从1开始累加，直到和大于20时停止循环
        int sum = 0;
        int num = 1;
        while (true) { // 无限循环，靠break终止
            sum += num;
            if (sum > 20) {
                break; // 满足条件，跳出整个while循环
            }
            num++;
        }
        System.out.println("累加和>20时停止，num=" + num + "，sum=" + sum); // num=7，sum=28

        // ----- 2. break 在嵌套循环中使用 -----
        System.out.println("\n----- 2. break + 嵌套循环（只跳出内层） -----");
        for (int i = 1; i <= 2; i++) { // 外层行
            for (int j = 1; j <= 3; j++) { // 内层列
                if (i == 2 && j == 2) {
                    break; // 仅终止内层循环
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        // ----- 3. continue 在 while 循环中使用 -----
        System.out.println("\n----- 3. continue + while（打印1-10奇数） -----");
        int n = 0;
        while (n < 10) {
            n++;
            if (n % 2 == 0) {
                continue; // 跳过偶数，直接下一次循环
            }
            System.out.print(n + " ");
        }

        // ----- 4. continue 在嵌套循环中使用 -----
        System.out.println("\n\n----- 4. continue + 嵌套循环（跳过每行第2列） -----");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (col == 2) {
                    continue; // 跳过当前列，内层循环继续
                }
                System.out.print("行" + row + "列" + col + " ");
            }
            System.out.println();
        }
    }
}