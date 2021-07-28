package cn.maidaotech.chapter07.practice11;

public class PersonB extends Thread {
    Bank bank;
    String mode;

    public PersonB(Bank bank, String mode) {
        this.bank = bank;
        this.mode = mode;

    }

    @Override
    public void run() {
        while (bank.money >= 200) {
            try {
                bank.outMoney(200, mode);
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