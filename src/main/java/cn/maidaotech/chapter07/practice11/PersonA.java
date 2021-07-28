package cn.maidaotech.chapter07.practice11;

public class PersonA extends Thread {

    Bank bank;
    String mode;

    public PersonA(Bank bank, String mode) {
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run() {
        while (bank.money >= 100) {
            try {
                bank.outMoney(100, mode);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}