package cn.maidaotech.java07.order.jiekou;

public interface Vehicle {
    void start();

    void stop();
}
// 创建交通工具接口 Vehicle，接口中定义 start()和 stop()方法，
// 在两个分别 Car 和 Bus 的类中实现 Vehicle 接口。创建一个名为 VehicleDemo 的类，
// 并编写 main 函数创建 Car 和 Bus 对象，并访问 两个方法。
