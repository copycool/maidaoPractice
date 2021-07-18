package cn.maidaotech.java07.ch03;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("CarStart");
    }

   

    @Override
    public void stop() {
        System.out.println("CarStop");
        
    }


    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
