package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        Integer max = 100;
        Integer min = 50;
        List<StudentMethod> studnet = new ArrayList<StudentMethod>();
        for (int i = 190101; i <= 190140; i++) {
            Integer a = (int) (Math.random() * (max - min) + min);
            studnet.add(new StudentMethod(i, "学生" + i, a));
        }
        System.out.println(studnet.size());
        System.out.println("=====排序前=====");
        for (StudentMethod i : studnet) {
            System.out.println(i);
        }
        System.out.println("=====排序后=====");
        studnet.stream().sorted().map(StudentMethod::toString).forEach(System.out::println);

    }
}