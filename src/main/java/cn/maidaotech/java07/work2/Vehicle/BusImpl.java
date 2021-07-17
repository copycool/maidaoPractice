package cn.maidaotech.java07.work2.Vehicle;

public class BusImpl implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus被Start调用");

    }

    @Override
    public void stop() {
        System.out.println("Bus被Stop调用");

    }

}