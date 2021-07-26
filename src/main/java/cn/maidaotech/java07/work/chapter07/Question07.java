package cn.maidaotech.java07.work.chapter07;

public class Question07 {
    public static void main(String[] args) {
        MyThread07 thread07 = new MyThread07();

        for (int i = 0; i < 5; i++) {
            new Thread(thread07).start();
        }
    }
}
class MyThread07 implements Runnable{
    private Integer count = 0;
    @Override
    public void run() {
        while (count < 1000){
            count++;
        }
        System.out.println("count===>" + count);
    }
}