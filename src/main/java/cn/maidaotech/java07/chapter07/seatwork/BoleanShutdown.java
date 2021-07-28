package cn.maidaotech.java07.chapter07.seatwork;

public class BoleanShutdown {
    public static void main(String[] args) throws InterruptedException {
        Runner run = new Runner(0);
        Thread thread = new Thread(run);
        thread.start();
        Thread.sleep(200);
        run.cancel();
    }
}
