package cn.maidaotech.java07.ch03;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car=new Car();
        Vehicle bus=new Bus();
        car.start();
        car.stop();
        bus.start();
        bus.stop();
    }
}
