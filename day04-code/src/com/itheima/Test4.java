package com.itheima;

public class Test4 {
    public static void main(String[] args) {
        String noodles = "兰州拉面";

        switch (noodles) {
            case "兰州拉面" :
                System.out.println("兰州拉面");
                break;
            case "武汉热干面" :
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面" :
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面" :
                System.out.println("吃陕西油泼面");
                break;
        }

        int number = 1;
        switch (number) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            default -> System.out.println("没有这种选项");
        }
    }
}
