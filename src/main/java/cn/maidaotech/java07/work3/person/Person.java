package cn.maidaotech.java07.work3.person;

// Person中含有4个私有成员变量姓名（name）、地址（address）、
// 性别（sex）和年龄（age），
// 用构造函数初始化这四个属性，
// 以及一个方法message输出这些属性
public class Person {
    private String name;
    private String address;
    private byte sex;
    private Integer age;

    public Person() {
    }

    public Person(String name, String address, Byte sex, Integer age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    // 方法message输出这些属性
    public void personmessage() {

        System.out.println("名字是：" + this.name + ",地址是：" + this.address + ",性别：" + this.sex + ",年龄：" + this.age);
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

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
