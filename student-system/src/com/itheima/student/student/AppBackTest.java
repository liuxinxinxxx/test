package com.itheima.student.student;

import java.util.ArrayList;
import java.util.Random;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.next();
        boolean flag = contain(list, userName);
        if (!flag) {
            System.out.println("当前用户" + userName + "未注册，请先注册");
            return;
        }

        //键盘录入身份证号码和手机号码
        System.out.println("请输入身份证号码");
        String personId = scanner.next();
        System.out.println("请输入手机号码");
        String phoneNumber = scanner.next();

        //需要把用户对象通过索引先获取出来
        int index = findIndex(list, userName);
        User user = list.get(index);
        //比较用户对象中的手机号码和身份证号码是否相同
        if (!(user.getPersonId().equalsIgnoreCase(personId) && user.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("身份证号码或手机号码输入有误，不能修改密码");
            return;
        }

        //当代码执行到这里，表示所有的数据全部验证成功，直接修改即可
        String password;
        while (true) {
            System.out.println("请输入新的密码");
            password = scanner.next();
            System.out.println("请再次输入新的密码");
            String againPassword = scanner.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码一致");
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }
        }
        user.setPassword(password);
        System.out.println("密码修改成功");
    }

    private static int findIndex(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    //注册
    private static void register(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        while (true) {
            System.out.println("请输入用户名");
            userName = scanner.next();
            //用户名校验
            boolean UserNameFlag = checkUserName(userName);
            if (!UserNameFlag) {
                System.out.println("用户名格式不满足，请重新输入");
                continue;
            }
            //校验用户名是否唯一
            //username到集合中判断是否有存在
            boolean userNameOnly = contain(list, userName);
            if (userNameOnly) {
                //用户名已存在，那么当前用户名无法注册，需要重新输入
                System.out.println("用户名" + userName + "已存在,请重新输入");
            } else {
                //不存在，表示当前用户名可用，可以继续录入下面的其他数据
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

    //登录
    private static void login(ArrayList<User> list) {
        /**
         * 验证要求：
         *  用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
         *  判断验证码是否正确，如不正确，重新输入
         *  在判断用户名和密码是否正确，有3次机会
         */
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String userName;
            while (true) {
                System.out.println("请输入用户名");
                userName = scanner.next();
                //判断用户名是否存在
                boolean flag = contain(list, userName);
                if (!flag) {
                    System.out.println("用户名" + userName + "未注册，请先注册在登录");
                    break;
                } else{
                    System.out.println("用户名" + userName + "登录成功");
                    break;
                }
            }

            System.out.println("请输入密码");
            String password = scanner.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前验证码为" + rightCode);
                System.out.println("请输入验证码");
                String code = scanner.next();
                if (rightCode.equalsIgnoreCase(code)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误");
                    continue;
                }
            }
            //验证用户名和密码是否正确
            //集合中是否包含用户名和密码
            //定义一个方法验证用户名和密码是否正确
            //封装思想的应用：
            //我们可以把零散的数据，封装成一个对象
            //以后传递参数的时候，只要传递一个整体就可以了，不需要管这些零散的数据。
            User userInfo = new User(userName, password, null, null);
            boolean result = checkUserInfo(userInfo, list);
            if (result) {
                System.out.println("登录成功，欢迎使用学生管理系统");
                //创建对象调用方法，启动学生管理系统
                StudentTest studentTest = new StudentTest();
                studentTest.startStudentSystem();
                break;
            } else {
                System.out.println("登录失败，用户名或者密码错误");
                if (i == 2) {
                    System.out.println("当前账号" + userName + "被锁定");
                    //当前账号锁定之后，直接结束方法
                    return;
                } else {
                    System.out.println("用户名和密码错误，还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }

    private static boolean checkUserInfo(User userInfo, ArrayList<User> list) {
        //遍历集合，判断用户是否存在，如果存在登录成功，如果不存在登录失败
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
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

    /**
     * 验证码规则：
     * 长度为5
     * 由4位大写或者小写字母和1位数字组成，同一个字母可重复
     * 数字可以出现在任意位置
     */
    private static String getCode() {
        //1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //2.要随机抽取4个字符
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = random.nextInt(list.size());
            //利用随机索引获取字符
            char c = list.get(index);
            //把随机字符添加到stringBuilder当中
            stringBuilder.append(c);
        }

        //3.把一个随机数字添加到末尾
        int number = random.nextInt(10);
        stringBuilder.append(number);

        //4.如果我们要修改字符串中的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] arr = stringBuilder.toString().toCharArray();
        //拿着最后一个索引，跟随机索引指向的元素交换
        int randomIndex = random.nextInt(arr.length);
        //最大索引指向的元素 跟随机索引指向的元素交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }

}
