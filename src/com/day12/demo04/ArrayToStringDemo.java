package com.day12.demo04;

public class ArrayToStringDemo {
    /**
     * 将int数组按指定格式拼接成字符串
     * @param arr 待处理的int数组
     * @return 拼接后的字符串，格式为 [元素1, 元素2, 元素3...]
     */
    public static String arrayToString(int[] arr) {
        // 1. 边界处理：数组为空或长度为0时，直接返回空格式
        if (arr == null || arr.length == 0) {
            return "[]";
        }

        // 2. 使用StringBuilder高效拼接（避免String频繁创建对象）
        StringBuilder sb = new StringBuilder();
        sb.append("["); // 拼接开头的[

        // 3. 遍历数组，拼接元素和分隔符
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                // 最后一个元素：只拼数字，不拼逗号
                sb.append(arr[i]);
            } else {
                // 非最后一个元素：拼数字 + ", "
                sb.append(arr[i]).append(", ");
            }
        }

        sb.append("]"); // 拼接结尾的]
        return sb.toString();
    }

    public static void main(String[] args) {
        // 测试用例1：题目示例
        int[] arr = {1, 2, 3};
        String result = arrayToString(arr);
        System.out.println(result); // 输出：[1, 2, 3]

        // 测试用例2：空数组
        int[] arr2 = {};
        System.out.println(arrayToString(arr2)); // 输出：[]

        // 测试用例3：单元素数组
        int[] arr3 = {10};
        System.out.println(arrayToString(arr3)); // 输出：[10]

        // 测试用例4：多元素数组
        int[] arr4 = {10, 20, 30, 40, 50};
        System.out.println(arrayToString(arr4)); // 输出：[10, 20, 30, 40, 50]
    }
}
