package cn.maidaotech.chapter03.example;

public class Dog {
    String name;
    String color;
    Integer age;

    // 构造函数
    public Dog() {

    }

    // 构造函数
    public Dog(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String dogMessage() {
        return "狗狗的名字是" + this.name + "，狗狗的颜色是" + this.color + "，狗狗的年龄是" + this.age;
    }
}