package cn.maidaotech.java07.chaptet03;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car =new Car();
        Vehicle bus =new Car();
        car.start();
        car.stop();
        bus.start();
        bus.stop();
    }
}