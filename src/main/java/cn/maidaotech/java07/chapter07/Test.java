package cn.maidaotech.java07.chapter07;

public class Test {
    public static void main(String[] args) {
        System.out.println("jvm启动main线程，main线程启动main方法");
        //创建子线程对象
        Mythread mythread = new Mythread();
        //启动线程
        mythread.start(); //新开启的线程会调用run方法

        System.out.println("111");

    }
}