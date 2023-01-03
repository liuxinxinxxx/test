package com.itheima.student.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void startStudentSystem() {
        List<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("--------------欢迎来到黑马学生管理系统------------------");
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

    //添加学生
    public static void addStudent(List<Student> list) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id");
            String id = scanner.next();
            boolean flag = contains(list, id);
            if (flag) {
                //表示id已经存在，需要重新录入
                System.out.println("id已经存在，请重新录入");
            } else {
                //表示id不存在，表示可以使用
                student.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = scanner.next();
        student.setName(name);

        System.out.println("请输入学生的年龄");
        Integer age = scanner.nextInt();
        student.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = scanner.next();
        student.setAddress(address);

        list.add(student);
        System.out.println("学生信息添加成功");
    }

    //删除学生
    public static void deleteStudent(List<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = scanner.next();
        //查询id在集合中索引
        int index = getIndex(list, id);
        //对index进行判断
        //如果-1就表示不存在，结束方法，回到初始菜单
        if (index >= 0) {
            //如果大于等于0的，表示存在，直接删除
            list.remove(index);
            System.out.println("id为：" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(List<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的id");
        String id = scanner.next();
        int index = getIndex(list, id);
        if (index == 1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        //当代码执行到这里，表示什么？表示当前id是存在的。
        //获取要修改的学生对象
        Student student = list.get(index);

        System.out.println("请输入要修改的学生姓名");
        String newName = scanner.next();
        student.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = scanner.nextInt();
        student.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = scanner.next();
        student.setAddress(newAddress);
        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(List<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后在查询");
            //结束方法
            return;
        }
        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        //当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t"
                    + student.getAge() + "\t" + student.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(List<Student> list, String id) {
        //循环遍历集合得到里面的每一个学生对象
        // 存在 true   不存在  false
        /*for (int i = 0; i < list.size(); i++) {
            // 拿到学生对象后，获取id并进行判断
            Student student = list.get(i);
            String uid = student.getId();
            if (uid.equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list, id) >= 0;
    }

    //通过id获取索引的方法
    public static int getIndex(List<Student> list, String id) {
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student student = list.get(i);
            //得到每一个学生对象的id
            String sid = student.getId();
            //拿着集合中的学生id跟要查询的id进行比较
            if (sid.equals(id)) {
                //如果一样，那么返回索引
                return i;
            }
        }
        //当循环结束之后还没有找到，就表示不存在，返回-1
        return -1;
    }

}
