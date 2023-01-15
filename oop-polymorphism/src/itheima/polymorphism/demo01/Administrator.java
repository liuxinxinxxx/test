package itheima.polymorphism.demo01;

public class Administrator extends Person{

    @Override
    public void show() {
        System.out.println("管理员：" + getName() + "，" + "年龄：" + getAge() );
    }
}
