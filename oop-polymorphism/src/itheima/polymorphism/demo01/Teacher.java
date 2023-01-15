package itheima.polymorphism.demo01;

public class Teacher extends Person{

    @Override
    public void show() {
        System.out.println("教师：" + getName()+ "，" + "年龄为：" + getAge());
    }
}
