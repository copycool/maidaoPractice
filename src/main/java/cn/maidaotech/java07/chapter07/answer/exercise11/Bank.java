package cn.maidaotech.java07.chapter07.answer.exercise11;

public class Bank {
    public void remittance(Account account, Integer amount) {
        if (account == null) {
            System.out.println("account is invalid");
        }
        if (amount == null || amount < 0) {
            System.out.println("amount is invalid");
        }
        synchronized (account) {
            account.setBalance(account.getBalance() + amount);
        }
    }

    public void withDraw(Account account, Integer amount) {
        if (account == null) {
            System.out.println("account is invalid");
        }
        if (amount == null || amount < 0) {
            System.out.println("amount is invalid");
        }
        if (account.getBalance().compareTo(amount) < 0) {
            System.out.println("balance is not enough");
        }
        synchronized (account) {
            account.setBalance(account.getBalance() - amount);
        }
    }
}
