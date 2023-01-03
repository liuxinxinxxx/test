package com.itheima.test.stringDemo;

import java.util.Scanner;

public class StringDemo06 {
    public static void main(String[] args) {
        /**
         * 键盘录入一个字符串,统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
         */
        //1.键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        //2.统计---计数器四相关
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >='A' && c <= 'Z') {
                bigCount++;
            } else if ( c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        //3.输出打印
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("小写字母有：" + bigCount + "个");
        System.out.println("小写字母有：" + numberCount + "个");

    }
}
