package com.day07;

public class demo06 {
    static void main() {
        // 测试 Math.random() * 100 + 1 的范围
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        // 循环100万次，验证极值
        for (int i = 0; i < 1000000; i++) {
            double num = Math.random() * 100 + 1;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("最小值（接近1.0，不会小于1.0）：" + min);
        System.out.println("最大值（接近101.0，永远取不到101.0）：" + max);
    }
}
