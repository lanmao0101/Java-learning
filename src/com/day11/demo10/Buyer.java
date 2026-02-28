package com.day11.demo10;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name, String work) {
        super(id, name, work);
    }
    //重写工作方法：采购教学物资
    @Override
    public void work() {
        System.out.println("采购专员"+getName()+"id"+getId()+"正在采购教学物资...");
    }
}
