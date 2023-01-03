package com.itheima;

import java.util.Random;

public class ExampleTest {
    public static void main(String[] args) {

        //分析：
        //1.大写字母和小写字母都放到数组当中
        char[] chs = new char[56];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char)(65 + i - 26);
            }
        }
        //定义一个字符串类型的变量，用来记录最终的结果
        String result = "";
        //2.随机抽取4次
        //随机抽取数组中索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //System.out.print(chs[randomIndex]);
            result = result + chs[randomIndex];
        }
        System.out.println(result);
    }
}
