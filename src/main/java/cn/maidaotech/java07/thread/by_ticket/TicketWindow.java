package cn.maidaotech.java07.thread.by_ticket;

import java.util.List;
import org.springframework.util.CollectionUtils;

public class TicketWindow implements Runnable {
    private List<Ticket> list;
    // 计数器
    private int count = 0;

    public TicketWindow() {

    }

    public TicketWindow(List<Ticket> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (CollectionUtils.isEmpty(list)) {
                break;
            }
            synchronized (list) {

                if (!CollectionUtils.isEmpty(list)) {
                    Ticket tickets = list.remove(0);
                    System.out.println(
                            Thread.currentThread().getName() + "卖出了第" + count + "张票 <票号：" + tickets.getNum() + ">");
                    count++;

                    // 实现多窗口均衡
                    if (count > list.size() / 2) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ;
                    }
                }

            }
        }
        System.out.println(Thread.currentThread().getName() + "共出售：" + count + "张票");

    }
}