package cn.maidaotech.java07.chapter04.test13_student;

public class Student implements Comparable<Student> {
    private Integer studentId;
    private String name;
    private Integer score;

    public Student() {
    }

    @Override
    public int compareTo(Student s) {
        if (this.score == s.score) {
            return this.studentId - s.studentId;
        } else {
            return s.score - this.score;
        }
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
        return "Student [name=" + name + ", score=" + score + ", studentId=" + studentId + "]";
    }
}
