package cn.maidaotech.java07.chapter07;

public class Test {

    public static void main(String[] args) throws Exception {
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Domino(previous), "thread" + String.valueOf(i));
            thread.start();
            previous = thread;
        }
        System.out.println(Thread.currentThread().getName() + " terminate.");
    }

    static class Domino implements Runnable {
        private Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + "begin");
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " terminate.");
        }
    }
}