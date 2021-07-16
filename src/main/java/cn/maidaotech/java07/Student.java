package cn.maidaotech.unit3.Test;

public class Student extends People{    
    private String math;
    private String english;

    public Student() {
    }

    public Student(String name, String address, String sex, String age, String math, String english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

}