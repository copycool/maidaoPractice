package cn.maidaotech.java07.work7.test11;

//转钱和取钱方法的构造
public class Bank {

    // 取钱
    public void drawmoney(Account account, int amount) throws Exception {

        if (account == null) {
            throw new Exception("The account is invalid.");
        }
        if (amount <= 0) {
            throw new Exception("The amount is invalid.");
        }
        synchronized (account) {
            account.setBlance(account.getBlance() - amount);
        }
    }

    // 汇款
    public void remittance(Account account, int amount) throws Exception {

        if (account == null) {
            throw new Exception("The account is invalid.");
        }
        if (amount <= 0) {
            throw new Exception("The amount is invalid.");
        }
        synchronized (account) {
            account.setBlance(account.getBlance() + amount);
        }
    }

}
