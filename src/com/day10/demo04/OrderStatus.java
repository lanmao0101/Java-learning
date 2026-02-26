package com.day10.demo04;

/**
 * 订单状态枚举类：封装所有合法订单状态及中文描述
 */
public enum OrderStatus {
    // 定义所有订单状态枚举常量
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");

    // 订单状态的中文描述
    private final String description;

    // 枚举构造方法（必须私有）
    private OrderStatus(String description) {
        this.description = description;
    }

    // 获取中文描述
    public String getDescription() {
        return description;
    }
}

/**
 * 订单业务类：包含订单属性、状态修改、状态流转校验
 */
class Order {
    // 订单核心属性
    private String orderId;        // 订单编号
    private String productName;    // 商品名称
    private final double amount;         // 订单金额
    private OrderStatus status;    // 订单状态（枚举类型）

    // 构造方法：初始化订单，默认状态为“待支付”
    public Order(String orderId, String productName, double amount) {
        this.orderId = orderId;
        this.productName = productName;
        this.amount = amount;
        this.status = OrderStatus.PAYMENT_PENDING; // 初始状态固定为待支付
    }

    /**
     * 修改订单状态（包含合法性校验）
     * @param newStatus 新状态
     * @return 是否修改成功
     */
    public boolean changeStatus(OrderStatus newStatus) {
        // 状态流转合法性校验
        if (!isStatusTransitionValid(newStatus)) {
            System.out.println("❌ 状态流转失败：当前状态【" + status.getDescription() + "】无法切换为【" + newStatus.getDescription() + "】");
            return false;
        }

        // 合法流转：更新状态
        this.status = newStatus;
        System.out.println("✅ 状态更新成功：" + getOrderInfo());
        return true;
    }

    /**
     * 校验状态流转是否合法（核心规则）
     * 例如：已取消/已送达的订单不能再修改状态；待支付订单可取消/转处理中；处理中可转已发货等
     */
    private boolean isStatusTransitionValid(OrderStatus newStatus) {
        switch (this.status) {
            case PAYMENT_PENDING:
                // 待支付 → 处理中/已取消 合法
                return newStatus == OrderStatus.PROCESSING || newStatus == OrderStatus.CANCELLED;
            case PROCESSING:
                // 处理中 → 已发货/已取消 合法
                return newStatus == OrderStatus.SHIPPED || newStatus == OrderStatus.CANCELLED;
            case SHIPPED:
                // 已发货 → 配送中 合法
                return newStatus == OrderStatus.OUT_FOR_DELIVERY;
            case OUT_FOR_DELIVERY:
                // 配送中 → 已送达 合法
                return newStatus == OrderStatus.DELIVERED;
            case DELIVERED:
            case CANCELLED:
                // 已送达/已取消 是终态，不能修改状态
                return false;
            default:
                return false;
        }
    }

    /**
     * 获取订单完整信息
     */
    public String getOrderInfo() {
        return String.format("订单编号：%s | 商品：%s | 金额：%.2f | 当前状态：%s",
                orderId, productName, amount, status.getDescription());
    }

    // Getter方法（按需提供）
    public OrderStatus getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }
}

/**
 * 测试类：演示订单状态的完整流转
 */
class OrderStatusDemo {
    static void main(String[] args) {
        // 1. 创建订单（初始状态：待支付）
        Order order = new Order("ORD20260224001", "Java编程思想（第4版）", 89.00);
        System.out.println("📌 订单创建成功：" + order.getOrderInfo());

        // 2. 合法流转：待支付 → 处理中
        order.changeStatus(OrderStatus.PROCESSING);

        // 3. 合法流转：处理中 → 已发货
        order.changeStatus(OrderStatus.SHIPPED);

        // 4. 合法流转：已发货 → 配送中
        order.changeStatus(OrderStatus.OUT_FOR_DELIVERY);

        // 5. 合法流转：配送中 → 已送达
        order.changeStatus(OrderStatus.DELIVERED);

        // 6. 非法流转：已送达 → 取消（终态不能修改）
        order.changeStatus(OrderStatus.CANCELLED);

        // 7. 创建新订单，测试“待支付→取消”的合法流转
        Order order2 = new Order("ORD20260224002", "IntelliJ IDEA激活码", 199.00);
        System.out.println("\n📌 新订单创建成功：" + order2.getOrderInfo());
        order2.changeStatus(OrderStatus.CANCELLED);

        // 8. 非法流转：已取消 → 处理中
        order2.changeStatus(OrderStatus.PROCESSING);
    }
}