package cn.maidaotech.java07.chapter07;


public class Profiler {
    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>();

    public static final void set() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static final long get() {
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }
    
}
