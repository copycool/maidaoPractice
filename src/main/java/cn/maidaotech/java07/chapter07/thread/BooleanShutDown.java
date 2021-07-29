package cn.maidaotech.java07.chapter07.thread;

public class BooleanShutDown {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner(0);
        Thread thread = new Thread();
        thread.start();
        Thread.sleep(200);
        runner.cancel();
    }

    public static class Runner implements Runnable {
        private volatile boolean flag = true;
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
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
        public void cancel(){
            this.flag = false;
        }
    }
}