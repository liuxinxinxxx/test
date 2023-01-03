package com.itheima.test.test03;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }

    //定义一个方法用于攻击别人
    //思考：谁攻击谁？
    //方法的调用者去攻击参数
    public void attack(Role role) {
        //计算造成的伤害 1~20
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;
        //修改挨揍人的血量
        int remainBold = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBold = remainBold < 0 ? 0 : remainBold;
        //修改一下挨揍的人的血量
        role.setBlood(remainBold);
        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() +
                "一下，造成了" + hurt + "点的伤害,"+role.getName()+"还剩下了" + remainBold + "点血量");
    }
}
