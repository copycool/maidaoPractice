package cn.maidaotech.java07.chapter03.stuap;

public class Student extends Person{
    double math;
    double english;
    public Student(String name, String address, String sex, int age, double math, double english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    public Student() {
    }
    
    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ",age=" + age + ",  sex=" + sex + ",address=" + address + ", english=" + english + ", math=" + math + "]";
    }

}