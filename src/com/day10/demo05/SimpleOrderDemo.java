package com.day10.demo05;

// 第一步：定义订单状态枚举（核心）
enum OrderStatus {
    // 直接定义所有订单状态常量
    PENDING_PAYMENT("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    DELIVERING("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");
    private String name;
    OrderStatus(String name) {
        this.name = name;
    }
    private OrderStatus() {
        System.out.println("执行此行"+ this.name);
    }
    public String getName() {
        return name;
    }
}

// 第二步：测试枚举的使用
public class SimpleOrderDemo {
    public static void main(String[] args) {
        // 1. 直接使用枚举常量表示订单状态
        OrderStatus currentStatus = OrderStatus.PENDING_PAYMENT;
        System.out.println("当前订单状态：" + currentStatus.getName());

        // 2. 修改订单状态
        currentStatus = OrderStatus.SHIPPED;
        System.out.println("修改后的订单状态：" + currentStatus.getName());

        // 3. 遍历所有订单状态（了解有哪些可选值）
        System.out.println("\n所有可选的订单状态：");
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println("- " + status);
        }
    }
}
