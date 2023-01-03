package com.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入男生的衣服时髦度：");
        int boyFashion = sc.nextInt();
        System.out.println("请输入女生的衣服时髦度：");
        int girlFashion = sc.nextInt();

        boolean result = boyFashion > girlFashion;

        System.out.println(result);
    }
}
