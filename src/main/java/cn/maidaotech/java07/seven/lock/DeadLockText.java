package cn.maidaotech.java07.seven.lock;

public class DeadLockText {
    public static void main(String[] args) { 
    DeadLock d1=new DeadLock();  
    DeadLock d2=new DeadLock();
    d1.flag=1;
    d2.flag=2;
    Thread thread1=new Thread(d1);
    Thread thread2=new Thread(d2);
    thread1.start();
    thread2.start();
    }
}
