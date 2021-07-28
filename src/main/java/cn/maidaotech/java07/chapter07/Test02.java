package cn.maidaotech.java07.chapter07;

public class Test02 {
    public static void main(String[] args) {
        MyThread02 myThread02 = new MyThread02();
        myThread02.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
            int time = (int) (Math.random() * 100);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}