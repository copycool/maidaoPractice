package cn.maidaotech.java07.chapter03;

public class Student extends Person{
    //Student类继承Person类，并增加成员数学(math)成绩和英语(english)成绩，
    //用一个6个参数的构造函数初始化属性，编写message方法用于显示6个属性。
    private int math;
    private int english;

    public Student(String name, String address, String sex, int age, int math, int english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    
    public Student(String name, String address, String sex, int age) {
        super(name, address, sex, age);
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

    public void message(){
        System.out.println("姓名是："+this.getName()+"地址是："+this.getAddress()+
        "性别是："+this.getSex()+"年龄是："+this.getAge()+"数学成绩："+this.getMath()+"英语成绩："+this.getEnglish());
    }

}