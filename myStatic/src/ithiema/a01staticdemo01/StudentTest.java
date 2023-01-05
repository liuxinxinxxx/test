package ithiema.a01staticdemo01;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName="赵老师";
        Student.bookName = "Java基础";
        //1.创建第一个对象
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(13);
        student1.setGender("男");

        student1.study();
        student1.show();

        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(20);
        student2.setGender("男");

        student2.study();
        student2.show();
    }
}
