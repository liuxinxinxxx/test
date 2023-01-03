package com.itheima.test.stringDemo;

import java.util.Scanner;

public class StringDemo03 {
    public static void main(String[] args) {
        //1.假设现在键盘录入一个abd
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = scanner.next();
        //2.代码中再定义一个字符串abc
        String str2 = "abc";
        //3.用==比较，这两者能一样吗？
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // false
    }
}
