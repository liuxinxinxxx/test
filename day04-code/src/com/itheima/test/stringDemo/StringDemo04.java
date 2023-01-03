package com.itheima.test.stringDemo;

import java.util.Scanner;

public class StringDemo04 {
    public static void main(String[] args) {
        /**
         * 需求：
         *  已知正确的用户名和密码，请用程序实现模拟用户登录，
         *  总共三次机会，登录之后给出相应的提示
         */
        //读题拆解法
        //1.定义两个变量记录正确的用户名和密码
        String rightUserName = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        //2.键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            //3.比较
            if (userName.equals(rightUserName) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    //最后一次机会也输入错误，此时要提示账号被锁定了
                    System.out.println("账号" + userName + "被锁定，请联系管理员");
                } else {
                    System.out.println("用户登录失败，用户名或密码有误,您还剩下" + (2 - i) + "次机会");
                }
            }
        }

    }
}
