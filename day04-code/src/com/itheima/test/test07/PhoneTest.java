package com.itheima.test.test07;

public class PhoneTest {
    public static void main(String[] args) {
        /**
         * 需求：定义数组存储3部手机对象
         * 手机的属性：品牌 价格  颜色
         * 要求：计算出三部手机的平均价格
         */
        //1.定义数组
        Phone[] arr = new Phone[3];
        //2.创建手机对象
        Phone p1 = new Phone("小米", 3999, "黑色");
        Phone p2 = new Phone("苹果", 3999, "黑色");
        Phone p3 = new Phone("华为", 3999, "黑色");
        //3.将手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        //4.获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        //5.求平均值
        int avg = sum / arr.length;
        //double avg = sum * 1.0 / arr.length;
        System.out.println(avg);
    }
}
