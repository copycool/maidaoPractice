package cn.maidaotech.java07.chapter04.practice13;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        for (int i = 190101; i <= 190140; i++) {
            list.add(new Student(i, "小明" + i, (int) (Math.random() * 100) + 1));
        }
        System.out.println("排序前");
        for (Student s : list) {
            System.out.println(s);
        }
        // Collections.sort(list);
        System.out.println("排序后");
        list.stream().sorted().map(Student::toString).forEach(System.out::println);
    }
}