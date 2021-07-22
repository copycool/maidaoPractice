package cn.maidaotech.java07.chapter03.person;

/**
 * 建立一个人类Person和学生类Student。
 * 功能如下：Person中含有4个私有成员变量姓名（name）、地址（address）、性别（sex）和年龄（age），
 * 用构造函数初始化这四个属性，以及一个方法message输出这些属性。Student类继承Person类，
 * 并增加成员数学(math)成绩和英语(english)成绩，用一个6个参数的构造函数初始化属性， 编写message方法用于显示6个属性。
 */
public class Test {
    public static void main(String[] args) {
        Student stu = new Student("小明", 20, "河南郑州", "男", 90.0, 100.0);
        String msg = stu.message();
        System.out.println(msg);
    }
}
