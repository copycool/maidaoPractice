package cn.maidaotech.java07.work2.Vehicle;

public class VehicleDemoTest {
    public static void main(String[] args) {
        Vehicle vehCar = new CarImpl();
        Vehicle vehBus = new BusImpl();
        vehCar.start();
        vehCar.stop();
        vehBus.start();
        vehBus.stop();
    }
}