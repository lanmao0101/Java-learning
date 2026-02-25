package com.day10.demo06;

// 测试类
public class EnumDemo {
    public static void main(String[] args) {
        // 使用枚举项
        Season spring = Season.SPRING;
        System.out.println(spring.getName() + "：" + spring.getDesc());

        // 5. 编译器会给枚举类新增两个默认存在的方法：values() 和 valueOf()
        // values()：返回该枚举类的所有枚举项数组
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s.getName() + "：" + s.getDesc());
        }

        // valueOf()：根据枚举项的字符串名称，返回对应的枚举对象
        Season summer = Season.valueOf("SUMMER");
        System.out.println("通过valueOf获取：" + summer.getName());
    }
}
