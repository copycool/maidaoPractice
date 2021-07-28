package cn.maidaotech.java07.chapter07.practice11;

public class User implements Runnable {

    private String userName;
    private volatile Integer balance;
    private User otherUser;

    @Override
    public void run() {
        StringBuffer buffer = new StringBuffer();
        if (otherUser == null) {
            buffer.append(this.userName).append(" 开始向ATM机取款 100 元。");
            System.out.println(buffer.toString());
            Bank.AtmWithdrawMoney(100, this);
        } else {
            buffer.setLength(0);
            buffer.append(this.userName).append(" 开始通过柜台向 ").append(otherUser.getUserName()).append(" 汇款 100 元");
            System.out.println(buffer.toString());
            Bank.counterRemmittance(100, this, otherUser);
        }
    }

    public User(String userName, Integer balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public User(String userName, Integer balance, User otheUser) {
        this.userName = userName;
        this.balance = balance;
        this.otherUser = otheUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}