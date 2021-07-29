package cn.maidaotech.java07.thread.bank;

public class User implements Runnable {
    private Bank bank;
    // 存储金额
    private final Integer STORAGE_MOEY = 300;
    // 取款金额
    private final Integer GET_MONEY = 200;

    private Integer count = 0;

    public User() {
    }

    public User(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            if (bank == null) {
                break;
            }
            /**
             * 先存后取
             */
            if (count >= 20) {
                break;
            }
            if ("用户A".equals(Thread.currentThread().getName())) {
                synchronized (bank) {
                    bank.stoageMoney(STORAGE_MOEY);
                    System.out.println(
                            Thread.currentThread().getName() + "通过柜台汇款了" + STORAGE_MOEY + "元，账户余额为：" + bank.getMoney());
                }
            } else if ("用户B".equals(Thread.currentThread().getName())) {
                synchronized (bank) {
                    if (!(bank.getMoney() - GET_MONEY <= 0)) {

                        bank.withdrawMoney(GET_MONEY);
                        System.out.println(Thread.currentThread().getName() + "通过ATM机取款了" + GET_MONEY + "元，账户余额为："
                                + bank.getMoney());
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("账户余额不足");
                        break;
                    }
                }
            } else {
                System.out.println("用户错误");
                break;
            }
            count++;
        }
    }

}