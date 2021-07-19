package cn.maidaotech.java07.chapter03.vehicle;

public interface Vehicle {
    //创建交通工具接口Vehicle，接口中定义start()和stop()方法，在两个分别为Car和Bus的类中实现Vehicle接口。
    public abstract void start();
    public abstract void stop();
}