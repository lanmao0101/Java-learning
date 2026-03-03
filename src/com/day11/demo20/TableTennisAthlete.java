package com.day11.demo20;

public class TableTennisAthlete extends Athlete implements SpeakEnglish{
    public TableTennisAthlete() {
    }

    public TableTennisAthlete(String name, int age) {
        super(name, age);
    }

    // 重写学习方法：学打乒乓球
    @Override
    public void learn() {
        System.out.println(getName() + "（" + getAge() + "岁）在学打乒乓球");
    }

    // 实现接口方法：说英语
    @Override
    public void speakEnglish() {
        System.out.println(getName() + "在说英语，为了出国交流");
    }
}
