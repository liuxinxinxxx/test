package com.itheima.test.stringJonerDemo;

import java.util.StringJoiner;

public class StringJonerDmoe01 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner stringJoiner = new StringJoiner("--");
        //2.添加元素
        stringJoiner.add("aa").add("bb").add("cc");
        //3.打印结果
        System.out.println(stringJoiner);
    }
}
