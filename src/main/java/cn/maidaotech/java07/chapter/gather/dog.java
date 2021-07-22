package cn.maidaotech.java07.chapter.gather;

public class dog {
   // //设计一个Dog类，有名字，颜色，年龄等属性，
    //定义构造方法来初始化类的这些属性， 定义一个方法输出Dog信息。
    //编写测试类，创建一个Dog类型的数组，遍历数组输出元素信息。
    private String name;
    private String color;
    private int age;

    public dog() {
    }

    public dog(String name, String color, int age) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 
    public void print(){
        System.out.println(name+"是"+color+"色的，今年"+age+"岁了");
    }


}