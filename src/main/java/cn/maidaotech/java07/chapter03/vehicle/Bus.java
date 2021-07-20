package cn.maidaotech.java07.chapter03.vehicle;

public class Bus implements Vehicle {

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public String start() {
        return ("Busstart");
    }

    @Override
    public String stop() {
        return ("Busstop");
    }
}
