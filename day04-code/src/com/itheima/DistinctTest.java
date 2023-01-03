package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctTest {
    public static void main(String[] args) {
        List<String> userList = getUserList();
        System.out.println("去重前：" + userList);
        List newList = userList.stream().distinct().collect(Collectors.toList());
        System.out.println("去重后：" + newList);
    }


    public static List<String> getUserList() {
        List<String> userList = new ArrayList<>();
        userList.add("小王");
        userList.add("小张");
        userList.add("小詹");
        userList.add("小王");
        userList.add("老王");
        userList.add("小詹");
        return userList;
    }
}
