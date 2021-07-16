package cn.maidaotech.java07.work2.persion;

/**
 * 建立一个人类Person和学生类Student。功能如下：Person中含有4个私有成员变量姓名（name）、
 * 地址（address）、性别（sex）和年龄（age），
 * 用构造函数初始化这四个属性，以及一个方法message输出这些属性。Student类继承Person类，
 * 并增加成员数学(math)成绩和英语(english)成绩， 用一个6个参数的构造函数初始化属性，
 * 编写message方法用于显示6个属性。
 */
public abstract class Persion {
    private String name;
    private String address;
    private String sex;
    private Integer age;

    public Persion() {
    }

    public Persion(String name, String address, String sex, Integer age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    public abstract String message();

    @Override
    public String toString() {
        return "Persion [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}