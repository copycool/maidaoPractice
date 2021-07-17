package cn.maidaotech.java07;
/*
建立一个人类Person和学生类Student。
功能如下：Person中含有4个私有成员变量姓名（name）、地址（address）、性别（sex）和年龄（age），
用构造函数初始化这四个属性，以及一个方法message输出这些属性。Student类继承Person类，
并增加成员数学(math)成绩和英语(english)成绩，
用一个6个参数的构造函数初始化属性，编写message方法用于显示6个属性。

*/
public class Person {
    public String name;
    public String adress;
    public String sex;
    public int age;
    public static void main(String[] args) {
        Person person = new Person("小明","河南","男",18);
        person.message();
    }
    
    public Person(String name, String adress, String sex, int age) {
        this.name = name;
        this.adress = adress;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

    public void message() {
        System.out.println("姓名： "+name+ "  "+"地址：" +adress+"  "+"性别："+sex+"  "+"年龄："+age);
    }

    
}
class Student extends Person{
    private int math;
    private int english;
    public static void main(String[] args) {
        Student student = new Student("小明","河南","男",18,89,92);
        student.message();
    }
    public Student(String name, String adress, String sex, int age,int math,int english) {
        super(name, adress, sex, age);
        this.math=math;
        this.english=english;
    }

    public Student() {
        super();
    }
    @Override
    public void message() {
        // TODO Auto-generated method stub
        System.out.println("姓名： "+name+ "  "+"地址：" +adress+"  "+"性别："+sex+"  "
        +"年龄："+age+ "  "+"数学成绩:"+math+ "  "+"英语成绩:"+english);
        
    }
    
}