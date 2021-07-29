package cn.maidaotech.chapter07.example10;

public class WindowsSimpleDemo {
    public static void main(String[] args) {
        Runner test = new Runner();
        Thread t1 = new Thread(test,"站台一");
        Thread t2 = new Thread(test,"站台一");
        Thread t3 = new Thread(test,"站台三");
        t1.start();
        t2.start();
        t3.start();
    }
    private static class Runner implements Runnable {
        private volatile static Integer ticketcount = 100;
        @Override
        public void run() {
            while (ticketcount > 0) {
                synchronized (WindowsSimpleDemo.class) {
                    if (ticketcount > 0) {
                        System.out.println(Thread.currentThread().getName() + "售出了第" +ticketcount-- + "张票");
                    }
                }
            }
        }
}
}