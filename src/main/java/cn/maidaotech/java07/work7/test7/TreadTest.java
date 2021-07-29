package cn.maidaotech.java07.work7.test7;

public class TreadTest implements Runnable {
    private Integer count = 0, i = 0;

    public static void main(String[] args) {
       
        TreadTest ru = new TreadTest();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(ru);
            thread.start();
        }
    }

    @Override
    public void run() {

        while (true) {
            // 锁住的是同一对象
             synchronized (this)
            {
                if (count >= 1000) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ":count:" + (++count));
                // 测试时，线程更容易切换
                Thread.yield();
            }
            // TODO Auto-generated method stub
        }

    }
}