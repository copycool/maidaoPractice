package cn.maidaotech.java07.chapter03;

public class Person {
    //Person中含有4个私有成员变量姓名（name）、地址（address）、性别（sex）和年龄（age），
    //用构造函数初始化这四个属性，以及一个方法message输出这些属性。
    private String name;
    private String address;
    private String sex;
    private int age;

    public Person(String name, String address, String sex, int age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void message(){
        System.out.println("姓名是："+this.getName()+"地址是："+this.getAddress()+"性别是："+this.getSex()+"年龄是："+this.getAge());
    }
    
}