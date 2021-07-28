package cn.maidaotech.java07.chapter07.thread.waitNotify;

public class WaitNotify {
    private static class MyThread1 extends Thread{
        private Object object;

        public MyThread1(Object o){
            super();
            this.object = o;
        }

        @Override
        public void run(){
            synchronized(object){
                System.out.println();
            }
        }
    }
}