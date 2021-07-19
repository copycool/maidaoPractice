package cn.maidaotech.java07.chapter03.vehicle;

public class Car implements Vehicle{
    
    

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("开始");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("结束");
    }
}