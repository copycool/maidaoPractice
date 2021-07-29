package cn.maidaotech.java07.chapter07.practice11;

public class Bank {

    public void remittance(Account account, Integer amount) throws Exception {
        if (account == null) {
            throw new Exception("The account is invalid.");
        }
        if (amount == null || amount <= 0) {
            throw new Exception("The amount is invalid.");
        }
        synchronized (account) {
            account.setBalance(account.getBalance() + amount);
        }
    }

    public void withdraw(Account account, Integer amount) throws Exception {
        if (account == null) {
            throw new Exception("The account is invalid.");
        }
        if (amount == null || amount <= 0) {
            throw new Exception("The amount is invalid.");
        }
        if (account.getBalance().compareTo(amount) < 0) {
            throw new Exception("The balance is not enough.");
        }
        synchronized (account) {
            account.setBalance(account.getBalance() - amount);
        }
    }
}
