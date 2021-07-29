package cn.maidaotech.java07.thread.bank;

public class Bank {
    private volatile Integer money = 230;

    public Bank() {
    }

    public Bank(Integer money) {
        this.money = money;
    }

    /**
     * 存钱
     * 
     * @param money 存储金额
     */
    public void stoageMoney(int money) {
        this.money += money;
    }

    /**
     * 取钱
     * 
     * @param money 所取金额
     */
    public void withdrawMoney(int money) {
        this.money -= money;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

}