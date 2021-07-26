package cn.maidaotech.java07.work.chapter07.question11;

public class UserTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //用户A
        new Thread(() -> {
            //取钱
            bank.drawMoneyByATM(200);
        }, "用户A").start();

        //用户B
        new Thread(() -> {
            //汇款
            bank.remittanceToOther(100);
        }, "用户B").start();

        

    }
}