package cn.maidaotech.java07.third.Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car =new Car();
        car.start();
        car.stop();
        Vehicle bus=new Bus();
        bus.start();
        bus.stop();
    }
}

