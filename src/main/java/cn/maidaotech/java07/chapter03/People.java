package cn.maidaotech.java07.chapter03;

public abstract class People {
    private String id; // 身份号
    private String name;// 姓名
    private int age; // 年龄

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //只能通过此方法访问name属性
    public String getName() {
        return name;
    }

    //只能通过此方法修改name属性
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}