package cn.maidaotech.java07.unit6;

public class BoleanShutdown {
    public static void main(String[] args) throws InterruptedException {
         Runner runner=new Runner(0);
         Thread thread=new Thread(runner);
         thread.start();
         thread.sleep(2000);
         runner.cancle();

    }

    public static class Runner implements Runnable {
        private boolean flag = true;
        private Integer i;

        public Runner(Integer i) {
            super();
            this.i = i;
        }

        @Override
        public void run() {
            while (flag) {
                try {
                    System.out.println(i++);
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