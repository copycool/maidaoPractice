package cn.maidaotech.java07.chapter04.homework.exercise13;

public class Student implements Comparable<Student>{
    private int stuNumber;
    private String stuName;
    private double grade;
    public Student() {
    }
   
    public Student(int stuNumber, String stuName, double grade) {
        this.stuNumber = stuNumber;
        this.stuName = stuName;
        this.grade = grade;
    }

    public int getStuNumber() {
        return stuNumber;
    }
    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }
    
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [stuNumber=" + stuNumber + ", stuName=" + stuName + ", grade=" + grade + "]";

    }
    //成绩相同时学号较小的优先打印
    @Override
    public int compareTo(Student o) {
        
        return (int) (this.getGrade()!=o.getGrade()? this.getGrade()-o.getGrade():this.getStuNumber()-o.getStuNumber());
    }
  
    
}
