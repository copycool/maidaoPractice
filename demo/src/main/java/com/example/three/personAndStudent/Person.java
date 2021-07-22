package com.example.three.personAndStudent;

public class Person {
    private String name;
    private String address;
    private int sex;
    private int age;
    public Person(){

    }
    public Person(String name, String address, int sex,int age){
        this.name = name;
        this.address  = address;
        this.sex = sex;
        this.age = age;
    }
    public String message(){
        return this.name + this.address +this.sex +this.age;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}