package cn.maidaotech.java07.chapter03.stuap;

// 建立一个人类 Person 和学生类 Student。
// 功能如下：Person 中含有 4 个私有成员变量
// 姓名（name）、 地址（address）、性别（sex）和年龄（age），
// 用构造函数初始化这四个属性，以及一个方法 输出这些属性。
// Student 类继承 Person 类，
// 并增加成员数学(math)成绩和英语(english)成绩，
// 用一 个 6 个参数的构造函数初始化属性，
// 编写 message 方法用于显示 6 个属性。
public class Person {
    String name;
    String address;
    String sex;
    int age;

    public Person(String name, String address, String sex, int age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
    }

   

 
}