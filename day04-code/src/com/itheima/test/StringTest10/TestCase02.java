package com.itheima.test.StringTest10;

import java.util.Scanner;

public class TestCase02 {
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
            String s = changeLuoMa(c);
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

    //利用switch进行匹配
    public static String changeLuoMa(char number) {
        String str = switch (number) {
            case '0' ->  " ";
            case '1' ->  "Ⅰ";
            case '2' ->  "Ⅱ";
            case '3' ->  "Ⅲ";
            case '4' ->  "Ⅳ";
            case '5' ->  "Ⅴ";
            case '6' ->  "Ⅵ";
            case '7' ->  "Ⅶ";
            case '8' ->  "Ⅷ";
            case '9' ->  "Ⅸ";
            default -> str =  "";
        };
        return str;
    }
}
