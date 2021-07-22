package com.example.three.vehicle;

public class Bus implements Vehicle{
    public Bus (){

    }
    @Override
    public void start() {
        System.out.println("大巴车行驶");
    }
    @Override
    public void stop() {
        System.out.println("大巴车停下来");
    }
    
}