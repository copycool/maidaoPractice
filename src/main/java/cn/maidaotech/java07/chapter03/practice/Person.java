package cn.maidaotech.java07.chapter03.practice;

public class Person {
    private String name;
    private String address;
    private String sex;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
    }

    public Person(String name, String address, String sex, Integer age) {
        super();
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }
    
}