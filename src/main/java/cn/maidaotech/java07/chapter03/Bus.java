package cn.maidaotech.java07.chapter03;

public class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.println("开始");
    }

    @Override
    public void stop() {
            System.out.println("结束");
    }
    
}