package cn.maidaotech.java07.chapter3.question4;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String print() {
        // System.out.println("名字："+name+" 颜色： "+color+" 年龄："+age);
        return ("名字：" + name + " 颜色： " + color + " 年龄：" + age);
    }

    public static void main(String[] args) {
        Dog[] dog = new Dog[3];
        dog[0] = new Dog("xiaoming", "白色", 10);
        dog[1] = new Dog("xiaoming", "白色", 10);
        dog[2] = new Dog("xiaoming", "白色", 10);
        for (Dog dog2 : dog) {
            System.out.println(dog2.print());
        }

    }

}
