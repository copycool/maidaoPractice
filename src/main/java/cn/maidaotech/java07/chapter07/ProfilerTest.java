package cn.maidaotech.java07.chapter07;

import java.util.concurrent.TimeUnit;

public class ProfilerTest {
    public static void main(String[] args) throws Exception {
        Profiler.set();
        TimeUnit.SECONDS.sleep(1);
        method();
    }

    private static void method() {
        System.out.println("Cost: " + Profiler.get() + " mills");
    }
}
