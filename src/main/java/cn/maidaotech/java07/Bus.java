package cn.maidaotech.java07;

public class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.println("公共汽车启动了!");
        
    }

    @Override
    public void stop() {
        System.out.println("公共汽车停止了!");

    }

    
}