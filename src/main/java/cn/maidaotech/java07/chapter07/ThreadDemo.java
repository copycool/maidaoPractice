package cn.maidaotech.java07.chapter07;

public class ThreadDemo extends Thread {

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();
        System.out.println("运行结束！");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "===ThreadDemo");
    }

}
