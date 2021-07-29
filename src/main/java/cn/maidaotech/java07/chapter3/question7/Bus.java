package cn.maidaotech.java07.chapter3.question7;

public class Bus implements Vehicle {

    @Override
    public void start(String car) {

        System.out.println("公交车起步");

    }

    @Override
    public void stop(String cars) {

        System.out.println("公交车停车");

    }

}