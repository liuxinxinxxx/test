package com.itheima.test.listDemo;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student s1 = new Student("zhangsan", 12);
        Student s2 = new Student("lisi", 12);
        //3.添加元素\
        list.add(s1);
        list.add(s2);
        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            //i 索引 list.get(i) 元素/学生对象
            Student student = list.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
