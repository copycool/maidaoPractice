package com.example.demo.three;

public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void print(){
        System.out.println("狗的名字:" + name + "狗的颜色:" + color + "狗的年龄:" + age);
    }
    
}
