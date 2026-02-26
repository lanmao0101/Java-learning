package com.day11.demo05;

// 第三代手机：重写打电话为视频通话，新增玩游戏
class ThirdGenPhone extends SecondGenPhone {
    @Override
    public void call() {
        System.out.println("视频通话");
    }
    public void playGame() {
        System.out.println("玩游戏");
    }
}