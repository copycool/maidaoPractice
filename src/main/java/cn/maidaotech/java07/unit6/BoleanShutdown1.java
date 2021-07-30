package cn.maidaotech.java07.unit6;

public class BoleanShutdown1 {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner(1);
        new Thread(runner).start();
        Thread.sleep(3000);
        runner.cancle();
    }

    public static class Runner implements Runnable {
        private boolean flag = true;
        private Integer i;

        public Runner(Integer i) {
            this.i = i;
        }

        @Override
        public void run() {
            while (flag) {
                System.out.println(i++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        public void cancle() {
            this.flag = false;
        }

    }
}