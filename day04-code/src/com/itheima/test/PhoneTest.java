package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone phone = new Phone();
        //叫做给手机赋值
        phone.brand = "小米";
        phone.price = 1999.98;
        //获取手机对象中的值
        System.out.println(phone.brand);
        System.out.println(phone.price);
        //调用手机中的方法即可
        phone.call();
        phone.playGame();
    }
}
