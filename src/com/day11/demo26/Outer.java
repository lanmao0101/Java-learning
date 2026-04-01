package com.day11.demo26;

public class Outer {
    private int a = 10;

    // 成员内部类
    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            // 输出局部变量 30
            System.out.println(a);
            // 输出内部类的成员变量 20
            System.out.println(this.a);
            // 输出外部类的成员变量 10
            System.out.println(Outer.this.a);
        }
    }
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
