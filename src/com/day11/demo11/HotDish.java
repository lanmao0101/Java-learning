package com.day11.demo11;

public class HotDish extends Dish{
    // 新增属性：烹饪时间
    private int time;
    public HotDish() {
    }

    public HotDish(String name, double price, String taste, int time) {
        super(name, price, taste);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    // 重写菜品介绍方法
    @Override
    public void show() {
        System.out.println("菜品：" + getName() + " 价格：" + getPrice() + " 口味：" + getTaste() + " 烹饪时间：" + time);
    }
}
