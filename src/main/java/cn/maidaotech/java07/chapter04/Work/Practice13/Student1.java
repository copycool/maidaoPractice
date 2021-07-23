package cn.maidaotech.java07.chapter04.Work.Practice13;

import java.util.ArrayList;
import java.util.List;

public class Student1 implements Comparable<Student1> {
    String name;
    Integer score;
    Integer studendId;

    public static List<Student1> init(Integer startBound, Integer endBound) {
        List<Student1> list = new ArrayList<>();
        for (int i = startBound; i <= endBound; i++) {
            int score = (int) (Math.random() * 50 + 51);
            list.add(new Student1("李" + i % 100, score, i));
        }
        return list;
    }

    @Override
    public int compareTo(Student1 o) {
        if (!this.getScore().equals(o.getScore())) {
            return o.getScore() - this.getScore();
        }
        if (!this.getStudendId().equals(o.getStudendId())) {
            return this.getStudendId()- o.getStudendId();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "学生 [姓名=" + name + ", 成绩=" + score + ", 学号=" + studendId + "]";
    }

    public Student1() {
    }

    public Student1(String name, Integer score, Integer studendId) {
        this.name = name;
        this.score = score;
        this.studendId = studendId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStudendId() {
        return studendId;
    }

    public void setStudendId(Integer studendId) {
        this.studendId = studendId;
    }

}
