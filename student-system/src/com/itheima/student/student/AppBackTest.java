package com.itheima.student.student;

import java.util.ArrayList;
import java.util.Scanner;


public class AppBackTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //主菜单
        while (true) {
            System.out.println("----欢迎来到学生管理系统------");
            System.out.println("请选择操作：1登录 2注册  3忘记密码");
            String choose = scanner.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgotPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用再见");
                    System.exit(0);
                }
                default -> System.out.println("没有该选项");
            }
        }
    }

    //忘记密码
    private static void forgotPassword(ArrayList<User> list) {
    }

    //注册
    private static void register(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        while (true) {
            System.out.println("请输入用户名");
            userName = scanner.next();
            //用户名校验
            boolean flag = checkUserName(userName);
            if (!flag) {
                System.out.println("用户名格式不满足，请重新输入");
                continue;
            }
            //校验用户名是否唯一
            boolean flagOnly = contain(list, userName);
            if (flagOnly) {
                System.out.println("用户名" + userName + "已存在，请重新输入");
            } else {
                System.out.println("用户名" + userName + "可用");
                break;
            }
        }

        //2.键盘录入密码
        //密码键盘输入两次，两次一致才可以进行注册
        String password;
        while (true) {
            System.out.println("请输入密码");
            password = scanner.next();
            System.out.println("请再次输入密码");
            String againPassword = scanner.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            } else {
                System.out.println("两次密码一致，继续录入其他数据");
                break;
            }
        }

        //3.键盘录入身份证号码
        String personId;
        while (true) {
            System.out.println("请输入身份证号");
            personId = scanner.next();
            boolean flag = checkPersonId(personId);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码有误，请重新输入");
                continue;
            }
        }
        //4.键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = scanner.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误，请重新输入");
                continue;
            }
        }
        User user = new User(userName, password, personId, phoneNumber);
        list.add(user);
        printList(list);
    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + "," + user.getPassword() + "," + user.getPhoneNumber() + "," + user.getPersonId() + ",");
        }
    }

    /**
     * 手机号码校验
     *
     * @param phoneNumber 手机号码
     */
    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //当循环结束之后，表示每个字符都在0-9之间
        return true;
    }

    //身份证校验
    private static boolean checkPersonId(String personId) {
        //长度为18位
        if (personId.length() != 18) {
            return false;
        }
        //不能以0为开头
        boolean first = personId.startsWith("0");
        if (first) {
            return false;
        }
        //前17位，必须都是数字
        for (int i = 0; i < personId.length(); i++) {
            char end = personId.charAt(i);
            if (!(end >= '0' && end <= '9')) {
                return false;
            }
        }
        //最后一位可以是数字，也可以是大写X或小写x
        char endChar = personId.charAt(personId.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'X') || (endChar == 'x')) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean contain(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String username = user.getUsername();
            if (userName.equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUserName(String userName) {
        int len = userName.length();
        //用户名长度校验
        if (len < 3 && len > 15) {
            return false;
        }
        //用户名只能是字母加数字的组合，不能是纯数字
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        //用户名满足两个要求：1长度满足  2 内容也满足（字母 + 数字）
        //但是不能是纯数字
        //统计在用户名中，有多少字母就可以了
        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    //登录
    private static void login(ArrayList<User> list) {
    }

}
