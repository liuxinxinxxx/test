package com.itheima.test.stringbuilderDemo;

public class StringBuilderDemo07 {
    public static void main(String[] args) {
        /**
         * 需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
         * 调用该方法，并在控制台输出结果
         * 例如：数组为int[] arr = {1,2,3};
         * 执行方法后的输出结果为：[1,2,3]
         */

        //1.定义数组
        int[] arr = {1,2,3};
        //调用方法把数组变成字符串
        String str = arrToString(arr);
        System.out.println(str); //[1,2,3]
    }
    public static String arrToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                stringBuilder.append(arr[i]);
            } else {
                stringBuilder.append(arr[i]).append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
