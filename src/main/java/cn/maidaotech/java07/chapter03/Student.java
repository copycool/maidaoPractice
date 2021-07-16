package cn.maidaotech.java07.chapter03;

public class Student extends Person{
    private Integer math;
    private Integer english;
   
    public Student() {
    }
    public Student(Integer math, Integer english) {
        this.math = math;
        this.english = english;
    }
    public Student(String name, String address, String sex, Integer age, Integer math, Integer english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }
    @Override
    public void message() {
        // TODO Auto-generated method stub
        super.message();
        System.out.println("数学："+this.getMath());
        System.out.println("英语："+this.getEnglish());
    }
    public Integer getMath() {
        return math;
    }
    public void setMath(Integer math) {
        this.math = math;
    }
    public Integer getEnglish() {
        return english;
    }
    public void setEnglish(Integer english) {
        this.english = english;
    }
   
   
    
}
