package cn.maidaotech.java07.chapter3.question7;

public class Car implements Vehicle{

    @Override
    public void start(String car) {
        
        System.out.println("汽车启动");

    }

    @Override
    public void stop(String cars) {
        
        System.out.println("汽车停止");

    }
    
}