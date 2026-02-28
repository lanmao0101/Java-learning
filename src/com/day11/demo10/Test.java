package com.day11.demo10;

public class Test {
    public static void main(String[] args) {
        // 讲师
        Lecturer lecturer = new Lecturer("T001", "张老师", "授课");
        lecturer.work();

        // 助教
        Tutor tutor = new Tutor("T002", "李助教", "辅导");
        tutor.work();

        // 维护专员
        Maintainer maintainer = new Maintainer("A001", "王专员", "设备维护");
        maintainer.work();

        // 采购专员
        Buyer buyer = new Buyer("A002", "赵专员", "物资采购");
        buyer.work();
    }
}
