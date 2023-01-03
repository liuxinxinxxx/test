package com.itheima.test.listDemo;

import java.util.ArrayList;

/**
 * boolean add(E e) 添加
 * <p>
 * boolean remove(E e) 删除
 * E remove(int index)
 * <p>
 * E set(int index,E e)  修改
 * <p>
 * E get(int index)  查询
 * int size()        获取长度
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("aaaaa");
        list.add("aaaaa");
        list.add("ccc");
        list.add("bbb");
        //3.删除元素
       /*boolean result1 = list.remove("aaaaa");
        System.out.println(result1); //true

        boolean result2 = list.remove("aaaaaaaaaaaa");
        System.out.println(result2); //false
        String str = list.remove(0);
        System.out.println("str=" + str); //str=aaaaa
        System.out.println("list=" + list);//list=[aaaaa, ccc, bbb]
        */

        //修改元素
        /*String update = list.set(1, "qwer");
        System.out.println("update=" + update);//update=aaaaa
        System.out.println("list=" + list); //list=[aaaaa, qwer, ccc, bbb]
        */

        //查询元素
        String query = list.get(0);
        System.out.println("query=" + query);//query=aaaaa

        System.out.println("list=" + list);//list=[aaaaa, aaaaa, ccc, bbb]

        //遍历
        for (int i = 0; i < list.size(); i++) {
            // i 索引
            //list.get(i)  元素
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
