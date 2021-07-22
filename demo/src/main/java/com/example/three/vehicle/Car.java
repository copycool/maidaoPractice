package com.example.three.vehicle;

public class Car implements Vehicle {
    public Car(){
        
    }
    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("小汽车行驶");
    }
    @Override
    public void stop() {
        System.out.println("小汽车停下来");
    }
}