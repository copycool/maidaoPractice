package cn.maidaotech.java07.chapter04.printScore;

public class Student implements Comparable<Student>{
    private Integer sno;
    private double score;

    public Student() {
    }

    public Student(Integer sno, double score) {
        this.sno = sno;
        this.score = score;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        
        if (this.score > o.score) {
            return -1;
        }
        if (this.score<o.score) {
            return 1;
        }
        return this.sno-o.sno;
    }

    

    
}