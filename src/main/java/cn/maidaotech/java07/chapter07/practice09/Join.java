package cn.maidaotech.java07.chapter07.practice09;

public class Join {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName() + " begin");
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Domino(previous), "T" + String.valueOf(i + 1));
            thread.start();
            previous = thread;
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

    static class Domino implements Runnable {
        private Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " begin");
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }
    }
}
