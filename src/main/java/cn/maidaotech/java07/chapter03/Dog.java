package cn.maidaotech.java07.chapter03;

public class Dog {
    private String color;
    private String name;
    private int age;

    public Dog(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", color=" + color + ", name=" + name + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    

    
}