package cn.maidaotech.java07.chapter04.practice13;

public class Student implements Comparable<Student> {
    private Integer studentId;
    private String name;
    private Integer score;

    public Student(){

    }

    public Student(Integer studentId, String name, Integer score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "学号:" + studentId + "姓名:" + name + "成绩:" + score;
    }

    @Override
    public int compareTo(Student s) {
        if (!this.getScore().equals(s.getScore())) {
            return s.getScore() - this.getScore();
        } else {
            return this.getStudentId() - s.getStudentId();
        }

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

    
    
    
}