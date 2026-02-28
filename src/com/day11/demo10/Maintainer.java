package com.day11.demo10;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name, String work) {
        super(id, name, work);
    }
    //重写工作方法：维护教学设备
    @Override
    public void work() {
        System.out.println("维护专员"+getName()+"id"+getId()+"正在维护教学设备...");
    }
}
