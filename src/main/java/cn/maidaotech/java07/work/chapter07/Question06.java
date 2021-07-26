package cn.maidaotech.java07.work.chapter07;

public class Question06 implements Runnable {
    private Integer i = 0;
    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            i++;
        }
        System.out.println(Thread.currentThread().getName()+ "--i的結果為:"+i);
    }
}
class Test06{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Question06()).start();
        }
    }
}
