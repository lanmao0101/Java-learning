package com.day10.demo06;

// 定义一个枚举类 Season
public enum Season {
    // 1. 枚举类的第一行必须是枚举项，用逗号分隔，以分号结尾
    // 2. 每一个枚举项，都是该枚举类的对象
    // 3. 枚举项在底层是常量，默认用 public static final 修饰
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地");

    // 成员变量
    private final String name;
    private final String desc;

    // 4. 枚举类的构造方法必须是 private 修饰，不让外界创建本类的对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // 普通成员方法
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
