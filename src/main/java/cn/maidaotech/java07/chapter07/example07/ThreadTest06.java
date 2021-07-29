package cn.maidaotech.java07.chapter07.example07;

public class ThreadTest06 {
    private int count = 0;

    public static void main(String[] args) throws InterruptedException {
        ThreadTest06 test = new ThreadTest06();
        NumberThread thread1 = test.new NumberThread();
        NumberThread thread2 = test.new NumberThread();
        NumberThread thread3 = test.new NumberThread();
        NumberThread thread4 = test.new NumberThread();
        NumberThread thread5 = test.new NumberThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        System.out.println(test.count);
    }

    public class NumberThread extends Thread {

        @Override
        public void run() {
            for (int j = 0; j < 1000; j++) {
                count++;
            }
            System.out.println(Thread.currentThread().getName()+">>>"+count);
        }
    }

}
