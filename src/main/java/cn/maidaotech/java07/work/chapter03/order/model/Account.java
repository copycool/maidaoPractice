package cn.maidaotech.java07.work.chapter03.order.model;

import java.math.BigDecimal;

public class Account {
    
    private Integer accountId;    //账户id

    private String username;      //账户姓名

    private String phone;         //手机号

    private String email;         //邮箱

    private BigDecimal balance;   //余额

    private String address;       //地址

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", address=" + address + ", balance=" + balance + ", email=" + email
                + ", phone=" + phone + ", username=" + username + "]";
    }

    
}