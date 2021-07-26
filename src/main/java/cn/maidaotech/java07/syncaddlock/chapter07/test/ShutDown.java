package cn.maidaotech.java07.syncaddlock.chapter07.test;


public class ShutDown {
    public static void main(String[] args) throws InterruptedException {
        Runner one = new Runner();
        Thread thread = new Thread(one,"one");
        thread.start();
        //睡眠 100 毫秒，确保线程 countThread 处于运行状态
//        thread.wait(1000);  //Exception in thread "main" java.lang.IllegalMonitorStateException
        Thread.sleep(200);
        one.cancle();
    }
}


class  Runner implements Runnable{
    private volatile Boolean flag = true;
    private  long i = 0;
    @Override
    public void run() {
        while (flag){
            try {
                System.out.println(i++); Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(i);
    }

    public void cancle(){
        System.out.println("终止线程");
        this.flag = false;
    }
}