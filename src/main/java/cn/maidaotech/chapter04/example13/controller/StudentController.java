package cn.maidaotech.chapter04.example13.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cn.maidaotech.chapter04.example13.model.Student;
import cn.maidaotech.chapter04.example13.service.StudentService;

public class StudentController {
    public static void main(String[] args) {

        //魔改老师的排序参考09和12
        List<Student> list = new ArrayList<Student>();
        for (int i = 190101; i <= 190140; i++) {
            list.add(new Student(i, "小明" + i, (int) (Math.random() * 100) + 1));
        }
        System.out.println("排序前");
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("排序后");  
        Collections.sort(list, new StudentService());
        for (Student p : list) {
            System.out.println(p);
        }


    }
    

}