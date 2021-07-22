package cn.maidaotech.java07.chapter04.test13_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGrade {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        for (int i = 190101; i < 190140; i++) {
            list.add(new Student(i, "学生" + i, (int) (Math.random() * 50 + 50)));
        }

        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
