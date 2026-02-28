package com.day11.demo10;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name, String work) {
        super(id, name, work);
    }

    // 重写工作方法：主讲核心课程
    @Override
    public void work() {
        System.out.println("讲师"+getName()+"id"+getId()+"正在主讲核心课程");
    }
}
