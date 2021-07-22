package com.example.three.personAndStudent;

public class Student extends Person{
    private int math;
    private int english;

    public Student(){

    }

    public Student(String name, String address,int sex, int age,int math,int english){
        super(name,address,sex,age);
        this.math = math;
        this.english = english;
    }
    public String message(){
        return super.getAddress()+super.getName()+super.getAge()+super.getSex()+this.math+this.english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    
    
}