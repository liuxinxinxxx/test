package com.test;

/**
 * 强制类型转换
 */
public class VariableTest2 {
    public static void main(String[] args) {
        int num = 187;
        int bai = num / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;
        System.out.println("bai==" + bai);
        System.out.println("shi==" + shi);
        System.out.println("ge==" + ge);
    }
}
