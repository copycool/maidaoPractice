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
    public static void outPut(Dog dog) {
        System.out.println("名字："+dog.name);
        System.out.println("颜色："+dog.color);
        System.out.println("年龄："+dog.age);
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
    
    
}
