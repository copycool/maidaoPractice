package cn.maidaotech.java07;

public class Dog {
    private String name;
    private String colour;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Dog(String name, String colour, int age) {
            this.name=name;
            this.colour=colour;
            this.age=age;
    }
    
}