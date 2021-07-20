package cn.maidaotech.java07.chapter03.forDog;

public class Dog {
    private String name;
    private Integer age;
    private String color;

    public Dog() {
    }
    
    public Dog(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", color=" + color + ", name=" + name + "]";
    }



    
    
}
