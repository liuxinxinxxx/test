package com.itheima.test.stringJonerDemo;

import java.util.StringJoiner;

public class StringJonerDmoe02 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        //2.添加元素
        stringJoiner.add("aaa").add("bbb").add("ccc");
        int length = stringJoiner.length();
        System.out.println(length); // 15
        //3.打印结果
        System.out.println(stringJoiner); //  [aaa, bbb, ccc]

        String str = stringJoiner.toString();
        System.out.println(str);  //[aaa, bbb, ccc]

    }
}
