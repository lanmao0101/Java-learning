package com.day11.demo10;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String work) {
        super(id, name, work);
    }

    // 重写工作方法：辅导学员答疑
    @Override
    public void work() {
        System.out.println("助教"+getName()+"id"+getId()+"正在辅导学员答疑...");
    }
}
