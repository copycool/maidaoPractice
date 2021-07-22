package cn.maidaotech.java07.unit4.Practice13;

public class Student implements Comparable<Student> {
    private Integer studengtId;
    private String name;
    private Integer score;

    public Student() {
    }

    public Student(Integer studengtId, String name, Integer score) {
        this.studengtId = studengtId;
        this.name = name;
        this.score = score;
    }

    public Integer getStudengtId() {
        return studengtId;
    }

    public void setStudengtId(Integer studengtId) {
        this.studengtId = studengtId;
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
    public int compareTo(Student s) {
        // TODO Auto-generated method stub
       if(!this.getScore().equals(s.getScore())){
           return s.getScore()-this.getScore();
       }else{
           return this.getStudengtId()-s.getStudengtId();
       }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "学号：" + studengtId + "姓名：" + name + "成绩：" + score;

    }
}