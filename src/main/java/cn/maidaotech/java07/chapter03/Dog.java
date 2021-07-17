package cn.maidaotech.java07.chapter03;

public class Dog {
    private String name;
    private String color;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Dog [age=" + age + ", color=" + color + ", name=" + name + "]";
    }

}
