package com.itheima.test.listDemo;

import java.util.ArrayList;

/**
 * 需求：
 * 1.main方法中定义一个集合，存入三个用户对象
 * 用户属性为：id username password
 * 2.要求：定义一个方法，根据id查找对应的用户信息
 * 如果存在，返回true
 * 如果不存在，返回false
 */
public class UserTest {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();
        //2.创建三个用户对象
        User u1 = new User("heima001","zhangsan","12345");
        User u2 = new User("heima002","lisi","12345678");
        User u3 = new User("heima003","wangwu","123");
        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //4.调用方法查看id是否存在
        boolean flag = contains(list, "heima001");
        System.out.println(flag); // true
    }

    //1.我要干嘛？   根据id查找用户
    //2.我干这件事情需要什么才能完成？  list  id
    //3.调用处是否需要使用方法的结果？   返回
    public static boolean contains(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uid = user.getId();
            if (uid.equals(id)){
                //如果找到了直接返回true
                return true;
            }
        }
        //当循环结束表示集合里面所有的元素都已经比较完毕，还没有一样，那么返回false
        return false;
    }
}
