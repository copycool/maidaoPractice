package cn.maidaotech.chapter03.example;

public class Car implements Vehicle {
    // 这里会提示需要主体不要分号
    public void start() {
        System.out.println("小汽车启动了");
    }

    public void stop() {
        System.out.println("小汽车停下了");
    }
}