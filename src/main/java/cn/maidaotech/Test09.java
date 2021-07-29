package cn.maidaotech.java07.unit6;

public class Test09 {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName() + " begin");
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Domino(previous), "T" + String.valueOf(i));
            thread.start();
            previous = thread;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " terminate.");
    }
    public static class Domino implements Runnable {
        private Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }
        public Domino() {
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "开始");
            
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }
}