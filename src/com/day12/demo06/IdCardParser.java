package com.day12.demo06;

public class IdCardParser {
    public static void main(String[] args) {
        String idCard = "321104200801121274";

        // 生日
        String birth = idCard.substring(6, 14);
        String birthDate = birth.substring(0,4) + "年"
                + birth.substring(4,6) + "月"
                + birth.substring(6,8) + "日";

        // 性别：看 倒数第二位
        char genderChar = idCard.charAt(16); // 16 就是第17位
        int genderCode = genderChar - '0';
        String gender = genderCode % 2 == 1 ? "男" : "女";

        System.out.println("出生年月日：" + birthDate);
        System.out.println("性别为：" + gender);
    }
}