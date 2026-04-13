package com.day11.demo28;

public class Company {
    // 1. 外部类的成员（private 也能被内部类直接访问）
    private String companyName = "字节跳动";
    private double baseSalary = 8000; // 员工底薪

    // 2. 外部类的方法：发工资（在这个方法里定义局部内部类）
    public void paySalary(String employeeName, int workDays) {
        // 方法内的局部变量（Java 8+ 只要不修改，就是 effectively final，可被内部类访问）
        double dailyBonus = 200; // 每日全勤奖金
        double taxRate = 0.1;    // 税率10%

        // ==============================================
        // 👇 【局部内部类】：定义在 paySalary() 方法内部
        // ==============================================
        class SalaryCalculator {
            // 内部类的方法：计算最终工资
            public double calculateFinalSalary() {
                // ✅ 规则3：直接访问外部类的成员（哪怕是private）
                System.out.println("公司：" + companyName);
                System.out.println("员工：" + employeeName);
                System.out.println("底薪：" + baseSalary + " 元");

                // ✅ 规则3：直接访问方法内的局部变量
                System.out.println("全勤天数：" + workDays + " 天，每日奖金：" + dailyBonus + " 元");
                double totalBonus = workDays * dailyBonus;
                System.out.println("全勤奖金：" + totalBonus + " 元");

                // 计算税前总工资
                double preTax = baseSalary + totalBonus;
                // 计算税后工资
                double afterTax = preTax * (1 - taxRate);

                System.out.println("税前总工资：" + preTax + " 元");
                System.out.println("扣税（" + (taxRate * 100) + "%）：" + (preTax * taxRate) + " 元");
                return afterTax;
            }
        }

        // ==============================================
        // ✅ 规则2：只能在方法内部创建局部内部类的对象
        // ==============================================
        SalaryCalculator calculator = new SalaryCalculator();
        double finalSalary = calculator.calculateFinalSalary();

        // 输出最终结果
        System.out.println("✅ 员工【" + employeeName + "】最终到手工资：" + finalSalary + " 元");
        System.out.println("----------------------------------------");
    }

    // 主方法：测试
    public static void main(String[] args) {
        Company company = new Company();

        // 给不同员工发工资（调用方法，间接使用局部内部类）
        company.paySalary("张三", 22);
        company.paySalary("李四", 20);

        // ❌ 错误示范：外界无法直接使用局部内部类
        // Company.SalaryCalculator calc = new Company.SalaryCalculator(); // 编译报错！找不到类
    }
}
