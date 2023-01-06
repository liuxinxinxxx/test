package com.itheima.a10oopextends;

public class Test {
    public static void main(String[] args) {
        //采购员
        Buyer buyer = new Buyer();
        buyer.setId("001");
        buyer.setName("张三");
        System.out.println(buyer.getId() + "," + buyer.getName());
        buyer.work();

        //助教
        Tutor tutor = new Tutor();
        tutor.setId("002");
        tutor.setName("李四");
        System.out.println(tutor.getId() + "," + tutor.getName());
        tutor.work();
    }
}
