package cn.maidaotech.java07.chapter03.practice06;

public class Student extends Person {
    private Integer math;
    private Integer english;

    public Student() {
    }

    public Student(String name, String address, Byte sex, Integer age, Integer math, Integer english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    @Override
    public String message() {
        return new StringBuilder("姓名：").append(super.getName()).append("  性别：").append(getSex()).append("  年龄：")
                .append(getAge()).append("\n住址").append(getAddress()).append("\n数学：").append(this.getMath())
                .append("\n英语：").append(this.getEnglish()).toString();
    }

    public Integer getMath() {
        return this.math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getEnglish() {
        return this.english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

}