package cn.maidaotech.java07.chapter07.test09;

public class Test {
    public static void main(String[] args){
        Thread temp = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            Thread myThread = new Thread(new MyThread(temp));
            myThread.start();
            temp = myThread;
    }
    System.out.println(Thread.currentThread().getName()+"end");
}
}
