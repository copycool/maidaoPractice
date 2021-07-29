package cn.maidaotech.java07.chapter07.answer.exercise11;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        Account account = new Account(1000);
        Bank bank = new Bank();
        Thread threadA = new Thread(demo.new A(bank, account), "A");
        Thread threadB = new Thread(demo.new B(bank, account), "B");
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
        System.out.println("账户余额为" + account.getBalance());
    }

    class A implements Runnable {
        private Bank bank;
        private Account account;

        public A(Bank bank, Account account) {
            this.bank = bank;
            this.account = account;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 100; i++) {
                    bank.remittance(account, 1);
                    System.out.println(Thread.currentThread().getName() + "汇款1元");
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
            this.bank = bank;
            this.account = account;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 100; i++) {
                    bank.withDraw(account, 1);
                    System.out.println(Thread.currentThread().getName() + "取款1元");
                    Thread.yield();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
