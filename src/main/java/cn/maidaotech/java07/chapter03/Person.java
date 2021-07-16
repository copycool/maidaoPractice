package cn.maidaotech.java07.chapter03;

public class Person {
    private String name;
    private String address;
    private String sex;
    private Integer age;
    public Person() {
    }
    public Person(String name, String address, String sex, Integer age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }
    public void message() {
        System.out.println("名字："+this.name);
        System.out.println("颜色："+this.address);
        System.out.println("年龄："+this.age);
        System.out.println("年龄："+this.sex);
    }
}
