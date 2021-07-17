package cn.maidaotech.java07.chapter03.practice04;

public class Dog {
    private String name;
    private String color;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, String color, Integer age) {
        super();// 默认调用Object构造器，可写可不写
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String message() {
        return new StringBuilder("有一只小狗很可爱，它的名字叫").append(this.name).append(",").append(this.color)
                .append("的毛发,摸起来软软的，现在").append(this.age).append("岁了。").toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}