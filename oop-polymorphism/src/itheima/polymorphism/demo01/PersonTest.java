package itheima.polymorphism.demo01;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);

        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(45);

        Administrator admin = new Administrator();
        admin.setName("王五");
        admin.setAge(13);
        //学生信息
        register(s);
        //教师信息
        register(teacher);
        //管理员
        register(admin);
    }

    public static void register(Person person) {
        person.show();
    }
}
