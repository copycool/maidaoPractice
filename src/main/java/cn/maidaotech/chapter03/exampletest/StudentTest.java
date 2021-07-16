package cn.maidaotech.chapter03.exampletest;

import cn.maidaotech.chapter03.example.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student("小明", "河南考生", "男", 19, 98, 97);
        System.out.println(stu.message());
    }
}