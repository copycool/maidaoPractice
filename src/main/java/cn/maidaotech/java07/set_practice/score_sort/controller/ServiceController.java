package cn.maidaotech.java07.set_practice.score_sort.controller;

import java.util.List;
import java.util.Map;

import cn.maidaotech.java07.set_practice.score_sort.model.Student;
import cn.maidaotech.java07.set_practice.score_sort.service.StudentService;
import cn.maidaotech.java07.set_practice.score_sort.service.StudentServiceImpl;

public class ServiceController {
    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl();
        Map<Integer, Student> map = service.infoInit();
        List<Map.Entry<Integer, Student>> list = service.infoSort(map);
        list.forEach(v -> {
            System.out.println("学号：\t" + v.getKey() + "\t 姓名：\t" + v.getValue().getName() + "\t 成绩为：\t"
                    + v.getValue().getScore() + "分");
        });
    }
}