package cn.maidaotech.java07.chapter07.seatwork;

import java.util.concurrent.TimeUnit;

public class ProfilerTest {
    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Cost: " + Profiler.end() + " mills");
        method();
    }

    private static void method() {
        System.out.println("Cost:"+ Profiler.end());
    }
    
}
