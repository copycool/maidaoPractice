package cn.maidaotech.chapter04.example13.model;

public class Student {
    private Integer studentId;
    private String name;
    private Integer score;

    public Student() {
    }

    public Student(Integer studentId, String name, Integer score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "学生姓名为" + name + "；学生成绩为" + score + "； 学生学号为" + studentId + "。";
    }
    
}