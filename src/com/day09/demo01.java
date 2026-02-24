package com.day09;

/**
 * 整合this关键字所有核心用法的示例类
 * 包含：区分成员变量、调用构造器、返回当前对象、传递当前对象、静态方法禁用this
 */
public class demo01 {
    // 成员变量（实例变量）
    private String name;
    private int age;
    private String gender;

    // 1. 场景1：this区分成员变量和局部变量（构造器中）
    // 无参构造器
    public demo01() {
        // 2. 场景2：this(参数)调用同类其他构造器（必须是构造器第一行）
        this("默认名称", 0, "未知"); // 调用3参数构造器，给默认值
        System.out.println("无参构造器执行，this指向：" + this);
    }

    // 单参数构造器
    public demo01(String name) {
        this(name, 18, "未知"); // 调用3参数构造器，年龄默认18
        System.out.println("单参数构造器执行，this指向：" + this);
    }

    // 三参数构造器（核心构造器）
    public demo01(String name, int age, String gender) {
        // this.name = 成员变量；name = 构造器参数（局部变量）
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("三参数构造器执行，this指向：" + this);
    }

    // 3. 场景3：this作为返回值（实现链式调用）
    public demo01 setName(String name) {
        this.name = name; // 再次使用this区分成员变量和局部变量
        return this; // 返回当前对象本身
    }

    public demo01 setAge(int age) {
        this.age = age;
        return this;
    }

    public demo01 setGender(String gender) {
        this.gender = gender;
        return this;
    }

    // 4. 场景4：this作为参数传递给其他方法
    public void showInfo() {
        // 把当前对象（this）传给工具方法printDetail
        printDetail(this);
    }

    // 工具方法：接收demo01对象，打印详情
    private void printDetail(demo01 demo) {
        System.out.println("===== 对象详情 =====");
        System.out.println("对象地址：" + demo); // 打印对象地址，和this指向一致
        System.out.println("姓名：" + this.name); // 这里this和demo指向同一个对象
        System.out.println("年龄：" + demo.age);
        System.out.println("性别：" + demo.gender);
        System.out.println("===================");
    }

    // 静态方法：演示this不能在静态上下文使用
    public static void staticMethod() {
        // 下面这行代码会编译报错！因为静态方法属于类，没有"当前对象"
        // System.out.println(this.name); 
        System.out.println("静态方法中不能使用this关键字");
    }

    // 主方法：测试所有用法
    public static void main(String[] args) {
        // 测试1：无参构造器（内部调用3参数构造器）
        demo01 demo1 = new demo01();
        demo1.showInfo();

        // 测试2：链式调用（利用this返回当前对象）
        demo01 demo2 = new demo01("张三")
                .setAge(22)
                .setGender("男");
        demo2.showInfo();

        // 测试3：静态方法调用
        demo01.staticMethod();
    }
}