package cn.maidaotech.java07.work2.persion;

public class Student extends Persion {
    private double math;
    private double english;

    public Student() {

    }

    public Student(String name, String address, String sex, Integer age, double math, double english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    @Override
    public String message() {
        return "{姓名：" + super.getName() + "  地址：" + super.getAddress() + "  性别：" + super.getSex() + "年龄：" + super.getAge()
                + "  数学成绩：" + this.math + "  英语成绩：" + this.english + "}";
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