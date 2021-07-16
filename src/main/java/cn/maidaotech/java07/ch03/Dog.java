package cn.maidaotech.java07.ch03;


public class Dog {
    private String name;
    private String color;
    private String age;

    public Dog() {
        // System.out.println("调用无参构造");
    }

    public Dog(String name, String color, String age) {
        // System.out.println("调用有参构造");
        this.name = name;
        this.color = color;
        this.age = age;
    }
    // public static void main(final String[] args) {
    //     final Dog pipi=new Dog();
    //      pipi.setName("皮皮");
    //      pipi.setColor("白色");
    //      pipi.setAge("3岁");

    //      System.out.println(pipi.toString());
    // }

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", color=" + color + ", name=" + name + "]";
    }
    
}
