package cn.maidaotech.java07.chapter03;

public class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.println("公共汽车开始");
        
    }

    @Override
    public void stop() {
        System.out.println("公共汽车结束");
        
    }
    
}
