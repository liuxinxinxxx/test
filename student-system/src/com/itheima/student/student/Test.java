package com.itheima.student.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----欢迎来到黑马学生管理系统--------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    //System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //新增学生
    public static void addStudent(List<Student> list) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id");
            String id = scanner.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id已经存在，需要重新录入");
            } else {
                student.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = scanner.next();
        student.setName(name);

        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        student.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = scanner.next();
        student.setAddress(address);

        list.add(student);

        System.out.println("学生信息添加成功。");

    }

    //删除学生
    public static void deleteStudent(List<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除学生信息的id");
        String id = scanner.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为：" +id +"的学生信息删除成功");
        }else {
            System.out.println("学生信息不存在，请重新输入id");
        }
    }

    //修改学生
    public static void updateStudent(List<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = scanner.next();
        int index = getIndex(list, id);
        if (index == 1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        Student student = list.get(index);

        System.out.println("请输入学生姓名");
        String name = scanner.next();
        student.setName(name);

        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        student.setAge(age);

        System.out.println("请输入学生的地址");
        String address = scanner.next();
        student.setAddress(address);

        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(List<Student> list) {
        if(list.size() == 0) {
            System.out.println("当前无学生信息，请添加后在查询");
            return;
        }
        //打印表头信息
        System.out.println("id\tname\tage\taddress\t");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
    }

    public static boolean contains(List<Student> list, String id){
        /*for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String sid = student.getId();
            if (sid.equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list,id) >= 0;
    }

    public static int getIndex(List<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String sid = student.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
