package cn.maidaotech.java07.work3.person;

// Student类继承Person类，
// 并增加成员数学(math)成绩和英语(english)成绩，
public class Student extends Person {
    private double math, english;

    public Student() {
    }

    public Student(String name, String address, Byte sex, Integer age, double math, double english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    // message方法显示6个属性返回message信息
    public void studentmessage() {
        super.personmessage();
        System.out.println("数学成绩是" + math + "英语成绩是" + english);
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

}
