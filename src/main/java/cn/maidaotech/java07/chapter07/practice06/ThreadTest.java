package cn.maidaotech.java07.chapter07.practice06;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data(0);

        NumberThread thread1 = new NumberThread(data);
        NumberThread thread2 = new NumberThread(data);
        NumberThread thread3 = new NumberThread(data);
        NumberThread thread4 = new NumberThread(data);
        NumberThread thread5 = new NumberThread(data);
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
        System.out.println(data.getI());
    }
}
