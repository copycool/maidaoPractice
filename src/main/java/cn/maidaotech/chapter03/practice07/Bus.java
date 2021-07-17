package cn.maidaotech.chapter03.practice07;

public class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("公共汽车启动");
        
    }
    @Override
    public void stop() {
       System.out.println("公共汽车停下");
    }
}