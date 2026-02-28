package com.day11.demo11;

public class DishTest {
    public static void main(String[] args) {
        // 创建热菜对象
        HotDish boiledFish = new HotDish("水煮鱼", 88, "麻辣", 20);
        boiledFish.show();

        // 创建凉菜对象
        ColdDish cucumber = new ColdDish("拍黄瓜", 10, "酸辣", 30);
        cucumber.show();
    }
}
