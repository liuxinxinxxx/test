package com.itheima.test.listDemo;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        /**
         * 需求：定义一个集合，添加字符串，并进行遍历
         * 遍历格式参照：[元素1，元素2，元素3]
         */
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");  //[aaa,bbb,ccc,ddd]
    }
}
