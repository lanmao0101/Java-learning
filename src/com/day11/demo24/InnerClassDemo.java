package com.day11.demo24;

// 外部类
class Phone {
    // 外部类私有成员
    private String brand = "华为";

    // 成员内部类（代表手机的“电池”，和手机强关联）
    class Battery {
        // 内部类方法：直接访问外部类私有成员
        public void showInfo() {
            System.out.println("电池归属：" + brand);
        }
    }

    // 外部类方法：创建并使用内部类
    public void useBattery() {
        Battery battery = new Battery();
        battery.showInfo();
    }
}

// 测试调用
public class InnerClassDemo {
    public static void main(String[] args) {
        // 方式1：先创建外部类对象，再创建内部类对象（核心语法）
        Phone phone = new Phone();
        Phone.Battery battery = phone.new Battery();
        battery.showInfo(); // 输出：电池归属：华为

        // 方式2：通过外部类方法间接使用（更封装）
        phone.useBattery();
    }
}
