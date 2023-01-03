package com.itheima.test.stringDemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，以后不要在玩了，TMD，SB";

        //2.定义一个敏感词库
        String[] arr = {"TMD","CNM","SB"};

        //3.把里面的敏感词TMD替换为***
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        // 4.打印结果
        System.out.println(talk);
    }
}
