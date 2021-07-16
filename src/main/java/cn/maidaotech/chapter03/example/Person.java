package cn.maidaotech.chapter03.example;

public class Person {
    protected String name;
    protected String addresss;
    protected String sex ;
    protected Integer age;
    
    public Person() {
    }

    public Person(String name, String addresss, String sex, Integer age) {
        this.name = name;
        this.addresss = addresss;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
}