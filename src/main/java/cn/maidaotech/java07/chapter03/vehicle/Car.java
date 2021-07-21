package cn.maidaotech.java07.chapter03.vehicle;

public class Car implements Vehicle {

    @Override
    public String toString() {
    
        return super.toString();
    }

    @Override
    public String start() {
        return ("Carstart");
        

    }

    @Override
    public String stop() {
        return ("Carstop");
    

    }

}
