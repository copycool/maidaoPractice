package cn.maidaotech.java07.demo;

import cn.maidaotech.java07.chapter03.Bus;
import cn.maidaotech.java07.chapter03.Car;
import cn.maidaotech.java07.chapter03.Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        car.start();
        car.stop();
        bus.start();
        bus.stop();
    }
}
