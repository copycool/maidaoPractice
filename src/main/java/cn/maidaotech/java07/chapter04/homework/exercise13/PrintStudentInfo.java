package cn.maidaotech.java07.chapter04.homework.exercise13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PrintStudentInfo {
    // 某班有40个学生，学号为190101~190140，
    // 全部参加Java集合阶段测试，给出所有同学的成绩（可随机产生，范围为50~100），
    // 请编写从程序将本班各位同学的成绩从高到低排序打印输出。
    // 注：成绩相同时学号较小的优先打印，打印的信息包括学号、姓名（统一为“学生i”[i=1，2，3，4，...，40]）和成绩。
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int stuNo = 190100;
        for (int i = 1; i <= 40; i++) {
            students.add(new Student(++stuNo, "学生" + i, new Random().nextInt(51) + 50));
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println("------------------------");

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }

}
