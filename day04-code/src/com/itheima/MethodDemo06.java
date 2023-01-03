package com.itheima;

public class MethodDemo06 {
    public static void main(String[] args) {
        int result = compare(10, 20);
        System.out.println(result);
    }
    // 会把相同功能的方法名起成一样的名字
    // 好处1：定义方法的时候可以不用那么多的单词了
    // 好处2：调用方法的时候也不需要那么麻烦了
    public static int compare(int a, int b) {
        System.out.println("int");
        int result = a + b;
        return result;
    }
    public static void compare(short a, short b) {
        System.out.println("short");
    }
    public static void compare(byte a, byte b) {
        System.out.println("byte");
    }
    public static void compare(long a, long b) {
        System.out.println("long");
    }
}
