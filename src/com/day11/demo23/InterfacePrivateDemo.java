package com.day11.demo23;

// Java 9+ 支持接口私有方法
// static可以通过接口.方法调用。default可以通过实现类对象调用
interface MyInterface {
    // 1. default 方法：对外提供的默认实现
    default void pay(String orderId, double amount) {
        // 调用接口私有方法（封装通用逻辑）
        validateAmount(amount); // 校验金额
        logPayment(orderId);    // 打印日志
        System.out.println("执行支付：" + orderId + "，金额：" + amount);
    }

    // 2. static 方法：对外提供的工具方法
    static String generateOrderId() {
        // 调用静态私有方法（封装通用逻辑）
        return "ORDER_" + getTimestamp();
    }

    // 3. 私有实例方法：仅接口内部 default 方法可调用
    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("金额必须大于0");
        }
    }

    // 4. 私有实例方法：仅接口内部 default 方法可调用
    private void logPayment(String orderId) {
        System.out.println("支付日志：" + orderId + "，时间：" + System.currentTimeMillis());
    }

    // 5. 私有静态方法：仅接口内部 static 方法可调用
    private static long getTimestamp() {
        return System.currentTimeMillis();
    }
}

// 实现类：只能用接口的 default/static 方法，完全感知不到 private 方法
class Alipay implements MyInterface {
    // 无需重写任何 private 方法（也看不到）
}

// 测试
public class InterfacePrivateDemo {
    public static void main(String[] args) {
        MyInterface alipay = new Alipay();
        // 调用 default 方法（内部会自动调用私有方法）
        alipay.pay("ORDER_123", 99.9);

        // 调用 static 方法（内部会自动调用私有静态方法）
        String newOrderId = MyInterface.generateOrderId();
        System.out.println("生成新订单号：" + newOrderId);

        // 注意：实现类/外部无法调用接口私有方法（完全不可见）
        // 以下代码会编译错误：
        // alipay.validateAmount(100);
        // MyInterface.getTimestamp();
    }
}
