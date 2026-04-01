package com.day11.demo25;

// 仅保留核心业务逻辑，不包含测试代码
public class Outer {
    private String outerField = "外部类成员变量";

    // 提供 PrivateInner 实例的方法
    public PrivateInner getPrivateInnerInstance() {
        return new PrivateInner(this);
    }

    // 给拆分后的 PrivateInner 提供访问私有成员的入口
    public String getOuterField() {
        return outerField;
    }
}
