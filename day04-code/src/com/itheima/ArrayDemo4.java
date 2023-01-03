package com.itheima;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /**
         * 定义一个数组，存储1，2，3，4，5
         * 遍历数组得到的每一个元素，统计数组里面一共有多少个能被3整除的数字
         */
        //分析:
        //1.定义一个数组，存储1，2，3，4，5
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //定义要给变量，用来统计次数
        int count = 0;
        //遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
