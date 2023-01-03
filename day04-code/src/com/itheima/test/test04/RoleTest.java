package com.itheima.test.test04;

public class RoleTest {
    public static void main(String[] args) {
        //第一角色
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'男');
        r1.showRoleIndo();
        r2.showRoleIndo();
        //开始格斗
        while (true) {
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
