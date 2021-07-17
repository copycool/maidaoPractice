package cn.maidaotech.chapter03.exampletest;

import cn.maidaotech.chapter03.example.vecicle.Bus;
import cn.maidaotech.chapter03.example.vecicle.Car;
public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();
        bus.start();
        bus.stop();
        car.start();
        car.stop();
    }
}