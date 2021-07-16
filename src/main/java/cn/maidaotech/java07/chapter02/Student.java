package cn.maidaotech.java07.chapter02;

import cn.maidaotech.java07.chapter03.Person;

public class Student extends Person {
    private Integer mathScore;
    private Integer englishScore;

    public Student(String name, Integer sex, String address, Integer age, Integer mathScore, Integer englishScore) {
        super(name, sex, address, age);
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String message() {
        return super.toString() + mathScore + englishScore;
    }
}