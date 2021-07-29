package cn.maidaotech.java07.chapter6.question10;

//三个窗口同时出售100张票：
//票抽象为类
//拥有票号等属性站台抽象为线程类同一张票不能重复销售
public class TicketSell implements Runnable {
    // 票数
    private static int ticketNumber = 100;

    @Override
    public void run() {
        while (true)
            if (ticketNumber > 0) {
                try {
                    synchronized (TicketSell.class) {

                        System.out.println(Thread.currentThread().getName() + "售出了第" + (101 - ticketNumber--) + "张票");
                    }
                    Thread.sleep(150);
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }

    }

}