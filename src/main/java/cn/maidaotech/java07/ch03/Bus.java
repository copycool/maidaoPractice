package cn.maidaotech.java07.ch03;

public class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.println("BusStart");
        
    }

    @Override
    public void stop() {
        System.out.println("BusStop");
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
