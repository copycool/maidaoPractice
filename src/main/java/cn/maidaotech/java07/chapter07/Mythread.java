package cn.maidaotech.java07.chapter07;

public class Mythread extends Thread {
    //重写父类run方法
    @Override
    public void  run(){
        super.run();
        System.out.println("子线程打印的内容");
    }
}