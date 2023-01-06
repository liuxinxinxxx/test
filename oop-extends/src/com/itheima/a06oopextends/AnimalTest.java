package com.itheima.a06oopextends;

public class AnimalTest {


    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breachHome();
        h.lookHome();
        System.out.println("==========");
        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();
        System.out.println("==========");
        SharPei sharPei = new SharPei();
        sharPei.eat();
        sharPei.drink();
        sharPei.lookHome();
    }
}
