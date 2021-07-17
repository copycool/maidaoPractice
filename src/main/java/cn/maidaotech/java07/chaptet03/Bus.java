package cn.maidaotech.java07.chaptet03;

public class Bus implements Vehicle {
    

    @Override
    public void stop() {
        
        System.out.println("BusStop");

    }

    @Override
    public void start() {
        System.out.println("BusStart");

    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}