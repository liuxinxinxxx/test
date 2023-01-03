package com.itheima;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个票号：");
        int ticket = sc.nextInt();
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }
    }
}
