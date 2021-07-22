package cn.maidaotech.java07.work4.Test12;

public class Bank {
    private String name;
    private Integer userid;;
    private Integer balance;

    public Bank() {
    }

    public Bank(Integer userid, String name, Integer balance) {
        this.name = name;
        this.userid = userid;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "用户id：" + userid+"   ，名字："+name+"  ，余额： "+balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

}
