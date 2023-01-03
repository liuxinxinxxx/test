package com.itheima.test.stringDemo;

public class StringDemo08 {
    public static void main(String[] args) {
        /**
         * 需求：
         *  定义一个方法，实现字符串反转
         *  键盘录入一个字符串，调用该方法后，在控制台输出结果
         *  例如：键盘录入abc，输出结果cba
         */
        String result = reverser("abc");
        System.out.println(result);
    }

    //1.我要干嘛？ --字符串的反转
    //2.我干这件事情，需要什么才能完成？ -- 需要一个字符串
    //3.调用处是否需要继续使用方法的结果呢？ -- 需要结果进行输出
    public static String reverser(String str) {
        // abc
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }

}
