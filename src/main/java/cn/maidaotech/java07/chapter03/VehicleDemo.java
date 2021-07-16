package cn.maidaotech.java07.chapter03;

public class VehicleDemo {
    // 创建一个名为VehicleDemo的类，并编写main函数分别创建变量类型为Vehicle的Car和Bus对象，并分别访问两个方法
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();

        car.start();
        car.stop();

        bus.start();
        bus.stop();
    }
}