package cn.maidaotech.java07.chaptet03;

public class Person {
    private String name;
    private String address;
    private String sex;
    private int age;
    public Person(){

    }

 public Person(String name,String address,String sex,int age){
     this.name = name;
     this.address = address;
     this.sex = sex;
     this.age = age;
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