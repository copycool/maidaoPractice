package cn.maidaotech.java07.work2.Vehicle;

/**
 * 创建交通工具接口Vehicle， 接口中定义start()和stop()方法，在两个分别Car和Bus的类中实现Vehicle接口
 * 创建一个名为VehicleDemo的类，并编写main函数分别创建 变量类型为Vehicle的Car和Bus对象，并分别访问两个方法。
 */
public interface Vehicle {

    void start();

    void stop();
}