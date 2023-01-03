package com.itheima;

import java.util.Scanner;

public class ForDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始的数据：");
        int start = sc.nextInt();
        System.out.println("请输入结束的数据：");
        int end = sc.nextInt();
        //统计符合要求的数字的个数
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
