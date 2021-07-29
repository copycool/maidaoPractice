package cn.maidaotech.java07.chapter07.example07;

public class BoleanShutdown {
    public static void main(String[] args)throws Exception {
        Runner r1 = new Runner(0);
        Thread thread = new Thread(r1);
        thread.start();
        Thread.sleep(200);
        r1.cancel();

    }
    private static class Runner implements Runnable {
        private volatile boolean flag = true;
        private Integer i;

        public Runner(Integer i) {
            super();
            this.i = i;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (flag) {
                try {
                    System.out.println(i++);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void cancel() {
            this.flag = false;
        }

    }
}
