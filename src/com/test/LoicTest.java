package com.test;

/**
 * 运算符之四：逻辑运算符
 * & && | || ！ ^
 *
 * 说明：
 *  1.逻辑运算符操作的都是boolean类型变量
 */
public class LoicTest {
    public static void main(String[] args) {
        //一开始没有乘客
        int count = 0;
        //第一站：上去一位乘客
        //在原有的基础上 + 1
        count = count + 1 ;
        //第二站：上去两位乘客
        count = count + 2 - 1;
        //第三站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        //第四战：下来一位乘客
        count = count - 1;
        //第五站：上去一位乘客
        count = count + 1;
        //请问：到了终点站，车上还剩几位乘客
        System.out.println(count);
    }
}
