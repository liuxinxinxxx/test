package com.itheima.a09oopextends;

public class Test {
    public static void main(String[] args) {
        Manage m = new Manage("heima001","张三","233211","4324");
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBouns());
        m.eat();
        m.work();
        Cook cook = new Cook();
        cook.setId("heima002");
        cook.setName("李四");
        cook.setSalary("4210.78");
        System.out.println(cook.getId() + "," + cook.getName() + "," + cook.getSalary());
        cook.eat();
        cook.work();
    }
}
