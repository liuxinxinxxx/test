package com.itheima.test.StringTest10;

import java.util.Scanner;

public class TestCase01 {
    public static void main(String[] args) {
        /**
         * 键盘录入一个字符串
         * 要求1：长度为小于等于9
         * 要求2：只能是数字
         *          将内容变成罗马数字
         *
         * 注意点：
         *  罗马数字里面是没有0的
         *  如果键盘录入的数字包含0，可以变成""(长度为0的字符串)
         */

        //1.键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = scanner.next();
            //2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前字符串不符合规则");
                continue;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number  = c - 48;
            String s = changeLuoMa(number);
            stringBuilder.append(s);
        }
        System.out.println(stringBuilder);
    }
    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(int number) {
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];
    }
}
