package com.itheima.a01oopextends;

public class Test {

    public static void main(String[] args) {
        Lihua lihua = new Lihua();
        lihua.eat();
        lihua.drink();
        lihua.catchMouse();
        System.out.println("========");
        Poodle poodle = new Poodle();
        poodle.eat();
        poodle.drink();
        poodle.lookHome();
        poodle.dawdle();
    }

}
