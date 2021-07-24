package cn.maidaotech.java07.chapter04.question13;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    private static List<Student> studentList = new ArrayList<>();

    static {
        init();
    }

    private static void init() {
        for (int i = 190101; i <= 190140; i++) {
            Student student = new Student(i, getRandomScore());
            studentList.add(student);
        }
    }

    private static Double getRandomScore() {
        Double score = (Math.random() * 50 + 50);

        BigDecimal b = new BigDecimal(score);
        score = b.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();

        return score;
    }

    public static void main(String[] args) {
        Collections.sort(studentList);
        for (int i = 0; i < studentList.size(); i++) {
            int order = i + 1;
            System.out.println("学生" + order + " " + studentList.get(i).getScore());
        }
    }
}