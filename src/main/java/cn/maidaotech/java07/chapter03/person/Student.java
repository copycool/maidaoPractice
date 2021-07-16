package cn.maidaotech.java07.chapter03.person;

public class Student extends Person {
    private Integer mathScort;
    private Integer enScort;

    public Student(Integer mathScort, Integer enScort) {
        this.mathScort = mathScort;
        this.enScort = enScort;
    }

    public Student(String name, Integer age, String address, String gender, Integer mathScort, Integer enScort) {
        super(name, age, address, gender);
        this.mathScort = mathScort;
        this.enScort = enScort;
    }

    public Integer getMathScort() {
        return mathScort;
    }

    public void setMathScort(Integer mathScort) {
        this.mathScort = mathScort;
    }

    public Integer getEnScort() {
        return enScort;
    }

    public void setEnScort(Integer enScort) {
        this.enScort = enScort;
    }

    @Override
    public String toString() {
        return "Student [enScort=" + enScort + ", mathScort=" + mathScort + "]";
    }
    
    @Override
    public void message(){
        System.out.println("所在地："+this.getAddress()+"\n"+"姓名："+this.getName()+"\n"+"性别："
        +this.getGender()+"\n"+"年龄："+this.getAge()+"\n"+"数学分数："+this.getMathScort()
        +"\n"+"英语分数："+this.getEnScort());
    }

}
