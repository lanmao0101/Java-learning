import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        // 1. 获取用户输入的字符串
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.nextLine();

        // 2. 遍历一遍字符串（只循环一次！）
        System.out.println("\n开始遍历字符串：");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  // 取出第 i 个字符
            System.out.println("索引 " + i + "：" + c);
        }

        System.out.println("\n遍历完成！");
    }
}