package com.itheima.test.stringbuilderDemo;

public class StringgBuilderDemo04 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder stringBuilder = new StringBuilder();
        //2.添加字符串
        stringBuilder.append("aaa").append("bb").append("ccc");
        System.out.println(stringBuilder);//aaabbbccc
        //3.再把StrinBuilder变回字符串
        String str = stringBuilder.toString();
        System.out.println(str);//aaabbbccc

    }
}
