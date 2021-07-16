package cn.maidaotech.java07;

public class Dog {
    public static void main(String[] args) {
// 设计一个 Dog 类，有名字，颜色，年龄等属性，定义构造方法来初始化类的这些属性， 定义 
// 一个方法输出 Dog 信息。编写测试类，创建一个 Dog 类型的数组，遍历数组输出元素信息。 
Dog1 d1=new Dog1("小花","白",4);

System.out.println(d1.toString());
    }
}
class Dog1{
    String name;
    String color;
    int age;
    public Dog1(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Dog age:" + age + ", color:" + color + ", name:" + name + "]";
    }
}
   

