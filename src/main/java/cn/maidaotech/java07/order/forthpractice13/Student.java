package cn.maidaotech.java07.order.forthpractice13;

public class Student implements Comparable<Student> {
    private Integer studentId;
    private Integer score;

    public Student() {
    }

    public Student(Integer studentId,  Integer score) {
        this.studentId = studentId;
        this.score = score;
    }

    @Override
    public String toString() {
        return "学号:" + studentId +"成绩:" + score;
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

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}


