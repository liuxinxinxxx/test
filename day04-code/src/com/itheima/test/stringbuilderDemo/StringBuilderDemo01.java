package com.itheima.test.stringbuilderDemo;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }
}
