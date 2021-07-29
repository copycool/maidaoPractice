package cn.maidaotech.java07.chapter3.question6;

public class Person {
    private String name;
    private String adress;
    private String sex;
    private Integer age;

    public Person() {

    }

    public Person(String name, String address, String sex, Integer age) {
        this.name = name;
        this.adress = address;
        this.sex = sex;
        this.age = age;
    }

    public String message() {
        return ("名字： " + name + " 地址： " + adress + " 性别： " + sex + " 年龄：" + age);
        // System.out.println("名字： "+name+" 地址： "+adress+" 性别： "+sex+" 年龄："+age);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

}