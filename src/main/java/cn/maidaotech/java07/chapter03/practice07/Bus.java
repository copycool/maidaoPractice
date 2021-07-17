package cn.maidaotech.java07.chapter03.practice07;

public class Bus  implements Vehicle{
    @Override
    public void start() {
        System.out.println("公交车进站了。。。");
    }

    @Override
    public void stop() {
        System.out.println("公交车出站了。。。");
    }
}