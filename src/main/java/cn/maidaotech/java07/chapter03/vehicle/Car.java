package cn.maidaotech.java07.chapter03.vehicle;

public class Car implements Vehicle{
    public void start(){
        System.out.println("小汽车开跑了");
    }
    public void stop(){
        System.out.println("小汽车抛锚了");
    }
}