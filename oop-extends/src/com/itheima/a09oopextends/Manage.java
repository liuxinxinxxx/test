package com.itheima.a09oopextends;

public class Manage extends Employee{
    private String bouns;

    @Override
    public void eat() {
        System.out.println("管理其他人");
    }

    public Manage() {
    }



    public Manage(String id, String name, String salary, String bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    /**
     * 获取
     * @return bouns
     */
    public String getBouns() {
        return bouns;
    }

    /**
     * 设置
     * @param bouns
     */
    public void setBouns(String bouns) {
        this.bouns = bouns;
    }

}
