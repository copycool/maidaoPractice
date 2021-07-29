package cn.maidaotech.java07.chapter07.answer.exercise10;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            tickets.add(new Ticket());
        }
        Platform platform1 = new Platform(tickets);
        Platform platform2 = new Platform(tickets);
        Platform platform3 = new Platform(tickets);
        // 创建一个线程池
        ExecutorService service = Executors.newCachedThreadPool();
        //platform1的任务放入线程池 去执行任务
        service.execute(platform1);
        service.execute(platform2);
        service.execute(platform3);
        //销毁线程和线程池
        service.shutdown();

    }
}
