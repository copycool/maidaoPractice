package cn.maidaotech.java07.people;

public class PeopleText {
    public static void main(String[] args){
//建立一个人类 Person 和学生类 Student。功能如下：Person 中含有 4 个私有成员变量姓名（name）、 
//地址（address）、性别（sex）和年龄（age），用构造函数初始化这四个属性，以及一个方法 
//输出这些属性。Student 类继承 Person 类，并增加成员数学(math)成绩和英语(english)成绩，用一 
//个 6 个参数的构造函数初始化属性，编写 message 方法用于显示 6 个属性 
        Student student = new Student();
        student.name="王";
        student.address="河南";
        student.sex="男";
        student.age=23;
        student.math=90;
        student.english=100;
        System.out.println(student.message());
    }
}
class Person{
    public String name;
    public String address;
    public String sex;
     public int age;
    
    
    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
    }
}
class Student extends Person{
    
    int math;
    int english;
    public Student(){}
    public  Student(String name,String address,String sex,int age,int math,int english){
        this.name=name;
        this.address=address;
        this.sex=sex;
        this.age=age; 
        this.math=math;
        this.english=english; 
    }
    public String message(){
        return "student [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + ",math="+math+",englih="+english;
    }
}
      
    




    
    
        
    


