package com.day07;

import java.util.Scanner;

public class demo04 {
    // 键盘输入2个数组，可选择是否去重求并集，再计算并集的中间值
    // 偶数长度：中间两个数的平均值；奇数长度：中间一个数
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ========== 1. 输入第一个数组 ==========
        System.out.println("请输入第一个数组的长度（正整数）：");
        int length1 = sc.nextInt();
        // 校验长度（避免输入非正整数）
        while (length1 <= 0) {
            System.out.println("长度必须为正整数，请重新输入：");
            length1 = sc.nextInt();
        }
        int[] arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("请输入第一个数组的第" + (i + 1) + "个元素：");
            arr1[i] = sc.nextInt();
        }

        // ========== 2. 输入第二个数组 ==========
        System.out.println("请输入第二个数组的长度（正整数）：");
        int length2 = sc.nextInt();
        while (length2 <= 0) {
            System.out.println("长度必须为正整数，请重新输入：");
            length2 = sc.nextInt();
        }
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.println("请输入第二个数组的第" + (i + 1) + "个元素：");
            arr2[i] = sc.nextInt();
        }

        // ========== 新增：选择是否对并集去重 ==========
        System.out.println("\n请选择是否对并集去重：");
        System.out.println("1 - 去重（保留唯一元素）");
        System.out.println("0 - 不去重（保留所有重复元素）");
        int deduplicateChoice = sc.nextInt();
        // 校验输入合法性（仅允许1/0）
        while (deduplicateChoice != 0 && deduplicateChoice != 1) {
            System.out.println("输入错误！仅支持输入1（去重）或0（不去重），请重新输入：");
            deduplicateChoice = sc.nextInt();
        }
        boolean isDeduplicate = deduplicateChoice == 1; // 转换为布尔值

        // ========== 3. 求并集并计算中间值（传入是否去重的选择） ==========
        double middleValue = getUnionMiddleValue(arr1, arr2, isDeduplicate);
        // 输出结果
        System.out.println("\n===== 最终结果 =====");
        System.out.println("两个数组的并集" + (isDeduplicate ? "（去重）" : "（不去重）") + "中间值为：" + middleValue);

        sc.close(); // 关闭扫描器
    }

    // 核心方法：新增isDeduplicate参数，控制是否去重
    public static double getUnionMiddleValue(int[] arr1, int[] arr2, boolean isDeduplicate) {
        // ========== 步骤1：合并两个数组（先不考虑去重） ==========
        int[] mergeArr = new int[arr1.length + arr2.length];
        int index = 0;
        // 复制第一个数组
        for (int num : arr1) {
            mergeArr[index++] = num;
        }
        // 复制第二个数组
        for (int num : arr2) {
            mergeArr[index++] = num;
        }

        // ========== 步骤2：根据选择决定是否去重 ==========
        int[] unionArr;
        if (isDeduplicate) {
            unionArr = deduplicate(mergeArr); // 去重
        } else {
            unionArr = mergeArr; // 不去重，直接使用合并后的数组
        }

        // ========== 步骤3：对并集数组升序排序 ==========
        sortArray(unionArr);

        // ========== 步骤4：打印中间过程（标注是否去重） ==========
        System.out.println("\n两个数组的并集" + (isDeduplicate ? "（去重+排序后）" : "（不去重+排序后）") + "：");
        for (int num : unionArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ========== 步骤5：计算并集数组的中间值 ==========
        return calculateMiddleValue(unionArr);
    }

    // 工具方法：数组去重（返回无重复的新数组）
    public static int[] deduplicate(int[] arr) {
        // 第一步：统计不重复元素的个数
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat) {
                uniqueCount++;
            }
        }

        // 第二步：创建去重后的新数组
        int[] uniqueArr = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeat = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat) {
                uniqueArr[index++] = arr[i];
            }
        }
        return uniqueArr;
    }

    // 工具方法：数组升序排序（冒泡排序）
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 工具方法：计算数组的中间值（返回double，支持小数平均值）
    public static double calculateMiddleValue(int[] arr) {
        int len = arr.length;
        if (len == 0) { // 边界情况：并集为空（理论上不会出现）
            return 0.0;
        }
        // 奇数长度：返回中间一个数
        if (len % 2 != 0) {
            return arr[len / 2];
        } else {
            // 偶数长度：返回中间两个数的平均值（转double避免整数除法）
            int mid1 = arr[len / 2 - 1];
            int mid2 = arr[len / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}