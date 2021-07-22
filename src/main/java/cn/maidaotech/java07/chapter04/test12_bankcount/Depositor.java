package cn.maidaotech.java07.chapter04.test12_bankcount;

public class Depositor {
    private String username;
    private Double balance;

    public Depositor() {
    }

    public Depositor(String username, Double balance) {
        this.username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
}
