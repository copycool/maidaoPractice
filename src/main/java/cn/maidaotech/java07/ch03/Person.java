package cn.maidaotech.java07.ch03;

public class Person {
    private String name;
    private String address;
    private String sex;
    private String age;

    public Person(){
    //     System.out.println("");

    }
    public Person(String name,String address,String sex,String age){
        this.name=name;
        this.address=address;
        this.sex=sex;
        this.age=age;
        // System.out.println("");
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
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    
    public String message() {
        return "Person [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
    }
    
}

