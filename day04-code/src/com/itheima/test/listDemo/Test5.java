package com.itheima.test.listDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.键盘录入学生的信息并添加到集合当中
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生的姓名");
            String name = scanner.next();
            System.out.println("请输入学生的年龄");
            int age = scanner.nextInt();
            //把name和age赋值给学生对象
            s.setAge(age);
            s.setName(name);
            //把学生对象添加到集合当中
            list.add(s);
        }

        //3.遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引 list.get(i) 元素/学生对象
            Student student = list.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }
        //wangwu,12
        //zhaoliu,23
        //lisi,89
    }
}
