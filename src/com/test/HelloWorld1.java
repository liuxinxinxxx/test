package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld1 {
    public static void main(String[] args) {

        /* 核心代码 */
        Calendar beforeTime = Calendar.getInstance();
        beforeTime.add(Calendar.MINUTE, -5);// 5分钟之前的时间
        Date beforeD = beforeTime.getTime();
        String before5 = new SimpleDateFormat("yyyyMMddHHmmss").format(beforeD);
        String substring = before5.substring(8,12);
        System.out.println("substring==" + substring);
        System.out.println("before5==" + before5);
    }
}
