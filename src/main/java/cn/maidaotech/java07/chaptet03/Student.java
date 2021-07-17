package cn.maidaotech.java07.chaptet03;

public class  Student extends Person{
    private int math;
    private int english;

    public Student(String name,String address,String sex,int age,int math,int english){
        super(name,address,sex,age);
        this.english=english;
        this.english=english;
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

    
    public String message() {
        return "Student [english=" + english + ", math=" + math +", name=" + getName() + ",address = "+ getAddress() +",sex= "+ getSex() + ", age=" + getAge()+"]";
    }
}