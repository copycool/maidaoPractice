package cn.maidaotech.java07.chapter07.Practice09;

// join方法完成顺序输出
public class JoinDemo {
    private class Runner implements Runnable {

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + "运行");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo test = new JoinDemo();
        Thread thread1 = new Thread(test.new Runner(), "线程一");
        Thread thread2 = new Thread(test.new Runner(), "线程二");
        Thread thread3 = new Thread(test.new Runner(), "线程三");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println("main end");

    }
}
