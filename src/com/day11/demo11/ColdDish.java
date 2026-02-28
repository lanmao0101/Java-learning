package com.day11.demo11;

public class ColdDish extends Dish{
    // 新增属性：保质期
    private int expire;

    public ColdDish(int expire) {
    }

    public ColdDish(String name, double price, String taste, int expire) {
        super(name, price, taste);
        this.expire = expire;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    //重写菜品介绍方法
    @Override
    public void show() {
        System.out.println("名称：" + getName() + " 价格：" + getPrice() + " 口味：" + getTaste() + " 保质期：" + expire);
    }
}
