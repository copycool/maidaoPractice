package cn.maidaotech.java07.work4.Test13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        for (int i = 190101; i < 190140; i++) {
          list.add(new Student(i,"学生"+i,(int)(Math.random()*100)+1));
          //list.add(new Student(i, "小明" + i, (int) (Math.random() * 100) + 1));
        }
        // //Map<Integer, Integer> student = new HashMap<>();
        // Student stu=new Student();
        // for (int i = 0; i < 40; i++) {
        // Integer score=new Integer((Integer)Math.random()*50+50);
        // }
        for (Student student : list) {
             System.out.println(student);
        }
       

    }
}
