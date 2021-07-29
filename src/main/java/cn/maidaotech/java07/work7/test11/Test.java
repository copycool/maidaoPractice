package cn.maidaotech.java07.work7.test11;

public class Test {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        Account account = new Account(10000);
        Bank bank = new Bank();
        Thread a = new Thread(test.new A(bank, account, 20), "A");
        Thread b = new Thread(test.new B(bank, account, 10), "B");
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("账户余额：" + account.getBlance());
    }

    class A implements Runnable {
        private Bank bank;
        private Account account;
        private int x;

        public A(Bank bank, Account account, int x) {
            super();
            this.bank = bank;
            this.account = account;
            this.x = x;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < x; i++) {
                    bank.remittance(account, 1);
                    // System.out.println(Thread.currentThread().getName() + " 汇款1元");
                    Thread.yield();//就绪状态
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 汇款" + x + "元");
        }
    }

    class B implements Runnable {
        private Bank bank;
        private Account account;
        private int x;

        public B(Bank bank, Account account, int x) {
            super();
            this.bank = bank;
            this.account = account;
            this.x = x;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < x; i++) {
                    bank.drawmoney(account, 1);
                    // System.out.println(Thread.currentThread().getName() + " 取款1元");
                    Thread.yield();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 取款" + x + "元");
        }

    }

}
