package cn.maidaotech.java07.syncaddlock.chapter07.test;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Long now = System.currentTimeMillis();

        ThreadLocal<Long> threadLocal = new ThreadLocal<>();

        MyInterceptor myInterceptor = new MyInterceptor(threadLocal);

        MyService myService = new MyService(threadLocal);

        myInterceptor.setThreadLocal(now);

        Long  value =  myService.getFromLocal();
        System.out.println(now.equals(value));
        System.out.println(now);
        System.out.println(value);
    }
}
