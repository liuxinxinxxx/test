package com.itheima.test.StringTest10;

public class Test05 {
    public static void main(String[] args) {
        String num1 = "12343434";
        String num2 = "12345678";

        Integer numFirst = Integer.parseInt(num1);
        Integer numSecond = Integer.parseInt(num2);

        int result = numFirst * numSecond;
        String results = Integer.toString(result);
        System.out.println(results);
    }
}
