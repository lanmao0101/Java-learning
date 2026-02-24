package com.day10.demo02;

// 数组工具类，用final修饰，防止被继承
public final class ArrayUtils {
    // 私有构造方法，防止实例化工具类
    private ArrayUtils() {}

    /**
     * 遍历并打印整数数组，格式为 [10, 20, 50, 34, 100]
     * @param arr 要遍历的整数数组
     */
    public static void printArr(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        // 使用StringBuilder拼接字符串，提高效率
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            // 最后一个元素后面不加逗号
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

    /**
     * 计算整数数组的平均值
     * @param arr 要计算的整数数组
     * @return 数组元素的平均值
     * @throws IllegalArgumentException 如果数组为null或长度为0
     */
    public static double getAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空或长度为0");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        // 强制转换为double，避免整数除法导致结果丢失精度
        return (double) sum / arr.length;
    }
}