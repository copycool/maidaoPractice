package cn.maidaotech.java07.chapter03;

public class Dog {
    private String color;
    private String name;
    private Integer age;

    public Dog() {
        
    }

    public Dog(String color, String name, Integer age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }
    public String message(){
        return new StringBuilder("有一只小狗很可爱，它的名字叫").append(this.name).append(",").append(this.color)
        .append("的毛发,摸起来软软的，现在").append(this.age).append("岁了。").toString();

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    
}