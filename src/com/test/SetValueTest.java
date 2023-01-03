package com.test;

public class SetValueTest {
    public static void main(String[] args) {
        //赋值符号： =
        int i1 = 10;
        int j1 = 10;
        int i2, j2 = 10;
        int i3 = 10, j3 = 20;

        int num = 10;
        num += 5;
        System.out.println("num=" + num);

        short s1 = 10;
        //s1 = s1 + 2;//编译失败
        s1 += 2;//结论：不会改变变量本身的数据类型
        System.out.println(s1);
        /**
         * 开发中，如果希望变量实现+2的操作，有几种方法（前提 int num = 10;）
         * 方式一：num = num + 2;
         * 方式二：num += 2;（推荐）
         */
        //练习1
        int i = 1;
        i *= 0.1;
        System.out.println("i=" + i);
        i++;
        System.out.println("i=" + i);
        //练习2
        int m = 2;
        int n = 3;
        n *= m++; //n = n * m++;
        System.out.println("n=" + n);

        //练习4
        int n1 = 10;
        n1 += (n1++) + (++n1);//n = n + (n++) + (++n);
        System.out.println("n1=" + n1);//32
    }
}
