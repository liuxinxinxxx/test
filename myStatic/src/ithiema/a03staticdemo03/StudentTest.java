package ithiema.a03staticdemo03;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        /**
         * 定义学生工具类
         * 需求：定义一个集合，用于存储3个对象集合
         * 学生类的属性为：name、age、gender
         * 定义一个工具类，用于获取集合中最大学生的年龄
         */
        //1.定义一个集合
        ArrayList<Student> list = new ArrayList<>();
        //2.创建学生对象
        Student student1 = new Student("zhangsna",23,"男");
        Student student2 = new Student("lisi",34,"男");
        Student student3 = new Student("wangwu",18,"女");

        //3.把学生对象添加到集合当中
        list.add(student1);
        list.add(student2);
        list.add(student3);
        //4.调用学生工具类中的方法
        int maxAgeStudent = StudentUtil.getMaxStudent(list);
        System.out.println(maxAgeStudent);

    }
}
