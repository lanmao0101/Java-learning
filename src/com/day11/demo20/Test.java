package com.day11.demo20;

public class Test {
    public static void main(String[] args) {

        // 1. 乒乓球运动员（继承 + 实现接口）
        Person tableTennisAthlete = new TableTennisAthlete("张三", 20);
        tableTennisAthlete.work();
        ((TableTennisAthlete)tableTennisAthlete).speakEnglish();
        System.out.println("------------------");

        // 2. 篮球运动员（仅继承）
        Person basketballAthlete = new BasketballAthlete("李四", 22);
        basketballAthlete.work();
        System.out.println("------------------");

        // 3. 乒乓球教练（继承 + 实现接口）
        Person tableTennisCoach = new TableTennisCoach("王五", 30);
        tableTennisCoach.work();
        ((TableTennisCoach)tableTennisCoach).speakEnglish();
        ((TableTennisCoach) tableTennisCoach).speakEnglish();
        System.out.println("------------------");

        // 4. 篮球教练（仅继承）
        Person basketballCoach = new BasketballCoach("赵六", 40);
        basketballCoach.work();
        System.out.println("------------------");
    }
}
