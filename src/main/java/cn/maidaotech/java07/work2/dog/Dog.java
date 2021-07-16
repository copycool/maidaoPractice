package cn.maidaotech.java07.work2.dog;

public class Dog {
    private String name;
    private String color;
    private Integer age;
    private String variety;

    public Dog() {
    }

    public Dog(String name, String color, Integer age, String variety) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Dog [name=" + this.name + ", color=" + this.color + ", age=" + this.age + ", variety=" + this.variety
                + "]";
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

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

}