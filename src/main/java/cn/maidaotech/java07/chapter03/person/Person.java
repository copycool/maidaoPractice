package cn.maidaotech.java07.chapter03.person;

public class Person {
    private String name;
    private Integer age;
    private String address;
    private String gender;

    public Person() {
    }

    public Person(String name, Integer age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }

    public String message() {
        return this.getName() + this.address + this.gender + this.getAge();
    }
}
