package com.day11.demo20;

public class TableTennisCoach extends Coach implements SpeakEnglish{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    // 重写教学方法：教打乒乓球
    @Override
    public void teach() {
        System.out.println(getName() + "（" + getAge() + "岁）在教打乒乓球");
    }

    // 实现接口方法：说英语
    @Override
    public void speakEnglish() {
        System.out.println(getName() + "在说英语，为了出国交流");
    }
}
