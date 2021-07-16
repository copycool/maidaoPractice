package cn.maidaotech.chapter03.example;

public class Student extends Person {
    private Integer mathScore;
    private Integer englishScore;

    public Student() {

    }

    public Student(String name, String addresss, String sex, Integer age, Integer mathScore, Integer englishScore) {
        this.name = name;
        this.addresss = addresss;
        this.sex = sex;
        this.age = age;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    public Integer getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }

    public String message() {
        return "信息如下：" + "姓名：" + name + "；地址：" + addresss + "；性别：" + sex + "；年龄：" + age + "；数学成绩：" + mathScore + "；英语成绩：" + englishScore;
    }
}