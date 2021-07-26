package cn.maidaotech.java07.syncaddlock.chapter07.test;

import java.util.concurrent.TimeUnit;

public class Profiler {

    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>();

    protected Long initialValue(){
        return System.currentTimeMillis();
    }

    public static final void begin(){
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static final Long end(){
        return System.currentTimeMillis()-TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(Profiler.end());
    }
}
