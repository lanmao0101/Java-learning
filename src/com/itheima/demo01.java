package com.itheima;

import java.text.DecimalFormat;
/**
 * 需求：
 *      生成一个随机的体温，并判断是否>=38
 */
public class demo01 {
    //定义一个变量表示人的体温，对体温进行判断是否大于等于38度，如果超过打印语音警告
    public static void main(String[] args) {
        // 1. 生成35~42之间的随机体温（更符合人体实际体温范围，原代码是35~45，偏高）
        double rawTemperature = Math.random() * 7 + 35;

        // 2. 格式化体温为两位小数（核心修改点）
        DecimalFormat df = new DecimalFormat("#.00");
        String temperatureStr = df.format(rawTemperature);
        // 转回double类型，方便后续判断（也可以直接用字符串转数字）
        double temperature = Double.parseDouble(temperatureStr);

        // 3. 打印格式化后的体温
        System.out.println("人的体温是：" + temperature);

        // 4. 判断是否≥38度，打印警告
        if (temperature >= 38) {
            System.out.println("请马上离开！");
        }
    }
}