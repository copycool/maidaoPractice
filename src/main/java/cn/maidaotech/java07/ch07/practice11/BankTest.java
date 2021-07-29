package cn.maidaotech.java07.ch07.practice11;

public class BankTest {
    public static void main(String[] args) throws Exception {
        BankTest test = new BankTest();
        Account account = new Account(100);
        Bank bank = new Bank();
        Thread a = new Thread(test.new A(bank, account), "A");
        Thread b = new Thread(test.new B(bank, account), "B");
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("账户余额：" + account.getBlance());
    }

    class A implements Runnable {
        private Bank bank;
        private Account account;

        public A(Bank bank, Account account) {
            super();
            this.bank = bank;
            this.account = account;

        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    bank.withdraw(account, 100);
                    System.out.println(Thread.currentThread().getName()+"汇款100元");
                    Thread.yield();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }


    class B implements Runnable {
        private Bank bank;
        private Account account;

        public B(Bank bank, Account account) {
            super();
            this.bank = bank;
            this.account = account;

        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    bank.remittance(account, 100);
                    System.out.println(Thread.currentThread().getName()+"取款100元");
                    Thread.yield();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

   


}