package com.itheima.test.test08;

public class GirlFriendTest {
    public static void main(String[] args) {
        /**
         * 需求：
         *  定义数组存储4个女朋友的对象
         *  女朋友的属性：姓名、年龄、性别、爱好
         *  要求1：计算出四女朋友的平均年龄
         *  要求2：统计年龄比平均值低大的女朋友有几个？并把她们的所有信息打印出来。
         */

        //1.定义数组
        GirlFriend[] arr = new GirlFriend[4];
        //2.创建对象
        GirlFriend g1 = new GirlFriend("张三",20,"萌妹子","打游戏");
        GirlFriend g2 = new GirlFriend("里斯",18,"萌妹子","打游戏");
        GirlFriend g3 = new GirlFriend("李四",19,"可爱","学习");
        GirlFriend g4 = new GirlFriend("王五",21,"憨妹子","睡觉");
        //3.对象添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        //4.计算出四个女朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend phone = arr[i];
            sum += phone.getAge();
        }
        //5.计算平均值
        int avg = sum / arr.length;
        //6.统计平均年龄值低的女朋友有几个
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            if (girlFriend.getAge() < avg) {
                count++;
                System.out.println(girlFriend.getName() + "," + girlFriend.getAge() +"," + girlFriend.getGender() +"," + girlFriend.getHobby());
            }
        }
        System.out.println(count);
    }
}
