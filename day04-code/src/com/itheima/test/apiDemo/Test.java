package com.itheima.test.apiDemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个小数");
        //2.接收一个小数
        double result = scanner.nextDouble();
        //输出打印
        System.out.println(result);
    }
}
