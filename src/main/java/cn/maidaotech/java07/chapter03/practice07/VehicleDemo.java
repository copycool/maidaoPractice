package cn.maidaotech.java07.chapter03.practice07;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle bus = new Bus();
        bus.start();
        bus.stop();
    }
}