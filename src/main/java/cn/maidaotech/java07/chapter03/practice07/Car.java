package cn.maidaotech.javaedu.chapter03.practice07;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("小汽车启动了。。。");
    }

    @Override
    public void stop() {
        System.out.println("小汽车停下了。。。");
    }
}