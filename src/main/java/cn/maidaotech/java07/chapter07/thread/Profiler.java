package cn.maidaotech.java07.chapter07.thread;

import java.util.concurrent.TimeUnit;

public class Profiler {
    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("用时"+Profiler.end()+"毫秒");
    }
    private static final ThreadLocal<Long> TIM_THREAD_LOCAL = new ThreadLocal<Long>();

    public static final void begin(){
        TIM_THREAD_LOCAL.set(System.currentTimeMillis());
    }

    public static final long end(){
        return System.currentTimeMillis()-TIM_THREAD_LOCAL.get();
    }
}