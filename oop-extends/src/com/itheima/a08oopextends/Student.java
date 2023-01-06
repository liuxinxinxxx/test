package com.itheima.a08oopextends;

public class Student extends Person{

    public Student() {
        super();
        System.out.println("子类的无参数构造");
    }

    public Student(String name,int age) {
        super(name,age);
    }
}
