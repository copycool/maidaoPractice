package cn.maidaotech.java07.work3;



public class Dog {
    private String name;
    private String color;
    private String age;

    public Dog() {
    }

    public Dog(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", color=" + color + ", name=" + name + "]";
    }

    // public void output() {
    //     System.out.println(this.name + "的体色是：" + this.color + ",年龄是：" + this.age);

    // }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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

}
