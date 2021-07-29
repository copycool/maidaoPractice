package cn.maidaotech.java07.seven.bank;

public class Text {
    public static void main(String[] args) throws Exception {
        Text text=new Text();
        Account account=new Account(10);
        Bank bank=new Bank();
        Thread a=new Thread(text.new A(bank,account),"A");
        Thread b=new Thread(text.new B(account,bank),"B");
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("账户余额"+account.getBalance());
    }
    class A implements Runnable{
        private Bank bank;
        private Account account;
        public A(Bank bank,Account account){
            super();
            this.account=account;
            this.bank=bank;
        }
        @Override
        public void run() {
            
            try {
                for(int i=0;i<=10;i++){
                    bank.Deposit(account,1);
                    System.out.println(Thread.currentThread().getName()+"汇款1元");
                    Thread.yield();
                }
            } catch (Exception e) {               
            }
        }
    }
    class B implements Runnable{
         private Bank bank;
        private Account account;
       
        public B(Account account,Bank bank){
            super();
            this.account=account;
            this.bank=bank;
        }
        @Override
        public void run() {
            
            try {
                for(int i=0;i<=10;i++){
                    bank.WithDraw (account,1);
                    System.out.println(Thread.currentThread().getName()+"取款1元");
                    Thread.yield();
                }
            } catch (Exception e) { 
                e.printStackTrace();              
            }
        }   
    }
}
