package cn.maidaotech.java07.unit6.Test10;
import java.util.List;

    public class Window implements Runnable {
        private List<Ticket> tickets;
        private int count = 0;  

        public Window(List<Ticket> tickets) {
            this.tickets = tickets;
        }
        @Override
        public void run() {
            while (true) {
                if (tickets.isEmpty()) {
                    break;
                }
                synchronized (tickets) {
                    if (!tickets.isEmpty()) {
                        Ticket ticket = tickets.remove(0);
                        System.out.println(Thread.currentThread().getName() + "出售了:" + ticket.getNumber()+"号票");
                        count++;
                    }
                }
                try {
                   Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "共出售:" + (count) + "张票");
        }

    }
