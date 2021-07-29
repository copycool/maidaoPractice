package cn.maidaotech.java07.chapter07.practice11;

public class ElevenTest {
    public static void main(String[] args) throws Exception {
        ElevenTest test = new ElevenTest();
        Account account = new Account(10000);
        Bank bank = new Bank();
        Thread a = new Thread(test.new A(bank, account), "A");
        Thread b = new Thread(test.new B(bank, account), "B");
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("账户余额：" + account.getBalance());
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
            try {
                for (int i = 0; i < 10000; i++) {
                    bank.remittance(account, 1);
                    System.out.println(Thread.currentThread().getName() + " 汇款1元");
                    Thread.yield();
                }
            } catch (Exception e) {
                e.printStackTrace();
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
            try {
                for (int i = 0; i < 10000; i++) {
                    bank.withdraw(account, 1);
                    System.out.println(Thread.currentThread().getName() + " 取款1元");
                    Thread.yield();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
