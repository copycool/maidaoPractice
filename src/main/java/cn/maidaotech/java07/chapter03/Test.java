package cn.maidaotech.java07.chapter03;

public class Test {
    public static void main(String[] args) {

        Address address = new Address();
        address.setCountry("中国");
        address.setProvince("河南");
        address.setCity("洛阳市");
        address.setStreet("瀍河区");
        address.setPostCode("471000");
        System.out.println(address.toString());

        Dog[] dogs;
        dogs = new Dog[3];
        dogs[0] = new Dog("cookie", "yellow", 2);
        dogs[1] = new Dog("Tom", "black", 1);
        dogs[2] = new Dog("Marry", "white", 3);
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }

        Number number = new Number();
        System.out.println(number.plus(5, 10));
        System.out.println(number.minus(5, 10));
        System.out.println(number.multiply(5, 10));
        System.out.println(number.division(5, 0));
        System.out.println(number.division(5, 10));

        Person person = new Person("马壬赟", "洛宁", "男", 22);
        Student student = new Student(95, 96);
        student.setName(person.getName());
        student.setAddress(person.getAddress());
        student.setSex(person.getSex());
        student.setAge(person.getAge());
        System.out.println(student.message());

    }
}
