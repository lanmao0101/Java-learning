package com.day11.demo16;

// 人类：能使用任意交通工具（通过多态参数实现）
public class Person {
    // 人的属性：名字、年龄、性别
    private String name;
    private int age;
    private String sex;
    public Person() {
    }
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    // 核心方法：使用交通工具（多态参数：接收所有交通工具子类）
    public void travel(Vehicle vehicle) {
        System.out.println(getName() + "正在使用" + vehicle.getBrand() + "进行旅行");
        vehicle.move();
        // 强制类型转换：调用子类特有行为（鸣铃/鸣笛）
        if (vehicle instanceof Car) {
            ((Car) vehicle).alarm();
        }
        if (vehicle instanceof Bicycle) {
            ((Bicycle) vehicle).ringBell();
        }
        System.out.println("到达目的地");
    }
}
