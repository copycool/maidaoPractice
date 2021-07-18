package cn.maidaotech.java07.chapter03;

public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("小汽车走了");
    }
    @Override
    public void stop(){
        System.out.println("小汽车听了");
    }

    
    
}