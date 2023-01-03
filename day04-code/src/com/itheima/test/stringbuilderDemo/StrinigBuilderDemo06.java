package com.itheima.test.stringbuilderDemo;

import java.util.Scanner;

public class StrinigBuilderDemo06 {
    public static void main(String[] args) {
        //使用stringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转
        /**
         * 键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
         * 对称字符串：123321、111
         * 非对称字符串：123123
         */
        //1.键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();

        //2.反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);

        //3.比较
        if (str.equals(result)) {
            System.out.println("当前字符串是对称字符串");
        } else {
            System.out.println("当前字符串不是对称字符串");
        }

    }
}
