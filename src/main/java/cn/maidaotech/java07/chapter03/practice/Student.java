package cn.maidaotech.java07.chapter03.practice;

public class Student extends Person {
    private Integer mathScore;
    private Integer englishScore;

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

    public Student(String name, String address, String sex, Integer age, Integer mathScore, Integer englishScore) {
        super(name, address, sex, age);
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String message() {
        return "Student [address=" + super.getAddress() + ", age=" + super.getAge() + ", name=" + super.getName()
                + ", sex=" + super.getAge() + ", mathScore=" + this.mathScore + ", englishScore=" + this.englishScore
                + "]";
    }

}