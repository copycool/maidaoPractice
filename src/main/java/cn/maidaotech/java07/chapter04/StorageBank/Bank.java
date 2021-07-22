package cn.maidaotech.java07.chapter04.StorageBank;

import java.util.HashMap;

public class Bank {
    //编写一个程序，创建一个HashMap对象，
    //用于存储银行储户的信息（其中储户的主要信息有储户的ID、姓名和余额）。另外，根据储户ID获取其余额信息。
    
    private String ID;
    private String name;
    private Integer balance;

    public Bank() {
    }

    public Bank( String ID, String name, Integer balance) {
        
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }    

    @Override
    public String toString() {
        return "Bank [balance=" + balance + ", id=" + ID + ", name=" + name + "]";
    }

}