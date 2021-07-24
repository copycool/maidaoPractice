package cn.maidaotech.java07.chapter04.question13;

public class Student implements Comparable<Student> {
    private Integer sno;
    private Double score;

    public Student(Integer sno, Double score) {
        this.sno = sno;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score > o.getScore())
            return -1;

        if (this.score < o.getScore())
            return 1;

        return this.sno - o.sno;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}