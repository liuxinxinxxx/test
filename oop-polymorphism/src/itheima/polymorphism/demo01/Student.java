package itheima.polymorphism.demo01;

public class Student extends Person{
    
    @Override
    public void show() {
        System.out.println("学生：" + getName() + "，"+ "年龄为：" + getAge());
    }

    
}
