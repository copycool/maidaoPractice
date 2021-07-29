package cn.maidaotech.java07.chapter07.sync;

public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }

    @Override
    public void run(){
        numRef.addI("b");
    }
}