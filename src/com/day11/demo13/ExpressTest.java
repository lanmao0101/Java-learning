package com.day11.demo13;

public class ExpressTest {
    public static void main(String[] args) {
        // 基础快递：重量2kg
        Express base = new Express("ORD001", 2, "张三");
        System.out.println("基础快递单号" + base.getOrderId() + "运费：" + base.calculateFee() + "元");

        // 同城速递：重量2kg
        LocalExpress local = new LocalExpress("LOC001", 2, "李四");
        System.out.println("同城速递单号" + local.getOrderId() + "运费：" + local.calculateFee() + "元");

        // 异地空运：重量2kg
        AirExpress air = new AirExpress("AIR001", 2, "王五");
        System.out.println("异地空运单号" + air.getOrderId() + "运费：" + air.calculateFee() + "元");
    }
}
