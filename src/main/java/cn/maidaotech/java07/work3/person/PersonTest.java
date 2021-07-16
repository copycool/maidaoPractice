package cn.maidaotech.java07.work3.person;

import cn.maidaotech.java07.work3.Person;

// Student类继承Person类，
// 并增加成员数学(math)成绩和英语(english)成绩，
// 用一个6个参数的构造函数初始化属性，
// 编写message方法用于显示6个属性。
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("李明", "河南", (byte) 0, 15);
        Person person2 = new Person("王明", "河南", (byte) 1, 16);
        person1.personmessage();
        person2.personmessage();
        Student student1 = new Student("李明", "河南", (byte) 0, 15, 78, 99);

        student1.studentmessage();
    }

}
