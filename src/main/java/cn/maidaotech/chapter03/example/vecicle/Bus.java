package cn.maidaotech.chapter03.example.vecicle;

public class Bus implements Vehicle {
    // 这里会提示需要主体不要分号
    @Override
    public void start() {
        System.out.println("公交车启动了");
    }
    @Override
    public void stop() {
        System.out.println("公交车停止了");
    }
}