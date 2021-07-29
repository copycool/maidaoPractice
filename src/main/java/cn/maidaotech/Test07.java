package cn.maidaotech.java07.unit6;

public class Test07 implements Runnable {
    int count = 0;

    public static void main(String[] args) {
        Test07 test07 = new Test07();
        for (int i = 0; i < 5; i++) {
            new Thread(test07).start();
        }
    }

    @Override
    public void run() {
        while (count < 1000) {
            synchronized (Test07.class) {
                if (count < 1000) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + "运算到--->" + count);
                }

            }
        }

    }

}