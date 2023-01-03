package com.itheima.test.stringbuilderDemo;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder stringBuilder = new StringBuilder("abc");
        //2.添加元素
        stringBuilder.append(2);
        stringBuilder.append(2.2);
        stringBuilder.append(true);
        //反转
        stringBuilder.reverse();
        //获取长度
        int length = stringBuilder.length();
        System.out.println(length);

        //打印
        //普及：
        //因为strin
        // gBuilder是java已经写好的类
        //java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值。
        System.out.println(stringBuilder);
    }
}
