package com.itheima.a05oopextends;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "zi";

    public void show() {
        String name = "ziShow";
        System.out.println(name);//ziShow
        System.out.println(this.name);//zi
        System.out.println(super.name);//Fu
    }
}
