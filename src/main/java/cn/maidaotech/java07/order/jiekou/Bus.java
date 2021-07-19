package cn.maidaotech.java07.order.jiekou;


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

