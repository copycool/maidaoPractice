package cn.maidaotech.java07.chapter03;

public class Student extends Person {
    private double mathGrade;
    private double englishGrade;

    public Student() {
    }

    public Student(double mathGrade, double englishGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    public Student(String name, String address, String sex, Integer age, double mathGrade, double englishGrade) {
        super(name, address, sex, age);
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    @Override
    public String toString() {
        return "Student [englishGrade=" + englishGrade + ", mathGrade=" + mathGrade + "]";
    }

    public String message() {
        String name = super.getName();
        String address = super.getAddress();
        String sex = super.getSex();
        Integer age = super.getAge();
        return "message : name=" + name + ", address=" + address + ", sex=" + sex + ", age=" + age + ", englishGrade="
                + englishGrade + ", mathGrade=" + mathGrade;
    }
}
