package cn.maidaotech.java07.chapter07;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;


/**
 * 用户A通过银行柜台向用户B的账户汇款，
 * 同时B在ATM机取钱：银行抽象为类，
 * 柜台汇款和ATM机取款抽象为方法用户A和B抽象为两个线程类
 * 确保A和B同时操作时B的账户金额的正确性
*/
public class Test11 {
    public static class Account {
        private AtomicInteger amount;
        private String name;
        public void name() {
            System.out.println("账户为：" + name + "!");
        }
        public boolean deposit(String threadName, int change) {//存款失败，线程结束
            amount.addAndGet(change); //调用AtomicInteger对象方法
            if (amount.get() > 2000) {//设置布尔型，控制线程的结束
                System.out.print("存款金额已经达到上限，存款失败");
                return false;
            }
            System.out.println("01：" + threadName + "开始存款，存款后余额为" + amount);
            return true;
        }

        public boolean withdraw(String threadName, int money) {
            if (amount.get() <= 0 || amount.get() < money) {
                System.out.println("账户金额小于0，取款失败");
                return false;
            } else {
                amount.addAndGet(-money);
                System.out.println("02：" + threadName + "开始取款，取款后余额为" + amount);
                return true;
            }
        }

        public void openAccount(String name, Integer money) {
            this.name = name;
            this.amount = new AtomicInteger(money);
            System.out.println(name + "开户成功！");
        }
    }

    public static class PersonDeposit implements Runnable {
        private Account account;//添加类属性，方便调用类方法
        private int deposit;
        public void deposit(Account account, int deposit) {
            this.account = account;
            this.deposit = deposit;
        }

        @Override
        public void run() {//run怎样结束的？？？
            String threadName = Thread.currentThread().getName();
            while (true) {
                if (account.amount.get() < 2000) {//账户金额不能大于2000
                    boolean isFlag = account.deposit(threadName, deposit);//把钱存了，根据存钱函数的返回值再决定线程让步不让步
                    if (!isFlag) {   //存钱失败，跳出while
                        break;
                    }
                    try {
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static class PersonWithdraw implements Runnable {
        private Account account;    //账户
        private int withdraw;       //取款金额
        public void withdraw(Account account, int withdraw) {
            this.account = account;
            this.withdraw = withdraw;
        }
        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            while (true) {
                if (account.amount.get() > 0) {
                    boolean isFlag = account.withdraw(threadName, withdraw);//有钱可取就取，取完跳出while
                    if (!isFlag) {//
                        break;      
                    }              
                    try {//存钱成功就休眠
                        Thread.sleep(new Random().nextInt(1000));//让步时间随机
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                } else {

                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        Account account = new Account();
        account.openAccount("妈妈", 1000);

        PersonDeposit p1 = new PersonDeposit();
        p1.deposit(account, 50);
        Thread depositThread = new Thread(p1, "姥姥");

        PersonWithdraw p2 = new PersonWithdraw();
        p2.withdraw(account, 99);
        Thread withdrawThread = new Thread(p2, "女儿");

        depositThread.start();
        withdrawThread.start();

    }
}