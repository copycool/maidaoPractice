package cn.maidaotech.chapter04.example13.service;

import java.util.Comparator;

import cn.maidaotech.chapter04.example13.model.Student;

public class StudentService implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore() == o2.getScore() ? o1.getStudentId() - o2.getStudentId() : o1.getScore() - o2.getScore();
    }

}