package cn.maidaotech.java07.chapter07.example07;

public class WaitNotifyDemo {
    private static class MyThread1 extends Thread {
        private Object object;

        public MyThread1(Object o) {
            super();
            this.object = o;
        }

        @Override
        public void run() {
            try {
                synchronized (object) {
                    System.out.println("begin wait time = " + System.currentTimeMillis());
                    object.wait();
                    System.out.println("end wait time = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class MyThread2 extends Thread {
        private Object object;

        public MyThread2(Object o) {
            super();
            this.object = o;
        }

        @Override
        public void run() {
            synchronized (object) {
                System.out.println("begin notify time = " + System.currentTimeMillis());
                object.notify();
                System.out.println("end notify time = " + System.currentTimeMillis());
            }
        }
    }

    public static void main(String[] args) {
        try {
            Object object = new Object();
            MyThread1 t1 = new MyThread1(object);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(object);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
