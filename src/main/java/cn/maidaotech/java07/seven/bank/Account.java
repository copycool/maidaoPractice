package cn.maidaotech.java07.seven.bank;

public class Account {
    
private Integer balance;
    
    public Account(Integer initbalance){
        this.balance=initbalance;
    }
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    
}
