package cn.maidaotech.java07.chapter07.practice08;

public class TreadA implements Runnable{
    private Object a;
    private Object b;

    public TreadA(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try  {
            synchronized(a){
                System.out.println(Thread.currentThread().getName() + "拿到a锁");
                Thread.sleep(1000);
                synchronized(b){
                    System.out.println(Thread.currentThread().getName() + "拿到b锁");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    
}