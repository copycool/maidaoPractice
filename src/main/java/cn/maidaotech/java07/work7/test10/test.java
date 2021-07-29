package cn.maidaotech.java07.work7.test10;


import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class test {
    public static void main(String[] args) {
       
        List<Ticket> list1 = new LinkedList<>();
        for (int  i = 0; i < 100; i++) {
            list1.add(new Ticket());
        }
        // System.out.println(list1);
        // System.out.println(list1.size());

        Platform platform = new Platform(list1);
        Thread t1 = new Thread(platform);
        Thread t2 = new Thread(platform);
        Thread t3 = new Thread(platform);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(t1);
        service.execute(t2);
        service.execute(t3);
        service.shutdown();

        // t1.start();
        // t2.start();
        // t3.start();


    }
}
