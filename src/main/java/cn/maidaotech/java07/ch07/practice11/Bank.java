package cn.maidaotech.java07.ch07.practice11;

// 用户 A 通过银行柜台向用户 B 的账户汇款，同时 B 在 ATM 机取钱：
//  a. 银行抽象为类，柜台汇款和 ATM 机取款抽象为方法 
//  a. 用户 A 和 B 抽象为两个线程类 
//  b. 确保 A 和 B 同时操作时 B 的账户金额的正确性
public class Bank {
    public void remittance(Account account, Integer amount) throws Exception {
        if (account == null) {
            throw new Exception("用户不存在！");
        }
        if (amount == null || amount <= 0) {
            throw new Exception("账户余额不合法！");
        }
        synchronized (account) {
            account.setBlance(account.getBlance() + amount);
        }

    }

    public void withdraw(Account account, Integer amount) throws Exception {
        if (account == null) {
            throw new Exception("用户不存在！");
        }
        if (amount == null || amount <= 0) {
            throw new Exception("账户余额不合法！");
        }
        if (account.getBlance().compareTo(amount) < 0) {
            throw new Exception("账户余额不足");
        }
        synchronized (account) {
            account.setBlance(account.getBlance() - amount);
        }

    }
}