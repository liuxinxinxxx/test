package ithiema.a03staticdemo03;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {};

    //静态方法
    public static int getMaxStudent(ArrayList<Student> list) {
        //1.定义一个参照物
        int max = list.get(0).getAge();
        //2.循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            // i 索引  list.get(i) 元素/学生对象   我们还需要getAge获取到年龄之后在进行比较
            int tempAge = list.get(0).getAge();
            if (tempAge > max) {
                max = list.get(i).getAge();
            }
        }
        //直接返回max
        return max;
    }
}
