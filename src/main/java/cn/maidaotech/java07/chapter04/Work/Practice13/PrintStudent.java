package cn.maidaotech.java07.chapter04.Work.Practice13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintStudent {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list = Student1.init(190101, 190140);
        for (Student1 student1 : list) {
            System.out.println(student1);
        }
        Student1[] student1s = new Student1[list.size()];
        list.toArray(student1s);
        Arrays.sort(student1s);
        System.out.println("排序后：");
        for (Student1 student1 : student1s) {
            System.out.println(student1);
        }
    }
}
