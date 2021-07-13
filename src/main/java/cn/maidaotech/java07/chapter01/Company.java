package cn.maidaotech.java07.chapter01;

public class Company {
    public String name;//共有实例变量
    protected Integer id;//只能在本类或子类中访问的实例变量
    private String address;// 私有变量，只能在本类访问

    //在构造方法中给name赋值
    public Company(String companyName){
        name = companyName;
    }
    //给address赋值 getter and setter

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
}


