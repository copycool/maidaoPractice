package cn.maidaotech.java07.chapter07.instance.synch.threadsecurity;

public class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;    
    public ThreadA(HasSelfPrivateNum numRef) {        
        this.numRef = numRef;    
    }    
    @Override    
    public void run() {        
        numRef.addI("a");    
    }
}