package cn.maidaotech.chapter03.practice07;

public class Car implements Vehicle {
    @Override
    public void start() {
       System.out.println("小汽车开启");
        
    }
    @Override
    public void stop() {
        System.out.println("小汽车停下");
        
    }
}