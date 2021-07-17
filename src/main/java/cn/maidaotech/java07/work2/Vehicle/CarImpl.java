package cn.maidaotech.java07.work2.Vehicle;

public class CarImpl implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car被Start调用");
    }

    @Override
    public void stop() {
        System.out.println("Car被Stop调用");

    }

}