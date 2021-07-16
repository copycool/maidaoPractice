package cn.maidaotech.java07.chapter03;


public class Person {
    private String name;
    private Integer sex;
    private String address;
    private Integer age;

    public Person(String name, Integer sex, String address, Integer age) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
    }
    
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    
    
    
    
}