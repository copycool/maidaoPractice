package cn.maidaotech.java07.chapter07.test08;

public class DeadMain {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Dead(true));
        Thread th2 = new Thread(new Dead(false));
        th1.start();
        th2.start();

        // Thread th1 = new Thread(new Dea(true));
        // Thread th2 = new Thread(new Dea(false));
        // th1.start();
        // th2.start();
    }
}
