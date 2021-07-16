package cn.maidaotech.java07.chapter03;

import cn.maidaotech.java07.chapter02.Student;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("中国", "河南", "郑州", "中国", 7777);
        System.out.println(address.toString());

        Dog[] dogs = new Dog[10];
        for (int i = 0; i < 10; i++) {
            dogs[i] = new Dog("白色" + i, "阿伟" + i, i);

        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].toString());

        }

        Number number = new Number(0, 5);
        System.out.println(number.plus());
        System.out.println(number.division());
        System.out.println(number.multiply());
        System.out.println(number.minus());

        Person message = new Person("666", 0, "11111", 112);
        System.out.println(message.toString());
        Student student = new Student("name", 1, "sdf", 1, 14, 14);
        System.out.println(student.message());
    }

}