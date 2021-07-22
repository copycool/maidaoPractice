package cn.maidaotech.java07.chapter03.person;

public class Student extends Person {
    // private float mathScort;
    private Double mathScort;
    private Double enScort;

    @Override
    public String message() {
        return ("所在地：" + this.getAddress() + "\n" + "姓名：" + this.getName() + "\n" + "性别：" + this.getGender() + "\n"
                + "年龄：" + this.getAge() + "\n" + "数学分数：" + this.getMathScort() + "\n" + "英语分数：" + this.getEnScort());
    }

    public Student() {
    }

    public Student(String name, Integer age, String address, String gender, Double mathScort, Double enScort) {
        super(name, age, address, gender);
        this.mathScort = mathScort;
        this.enScort = enScort;
    }

    public Double getMathScort() {
        return mathScort;
    }

    public void setMathScort(Double mathScort) {
        this.mathScort = mathScort;
    }

    public Double getEnScort() {
        return enScort;
    }

    public void setEnScort(Double enScort) {
        this.enScort = enScort;
    }

}
