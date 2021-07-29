package cn.maidaotech.java07.order.seventh.practice11;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(() -> { 
            bank.drawMoneyByATM(700);
        }, "用户A").start();
        new Thread(() -> {
            bank.remittanceToOther(400);
        }, "用户B").start();

        

    }

}
