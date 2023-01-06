package com.itheima.a05oopextends;

public class Test02 {
    public static void main(String[] args) {
        Zis zi = new Zis();
        zi.show();
    }
}

class Fus {
    String name = "Fu";
    String hobby = "喝茶";
}

class Zis extends Fus {
    String name = "zi";
    String game = "吃鸡";
    public void show() {
        //如何打印zi
        System.out.println(name);//zizh
        System.out.println(this.name);//zi
        //如何打印Fu
        System.out.println(super.name);//Fu
        //如何打印喝茶
        System.out.println(super.hobby);//喝茶
        System.out.println(this.hobby);//喝茶
        System.out.println(hobby);//喝茶
        //如何打印吃鸡
        System.out.println(this.game);//吃鸡

    }
}