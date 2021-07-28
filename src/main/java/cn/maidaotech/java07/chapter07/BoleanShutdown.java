package cn.maidaotech.java07.chapter07;

public class BoleanShutdown {
    private static class Runner implements Runnable{
        private volatile boolean flag = true;
        private Integer i;

        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            
        }
        
    }
}
