package com.itheima.test.test04;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的

    String[] boyFaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌简陋", "惨不忍睹"};
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s的背心的灵台穴拍去。",
            "%s使出了一招【游空叹爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。",
    };
    String[] injureds_desc = {
            "结果%s退了半步，毫发无伤",
            "结果给%s造成了一处瘀伤",
            "结果一击命中，%s痛的弯下了腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤。",
            "结果%s摇摇晃晃，一跤摔到在地上。",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果【轰】的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去",
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public Role(String name, int blood, char gender, String face, String[] boyFaces, String[] girlFaces) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        this.face = face;
        this.boyFaces = boyFaces;
        this.girlFaces = girlFaces;
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

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setFace(char gender) {
        Random random = new Random();
        if (gender == '男') {
            int index = random.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == '女') {
            int index = random.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        } else {
            this.face = "面目狰狞";
        }
        this.face = face;
    }

    /**
     * 获取
     *
     * @return boyFaces
     */
    public String[] getBoyFaces() {
        return boyFaces;
    }

    /**
     * 设置
     *
     * @param boyFaces
     */
    public void setBoyFaces(String[] boyFaces) {
        this.boyFaces = boyFaces;
    }

    /**
     * 获取
     *
     * @return girlFaces
     */
    public String[] getGirlFaces() {
        return girlFaces;
    }

    /**
     * 设置
     *
     * @param girlFaces
     */
    public void setGirlFaces(String[] girlFaces) {
        this.girlFaces = girlFaces;
    }

    //定义一个方法用于攻击别人
    //思考：谁攻击谁？
    //方法的调用者去攻击参数
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kungFu = attacks_desc[index];
        System.out.printf(kungFu, this.getName(), role.getName());
        System.out.println();
        //计算造成的伤害 1~20
        int hurt = r.nextInt(20) + 1;
        //修改挨揍人的血量
        int remainBold = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBold = remainBold < 0 ? 0 : remainBold;
        //修改一下挨揍的人的血量
        role.setBlood(remainBold);

        //受伤的描述
        //血量 > 90 0索引的描述
        // 80 ~ 90 1索引的描述
        // 70 ~ 80 2索引的描述
        // 60 ~ 70 3索引的描述
        // 40 ~ 60 4索引的描述
        // 20 ~ 40 5索引的描述
        // 10 ~ 20 6索引的描述
        // 小于10的 7索引的描述
        if (remainBold > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBold > 80 && remainBold <= 90) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (remainBold > 70 && remainBold <= 80) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (remainBold > 60 && remainBold <= 70) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (remainBold > 40 && remainBold <= 60) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (remainBold > 20 && remainBold <= 40) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (remainBold > 10 && remainBold <= 20) {
            System.out.printf(injureds_desc[6], role.getName());
        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
    }

    public void showRoleIndo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("颜值为：" + getFace());
    }
}
