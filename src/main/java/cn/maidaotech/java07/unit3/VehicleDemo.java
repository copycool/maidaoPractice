package cn.maidaotech.java07.unit3;

public class VehicleDemo{
    public static void main(String[] args) {
        Vehicle bus=new Bus();
        Vehicle car =new Car();
        bus.start();
        bus.stop();
        car.start();
        car.stop();
    }
}