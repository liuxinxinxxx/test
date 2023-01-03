package com.itheima;

public class ArrTest5 {
    public static void main(String[] args) {
        /**
         * 需求：定义一个数组，粗如1，2，3，4，5.交换首尾索引对应的元素
         * 交换前：1，2，3，4，5
         * 交换后：5，2，3，4，1
         */
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
