package cn.maidaotech.java07.work4.Test13;

import java.util.Comparator;
public class Student implements Comparable<Student> {
    private Integer stuid;
    private String name;
    private int score;

    public Student() {
    }

    public Student(Integer stuid, String name, int score) {

        this.stuid = stuid;
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {

        if (this.getScore()== student.getScore()) {
            return student.getScore() - this.getScore();
        }else{
            return this.getStuid() - student.getScore();
        }
           
    }

    @Override
    public String toString() {
        return "学号："+stuid +"  名字："+ name+"    分数：" + score;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


  
    
}
